/**
 * BackendRoleGroup automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk.backend;

import app.sdkgen.client.ResourceAbstract;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.client.HttpClient;

public class BackendRoleGroup extends ResourceAbstract {
    public BackendRoleGroup(String baseUrl, HttpClient httpClient, ObjectMapper objectMapper) {
        super(baseUrl, httpClient, objectMapper);
    }

    /**
     * Endpoint: /backend/role/$role_id<[0-9]+|^~>
     */
    public BackendRoleByRoleIdResource getBackendRoleByRoleId(String role_id) {
        return new BackendRoleByRoleIdResource(
            role_id,
            this.baseUrl,
            this.httpClient
        );
    }

    /**
     * Endpoint: /backend/role
     */
    public BackendRoleResource getBackendRole() {
        return new BackendRoleResource(
            this.baseUrl,
            this.httpClient
        );
    }

}