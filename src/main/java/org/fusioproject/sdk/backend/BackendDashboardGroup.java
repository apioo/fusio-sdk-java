/**
 * BackendDashboardGroup automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk.backend;

import app.sdkgen.client.ResourceAbstract;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.client.HttpClient;

public class BackendDashboardGroup extends ResourceAbstract {
    public BackendDashboardGroup(String baseUrl, HttpClient httpClient, ObjectMapper objectMapper) {
        super(baseUrl, httpClient, objectMapper);
    }

    /**
     * Endpoint: /backend/dashboard
     */
    public BackendDashboardResource getBackendDashboard() {
        return new BackendDashboardResource(
            this.baseUrl,
            this.httpClient
        );
    }

}
