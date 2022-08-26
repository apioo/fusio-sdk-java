/**
 * ConsumerUserGroup automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk.consumer;

import app.sdkgen.client.ResourceAbstract;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.client.HttpClient;

public class ConsumerUserGroup extends ResourceAbstract {
    public ConsumerUserGroup(String baseUrl, HttpClient httpClient, ObjectMapper objectMapper) {
        super(baseUrl, httpClient, objectMapper);
    }

    /**
     * Endpoint: /consumer/password_reset
     */
    public ConsumerPasswordResetResource getConsumerPasswordReset() {
        return new ConsumerPasswordResetResource(
            this.baseUrl,
            this.httpClient
        );
    }

    /**
     * Endpoint: /consumer/register
     */
    public ConsumerRegisterResource getConsumerRegister() {
        return new ConsumerRegisterResource(
            this.baseUrl,
            this.httpClient
        );
    }

    /**
     * Endpoint: /consumer/provider/:provider
     */
    public ConsumerProviderByProviderResource getConsumerProviderByProvider(String provider) {
        return new ConsumerProviderByProviderResource(
            provider,
            this.baseUrl,
            this.httpClient
        );
    }

    /**
     * Endpoint: /consumer/login
     */
    public ConsumerLoginResource getConsumerLogin() {
        return new ConsumerLoginResource(
            this.baseUrl,
            this.httpClient
        );
    }

    /**
     * Endpoint: /consumer/authorize
     */
    public ConsumerAuthorizeResource getConsumerAuthorize() {
        return new ConsumerAuthorizeResource(
            this.baseUrl,
            this.httpClient
        );
    }

    /**
     * Endpoint: /consumer/activate
     */
    public ConsumerActivateResource getConsumerActivate() {
        return new ConsumerActivateResource(
            this.baseUrl,
            this.httpClient
        );
    }

    /**
     * Endpoint: /consumer/account/change_password
     */
    public ConsumerAccountChangePasswordResource getConsumerAccountChangePassword() {
        return new ConsumerAccountChangePasswordResource(
            this.baseUrl,
            this.httpClient
        );
    }

    /**
     * Endpoint: /consumer/account
     */
    public ConsumerAccountResource getConsumerAccount() {
        return new ConsumerAccountResource(
            this.baseUrl,
            this.httpClient
        );
    }

}
