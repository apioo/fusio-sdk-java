/**
 * ConsumerLogGroup automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk.consumer;

import app.sdkgen.client.ResourceAbstract;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.client.HttpClient;

public class ConsumerLogGroup extends ResourceAbstract {
    public ConsumerLogGroup(String baseUrl, HttpClient httpClient, ObjectMapper objectMapper) {
        super(baseUrl, httpClient, objectMapper);
    }

    /**
     * Endpoint: /consumer/log/$log_id<[0-9]+>
     */
    public ConsumerLogByLogIdResource getConsumerLogByLogId(String log_id) {
        return new ConsumerLogByLogIdResource(
            log_id,
            this.baseUrl,
            this.httpClient
        );
    }

    /**
     * Endpoint: /consumer/log
     */
    public ConsumerLogResource getConsumerLog() {
        return new ConsumerLogResource(
            this.baseUrl,
            this.httpClient
        );
    }

}