/**
 * UserJWT automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk.consumer;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
public class UserJWT {
    private String token;
    private int expiresIn;
    private String refreshToken;
    private String scope;
    @JsonSetter("token")
    public void setToken(String token) {
        this.token = token;
    }
    @JsonGetter("token")
    public String getToken() {
        return this.token;
    }
    @JsonSetter("expires_in")
    public void setExpiresIn(int expiresIn) {
        this.expiresIn = expiresIn;
    }
    @JsonGetter("expires_in")
    public int getExpiresIn() {
        return this.expiresIn;
    }
    @JsonSetter("refresh_token")
    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }
    @JsonGetter("refresh_token")
    public String getRefreshToken() {
        return this.refreshToken;
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
