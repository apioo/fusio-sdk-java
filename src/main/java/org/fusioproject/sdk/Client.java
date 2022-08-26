
package org.fusioproject.sdk;

import app.sdkgen.client.Credentials.ClientCredentials;
import app.sdkgen.client.CredentialsInterface;
import app.sdkgen.client.TokenStore.MemoryTokenStore;
import app.sdkgen.client.TokenStoreInterface;

import java.util.ArrayList;
import java.util.List;

public class Client {
    private final String baseUrl;
    private final CredentialsInterface credentials;
    private final List<String> scopes;
    private final TokenStoreInterface tokenStore;

    public Client(String baseUrl, String clientId, String clientSecret, List<String> scopes, TokenStoreInterface tokenStore) {
        this.baseUrl = baseUrl;
        this.credentials = this.newCredentials(clientId, clientSecret);
        this.scopes = scopes;
        this.tokenStore = tokenStore;
    }

    public Client(String baseUrl, String clientId, String clientSecret, List<String> scopes) {
        this(baseUrl, clientId, clientSecret, scopes, new MemoryTokenStore());
    }

    public Client(String baseUrl, String clientId, String clientSecret) {
        this(baseUrl, clientId, clientSecret, new ArrayList<>());
    }

    public org.fusioproject.sdk.backend.Client backend() {
        return new org.fusioproject.sdk.backend.Client(this.baseUrl, this.credentials, this.tokenStore, this.scopes);
    }

    public org.fusioproject.sdk.consumer.Client consumer() {
        return new org.fusioproject.sdk.consumer.Client(this.baseUrl, this.credentials, this.tokenStore, this.scopes);
    }

    public TokenStoreInterface getTokenStore() {
        return this.tokenStore;
    }

    private CredentialsInterface newCredentials(String clientId, String clientSecret) {
        return new ClientCredentials(
            clientId,
            clientSecret,
            this.baseUrl + "/authorization/token",
            "",
            this.baseUrl + "/authorization/refresh"
        );
    }
}
