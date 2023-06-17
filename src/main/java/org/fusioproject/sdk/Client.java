
package org.fusioproject.sdk;

import app.sdkgen.client.Credentials.OAuth2;
import app.sdkgen.client.CredentialsInterface;
import app.sdkgen.client.Exception.Authenticator.InvalidCredentialsException;
import app.sdkgen.client.TokenStore.MemoryTokenStore;
import app.sdkgen.client.TokenStoreInterface;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private final String baseUrl;
    private final CredentialsInterface credentials;

    public Client(String baseUrl, String clientId, String clientSecret, List<String> scopes, TokenStoreInterface tokenStore) {
        this.baseUrl = baseUrl;
        this.credentials = this.newCredentials(clientId, clientSecret, tokenStore, scopes);
    }

    public Client(String baseUrl, String clientId, String clientSecret, List<String> scopes) {
        this(baseUrl, clientId, clientSecret, scopes, new MemoryTokenStore());
    }

    public Client(String baseUrl, String clientId, String clientSecret) {
        this(baseUrl, clientId, clientSecret, new ArrayList<>());
    }

    public org.fusioproject.sdk.backend.Client backend() throws InvalidCredentialsException {
        return new org.fusioproject.sdk.backend.Client(this.baseUrl, this.credentials);
    }

    public org.fusioproject.sdk.consumer.Client consumer() throws InvalidCredentialsException {
        return new org.fusioproject.sdk.consumer.Client(this.baseUrl, this.credentials);
    }

    public CredentialsInterface getCredentials() {
        return this.credentials;
    }

    private CredentialsInterface newCredentials(String clientId, String clientSecret, TokenStoreInterface tokenStore, List<String> scopes) {
        return new OAuth2(
            clientId,
            clientSecret,
            this.baseUrl + "/authorization/token",
            "",
            tokenStore,scopes
        );
    }
}
