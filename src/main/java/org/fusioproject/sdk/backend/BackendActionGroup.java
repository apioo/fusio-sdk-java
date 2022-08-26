/**
 * BackendActionGroup automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk.backend;

import app.sdkgen.client.ResourceAbstract;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.client.HttpClient;

public class BackendActionGroup extends ResourceAbstract {
    public BackendActionGroup(String baseUrl, HttpClient httpClient, ObjectMapper objectMapper) {
        super(baseUrl, httpClient, objectMapper);
    }

    /**
     * Endpoint: /backend/action/$action_id<[0-9]+|^~>
     */
    public BackendActionByActionIdResource getBackendActionByActionId(String action_id) {
        return new BackendActionByActionIdResource(
            action_id,
            this.baseUrl,
            this.httpClient
        );
    }

    /**
     * Endpoint: /backend/action/execute/:action_id
     */
    public BackendActionExecuteByActionIdResource getBackendActionExecuteByActionId(String action_id) {
        return new BackendActionExecuteByActionIdResource(
            action_id,
            this.baseUrl,
            this.httpClient
        );
    }

    /**
     * Endpoint: /backend/action/form
     */
    public BackendActionFormResource getBackendActionForm() {
        return new BackendActionFormResource(
            this.baseUrl,
            this.httpClient
        );
    }

    /**
     * Endpoint: /backend/action/list
     */
    public BackendActionListResource getBackendActionList() {
        return new BackendActionListResource(
            this.baseUrl,
            this.httpClient
        );
    }

    /**
     * Endpoint: /backend/action
     */
    public BackendActionResource getBackendAction() {
        return new BackendActionResource(
            this.baseUrl,
            this.httpClient
        );
    }

}
