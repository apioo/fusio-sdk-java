/**
 * User_JWT automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk.consumer;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
public class User_JWT {
    private String token;
    private int expires_in;
    private String refresh_token;
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
    public void setExpires_in(int expires_in) {
        this.expires_in = expires_in;
    }
    @JsonGetter("expires_in")
    public int getExpires_in() {
        return this.expires_in;
    }
    @JsonSetter("refresh_token")
    public void setRefresh_token(String refresh_token) {
        this.refresh_token = refresh_token;
    }
    @JsonGetter("refresh_token")
    public String getRefresh_token() {
        return this.refresh_token;
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