/**
 * AuthorizeResponseToken automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk.consumer;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
public class AuthorizeResponseToken {
    private String accessToken;
    private String tokenType;
    private String expiresIn;
    private String scope;
    @JsonSetter("access_token")
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }
    @JsonGetter("access_token")
    public String getAccessToken() {
        return this.accessToken;
    }
    @JsonSetter("token_type")
    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }
    @JsonGetter("token_type")
    public String getTokenType() {
        return this.tokenType;
    }
    @JsonSetter("expires_in")
    public void setExpiresIn(String expiresIn) {
        this.expiresIn = expiresIn;
    }
    @JsonGetter("expires_in")
    public String getExpiresIn() {
        return this.expiresIn;
    }
    @JsonSetter("scope")
    public void setScope(String scope) {
        this.scope = scope;
    }
    @JsonGetter("scope")
    public String getScope() {
        return this.scope;
    }
}
