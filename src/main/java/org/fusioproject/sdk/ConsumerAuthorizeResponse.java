/**
 * ConsumerAuthorizeResponse automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk;

import com.fasterxml.jackson.annotation.*;

public class ConsumerAuthorizeResponse {
    private String type;
    private String code;
    private String error;
    private String state;
    private String redirectUri;

    @JsonSetter("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonGetter("type")
    public String getType() {
        return this.type;
    }

    @JsonSetter("code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonGetter("code")
    public String getCode() {
        return this.code;
    }

    @JsonSetter("error")
    public void setError(String error) {
        this.error = error;
    }

    @JsonGetter("error")
    public String getError() {
        return this.error;
    }

    @JsonSetter("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonGetter("state")
    public String getState() {
        return this.state;
    }

    @JsonSetter("redirectUri")
    public void setRedirectUri(String redirectUri) {
        this.redirectUri = redirectUri;
    }

    @JsonGetter("redirectUri")
    public String getRedirectUri() {
        return this.redirectUri;
    }
}

