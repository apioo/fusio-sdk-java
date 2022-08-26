/**
 * ConsumerGrantGroup automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk.consumer;

import app.sdkgen.client.ResourceAbstract;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.client.HttpClient;

public class ConsumerGrantGroup extends ResourceAbstract {
    public ConsumerGrantGroup(String baseUrl, HttpClient httpClient, ObjectMapper objectMapper) {
        super(baseUrl, httpClient, objectMapper);
    }

    /**
     * Endpoint: /consumer/grant/$grant_id<[0-9]+>
     */
    public ConsumerGrantByGrantIdResource getConsumerGrantByGrantId(String grant_id) {
        return new ConsumerGrantByGrantIdResource(
            grant_id,
            this.baseUrl,
            this.httpClient
        );
    }

    /**
     * Endpoint: /consumer/grant
     */
    public ConsumerGrantResource getConsumerGrant() {
        return new ConsumerGrantResource(
            this.baseUrl,
            this.httpClient
        );
    }

}
