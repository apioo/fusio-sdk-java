/**
 * BackendRoleByRoleIdResource automatically generated by SDKgen please do not edit this file manually
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

public class BackendRoleByRoleIdResource extends ResourceAbstract {
    private final String url;
    private final HttpClient httpClient;
    private final ObjectMapper objectMapper;

    private final String roleId;

    public BackendRoleByRoleIdResource(String roleId, String baseUrl, HttpClient httpClient, ObjectMapper objectMapper) {
        super(baseUrl, httpClient, objectMapper);

        this.roleId = roleId;

        this.url = baseUrl + "/backend/role/"+roleId+"";
        this.httpClient = httpClient;
        this.objectMapper = objectMapper;
    }

    public BackendRoleByRoleIdResource(String roleId, String baseUrl, HttpClient httpClient) {
        this(roleId, baseUrl, httpClient, new ObjectMapper());
    }

    public Role backendActionRoleGet() throws URISyntaxException, IOException {
        URIBuilder builder = new URIBuilder(this.url);


        HttpGet request = new HttpGet(builder.build());

        HttpResponse response = this.httpClient.execute(request);

        return this.objectMapper.readValue(EntityUtils.toString(response.getEntity(), "UTF-8"), Role.class);
    }

    public Message backendActionRoleUpdate(RoleUpdate data) throws URISyntaxException, IOException {
        URIBuilder builder = new URIBuilder(this.url);


        HttpPut request = new HttpPut(builder.build());
        request.addHeader("Content-Type", "application/json");
        request.setEntity(new StringEntity(this.objectMapper.writeValueAsString(data), ContentType.APPLICATION_JSON));

        HttpResponse response = this.httpClient.execute(request);

        return this.objectMapper.readValue(EntityUtils.toString(response.getEntity(), "UTF-8"), Message.class);
    }

    public Message backendActionRoleDelete() throws URISyntaxException, IOException {
        URIBuilder builder = new URIBuilder(this.url);


        HttpDelete request = new HttpDelete(builder.build());

        HttpResponse response = this.httpClient.execute(request);

        return this.objectMapper.readValue(EntityUtils.toString(response.getEntity(), "UTF-8"), Message.class);
    }

}
