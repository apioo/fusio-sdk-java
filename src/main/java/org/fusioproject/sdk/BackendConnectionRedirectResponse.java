/**
 * BackendConnectionRedirectResponse automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class BackendConnectionRedirectResponse {
    private String redirectUri;

    @JsonSetter("redirectUri")
    public void setRedirectUri(String redirectUri) {
        this.redirectUri = redirectUri;
    }

    @JsonGetter("redirectUri")
    public String getRedirectUri() {
        return this.redirectUri;
    }
}

