/**
 * BackendAccountGroup automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk.backend;

import app.sdkgen.client.ResourceAbstract;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.client.HttpClient;

public class BackendAccountGroup extends ResourceAbstract {
    public BackendAccountGroup(String baseUrl, HttpClient httpClient, ObjectMapper objectMapper) {
        super(baseUrl, httpClient, objectMapper);
    }

    /**
     * Endpoint: /backend/account/change_password
     */
    public BackendAccountChangePasswordResource getBackendAccountChangePassword() {
        return new BackendAccountChangePasswordResource(
            this.baseUrl,
            this.httpClient
        );
    }

    /**
     * Endpoint: /backend/account
     */
    public BackendAccountResource getBackendAccount() {
        return new BackendAccountResource(
            this.baseUrl,
            this.httpClient
        );
    }

}