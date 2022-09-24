/**
 * BackendTrashByTypeResource automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk.backend;

import app.sdkgen.client.ResourceAbstract;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.*;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Map;

public class BackendTrashByTypeResource extends ResourceAbstract {
    private final String url;
    private final HttpClient httpClient;
    private final ObjectMapper objectMapper;

    private final String type;

    public BackendTrashByTypeResource(String type, String baseUrl, HttpClient httpClient, ObjectMapper objectMapper) {
        super(baseUrl, httpClient, objectMapper);

        this.type = type;

        this.url = baseUrl + "/backend/trash/"+type+"";
        this.httpClient = httpClient;
        this.objectMapper = objectMapper;
    }

    public BackendTrashByTypeResource(String type, String baseUrl, HttpClient httpClient) {
        this(type, baseUrl, httpClient, new ObjectMapper());
    }

    public TrashDataCollection backendActionTrashGetAll(CollectionQuery query) throws URISyntaxException, IOException {
        URIBuilder builder = new URIBuilder(this.url);

        Map<String, Object> params = this.objectMapper.convertValue(query, Map.class);
        for (Map.Entry<String, Object> entry : params.entrySet()) {
            if (entry.getValue() != null) {
                builder.setParameter(entry.getKey(), entry.getValue().toString());
            }
        }

        HttpGet request = new HttpGet(builder.build());

        HttpResponse response = this.httpClient.execute(request);

        return this.objectMapper.readValue(EntityUtils.toString(response.getEntity(), "UTF-8"), TrashDataCollection.class);
    }

    public Message backendActionTrashRestore(TrashRestore data) throws URISyntaxException, IOException {
        URIBuilder builder = new URIBuilder(this.url);


        HttpPost request = new HttpPost(builder.build());
        request.addHeader("Content-Type", "application/json");
        request.setEntity(new StringEntity(this.objectMapper.writeValueAsString(data), ContentType.APPLICATION_JSON));

        HttpResponse response = this.httpClient.execute(request);

        return this.objectMapper.readValue(EntityUtils.toString(response.getEntity(), "UTF-8"), Message.class);
    }

}
