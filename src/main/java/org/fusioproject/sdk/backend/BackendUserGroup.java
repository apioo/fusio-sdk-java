/**
 * BackendUserGroup automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk.backend;

import app.sdkgen.client.ResourceAbstract;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.client.HttpClient;

public class BackendUserGroup extends ResourceAbstract {
    public BackendUserGroup(String baseUrl, HttpClient httpClient, ObjectMapper objectMapper) {
        super(baseUrl, httpClient, objectMapper);
    }

    /**
     * Endpoint: /backend/user/$user_id<[0-9]+>
     */
    public BackendUserByUserIdResource getBackendUserByUserId(String user_id) {
        return new BackendUserByUserIdResource(
            user_id,
            this.baseUrl,
            this.httpClient
        );
    }

    /**
     * Endpoint: /backend/user
     */
    public BackendUserResource getBackendUser() {
        return new BackendUserResource(
            this.baseUrl,
            this.httpClient
        );
    }

}