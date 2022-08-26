/**
 * ConsumerLogResource automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk.consumer;

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

public class ConsumerLogResource extends ResourceAbstract {
    private final String url;
    private final HttpClient httpClient;
    private final ObjectMapper objectMapper;


    public ConsumerLogResource(String baseUrl, HttpClient httpClient, ObjectMapper objectMapper) {
        super(baseUrl, httpClient, objectMapper);


        this.url = baseUrl + "/consumer/log";
        this.httpClient = httpClient;
        this.objectMapper = objectMapper;
    }

    public ConsumerLogResource(String baseUrl, HttpClient httpClient) {
        this(baseUrl, httpClient, new ObjectMapper());
    }

    public Log_Collection consumerActionLogGetAll(Collection_Query query) throws URISyntaxException, IOException {
        URIBuilder builder = new URIBuilder(this.url);

        Map<String, Object> params = this.objectMapper.convertValue(query, Map.class);
        for(Map.Entry<String, Object> entry : params.entrySet()) {
            builder.setParameter(entry.getKey(), entry.getValue().toString());
        }

        HttpGet request = new HttpGet(builder.build());

        HttpResponse response = this.httpClient.execute(request);

        return this.objectMapper.readValue(EntityUtils.toString(response.getEntity(), "UTF-8"), Log_Collection.class);
    }

}
