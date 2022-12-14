/**
 * BackendSchemaPreviewBySchemaIdResource automatically generated by SDKgen please do not edit this file manually
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

public class BackendSchemaPreviewBySchemaIdResource extends ResourceAbstract {
    private final String url;
    private final HttpClient httpClient;
    private final ObjectMapper objectMapper;

    private final String schemaId;

    public BackendSchemaPreviewBySchemaIdResource(String schemaId, String baseUrl, HttpClient httpClient, ObjectMapper objectMapper) {
        super(baseUrl, httpClient, objectMapper);

        this.schemaId = schemaId;

        this.url = baseUrl + "/backend/schema/preview/"+schemaId+"";
        this.httpClient = httpClient;
        this.objectMapper = objectMapper;
    }

    public BackendSchemaPreviewBySchemaIdResource(String schemaId, String baseUrl, HttpClient httpClient) {
        this(schemaId, baseUrl, httpClient, new ObjectMapper());
    }

    public SchemaPreviewResponse backendActionSchemaGetPreview() throws URISyntaxException, IOException {
        URIBuilder builder = new URIBuilder(this.url);


        HttpPost request = new HttpPost(builder.build());

        HttpResponse response = this.httpClient.execute(request);

        return this.objectMapper.readValue(EntityUtils.toString(response.getEntity(), "UTF-8"), SchemaPreviewResponse.class);
    }

}
