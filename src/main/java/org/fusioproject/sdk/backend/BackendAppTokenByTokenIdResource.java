/**
 * BackendAppTokenByTokenIdResource automatically generated by SDKgen please do not edit this file manually
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

public class BackendAppTokenByTokenIdResource extends ResourceAbstract {
    private final String url;
    private final HttpClient httpClient;
    private final ObjectMapper objectMapper;

    private final String token_id;

    public BackendAppTokenByTokenIdResource(String token_id, String baseUrl, HttpClient httpClient, ObjectMapper objectMapper) {
        super(baseUrl, httpClient, objectMapper);

        this.token_id = token_id;

        this.url = baseUrl + "/backend/app/token/"+token_id+"";
        this.httpClient = httpClient;
        this.objectMapper = objectMapper;
    }

    public BackendAppTokenByTokenIdResource(String token_id, String baseUrl, HttpClient httpClient) {
        this(token_id, baseUrl, httpClient, new ObjectMapper());
    }

    public App_Token backendActionAppTokenGet() throws URISyntaxException, IOException {
        URIBuilder builder = new URIBuilder(this.url);


        HttpGet request = new HttpGet(builder.build());

        HttpResponse response = this.httpClient.execute(request);

        return this.objectMapper.readValue(EntityUtils.toString(response.getEntity(), "UTF-8"), App_Token.class);
    }

}