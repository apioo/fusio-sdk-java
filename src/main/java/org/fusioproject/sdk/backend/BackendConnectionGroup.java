/**
 * BackendConnectionGroup automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk.backend;

import app.sdkgen.client.ResourceAbstract;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.client.HttpClient;

public class BackendConnectionGroup extends ResourceAbstract {
    public BackendConnectionGroup(String baseUrl, HttpClient httpClient, ObjectMapper objectMapper) {
        super(baseUrl, httpClient, objectMapper);
    }

    /**
     * Endpoint: /backend/connection/$connection_id<[0-9]+|^~>/introspection/:entity
     */
    public BackendConnectionByConnectionIdIntrospectionAndEntityResource getBackendConnectionByConnectionIdIntrospectionAndEntity(String connection_id, String entity) {
        return new BackendConnectionByConnectionIdIntrospectionAndEntityResource(
            connection_id,
            entity,
            this.baseUrl,
            this.httpClient
        );
    }

    /**
     * Endpoint: /backend/connection/$connection_id<[0-9]+|^~>/introspection
     */
    public BackendConnectionByConnectionIdIntrospectionResource getBackendConnectionByConnectionIdIntrospection(String connection_id) {
        return new BackendConnectionByConnectionIdIntrospectionResource(
            connection_id,
            this.baseUrl,
            this.httpClient
        );
    }

    /**
     * Endpoint: /backend/connection/$connection_id<[0-9]+|^~>/redirect
     */
    public BackendConnectionByConnectionIdRedirectResource getBackendConnectionByConnectionIdRedirect(String connection_id) {
        return new BackendConnectionByConnectionIdRedirectResource(
            connection_id,
            this.baseUrl,
            this.httpClient
        );
    }

    /**
     * Endpoint: /backend/connection/$connection_id<[0-9]+|^~>
     */
    public BackendConnectionByConnectionIdResource getBackendConnectionByConnectionId(String connection_id) {
        return new BackendConnectionByConnectionIdResource(
            connection_id,
            this.baseUrl,
            this.httpClient
        );
    }

    /**
     * Endpoint: /backend/connection/form
     */
    public BackendConnectionFormResource getBackendConnectionForm() {
        return new BackendConnectionFormResource(
            this.baseUrl,
            this.httpClient
        );
    }

    /**
     * Endpoint: /backend/connection/list
     */
    public BackendConnectionListResource getBackendConnectionList() {
        return new BackendConnectionListResource(
            this.baseUrl,
            this.httpClient
        );
    }

    /**
     * Endpoint: /backend/connection
     */
    public BackendConnectionResource getBackendConnection() {
        return new BackendConnectionResource(
            this.baseUrl,
            this.httpClient
        );
    }

}