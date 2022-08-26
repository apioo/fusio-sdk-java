/**
 * BackendPlanResource automatically generated by SDKgen please do not edit this file manually
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

public class BackendPlanResource extends ResourceAbstract {
    private final String url;
    private final HttpClient httpClient;
    private final ObjectMapper objectMapper;


    public BackendPlanResource(String baseUrl, HttpClient httpClient, ObjectMapper objectMapper) {
        super(baseUrl, httpClient, objectMapper);


        this.url = baseUrl + "/backend/plan";
        this.httpClient = httpClient;
        this.objectMapper = objectMapper;
    }

    public BackendPlanResource(String baseUrl, HttpClient httpClient) {
        this(baseUrl, httpClient, new ObjectMapper());
    }

    public Plan_Collection backendActionPlanGetAll(Collection_Query query) throws URISyntaxException, IOException {
        URIBuilder builder = new URIBuilder(this.url);

        Map<String, Object> params = this.objectMapper.convertValue(obj, Map.class);
        for(Map.Entry<String, Object> entry : params.entrySet()) {
            builder.setParameter(entry.getKey(), entry.getValue().toString());
        }

        HttpGet request = new HttpGet(builder.build());

        HttpResponse response = this.httpClient.execute(request);

        return this.objectMapper.readValue(EntityUtils.toString(response.getEntity(), "UTF-8"), Plan_Collection.class);
    }

    public Message backendActionPlanCreate(Plan_Create data) throws URISyntaxException, IOException {
        URIBuilder builder = new URIBuilder(this.url);


        HttpPost request = new HttpPost(builder.build());
        request.addHeader("Content-Type", "application/json");
        request.setEntity(new StringEntity(this.objectMapper.writeValueAsString(data), ContentType.APPLICATION_JSON));

        HttpResponse response = this.httpClient.execute(request);

        return this.objectMapper.readValue(EntityUtils.toString(response.getEntity(), "UTF-8"), Message.class);
    }

}
