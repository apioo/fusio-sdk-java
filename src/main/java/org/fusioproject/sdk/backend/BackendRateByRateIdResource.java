/**
 * BackendRateByRateIdResource automatically generated by SDKgen please do not edit this file manually
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

public class BackendRateByRateIdResource extends ResourceAbstract {
    private final String url;
    private final HttpClient httpClient;
    private final ObjectMapper objectMapper;

    private final String rateId;

    public BackendRateByRateIdResource(String rateId, String baseUrl, HttpClient httpClient, ObjectMapper objectMapper) {
        super(baseUrl, httpClient, objectMapper);

        this.rateId = rateId;

        this.url = baseUrl + "/backend/rate/"+rateId+"";
        this.httpClient = httpClient;
        this.objectMapper = objectMapper;
    }

    public BackendRateByRateIdResource(String rateId, String baseUrl, HttpClient httpClient) {
        this(rateId, baseUrl, httpClient, new ObjectMapper());
    }

    public Rate backendActionRateGet() throws URISyntaxException, IOException {
        URIBuilder builder = new URIBuilder(this.url);


        HttpGet request = new HttpGet(builder.build());

        HttpResponse response = this.httpClient.execute(request);

        return this.objectMapper.readValue(EntityUtils.toString(response.getEntity(), "UTF-8"), Rate.class);
    }

    public Message backendActionRateUpdate(RateUpdate data) throws URISyntaxException, IOException {
        URIBuilder builder = new URIBuilder(this.url);


        HttpPut request = new HttpPut(builder.build());
        request.addHeader("Content-Type", "application/json");
        request.setEntity(new StringEntity(this.objectMapper.writeValueAsString(data), ContentType.APPLICATION_JSON));

        HttpResponse response = this.httpClient.execute(request);

        return this.objectMapper.readValue(EntityUtils.toString(response.getEntity(), "UTF-8"), Message.class);
    }

    public Message backendActionRateDelete() throws URISyntaxException, IOException {
        URIBuilder builder = new URIBuilder(this.url);


        HttpDelete request = new HttpDelete(builder.build());

        HttpResponse response = this.httpClient.execute(request);

        return this.objectMapper.readValue(EntityUtils.toString(response.getEntity(), "UTF-8"), Message.class);
    }

}
