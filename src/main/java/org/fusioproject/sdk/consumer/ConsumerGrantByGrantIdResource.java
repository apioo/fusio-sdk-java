/**
 * ConsumerGrantByGrantIdResource automatically generated by SDKgen please do not edit this file manually
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

public class ConsumerGrantByGrantIdResource extends ResourceAbstract {
    private final String url;
    private final HttpClient httpClient;
    private final ObjectMapper objectMapper;

    private final String grantId;

    public ConsumerGrantByGrantIdResource(String grantId, String baseUrl, HttpClient httpClient, ObjectMapper objectMapper) {
        super(baseUrl, httpClient, objectMapper);

        this.grantId = grantId;

        this.url = baseUrl + "/consumer/grant/"+grantId+"";
        this.httpClient = httpClient;
        this.objectMapper = objectMapper;
    }

    public ConsumerGrantByGrantIdResource(String grantId, String baseUrl, HttpClient httpClient) {
        this(grantId, baseUrl, httpClient, new ObjectMapper());
    }

    public void consumerActionGrantDelete() throws URISyntaxException, IOException {
        URIBuilder builder = new URIBuilder(this.url);


        HttpDelete request = new HttpDelete(builder.build());

        HttpResponse response = this.httpClient.execute(request);

    }

}
