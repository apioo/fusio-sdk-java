/**
 * SystemOAuthConfiguration automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk;

import com.fasterxml.jackson.annotation.*;

public class SystemOAuthConfiguration {
    private String issuer;
    private String tokenEndpoint;
    private java.util.List<String> tokenEndpointAuthMethodsSupported;
    private String userinfoEndpoint;
    private java.util.List<String> scopesSupported;
    private java.util.List<String> claimsSupported;

    @JsonSetter("issuer")
    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    @JsonGetter("issuer")
    public String getIssuer() {
        return this.issuer;
    }

    @JsonSetter("token_endpoint")
    public void setTokenEndpoint(String tokenEndpoint) {
        this.tokenEndpoint = tokenEndpoint;
    }

    @JsonGetter("token_endpoint")
    public String getTokenEndpoint() {
        return this.tokenEndpoint;
    }

    @JsonSetter("token_endpoint_auth_methods_supported")
    public void setTokenEndpointAuthMethodsSupported(java.util.List<String> tokenEndpointAuthMethodsSupported) {
        this.tokenEndpointAuthMethodsSupported = tokenEndpointAuthMethodsSupported;
    }

    @JsonGetter("token_endpoint_auth_methods_supported")
    public java.util.List<String> getTokenEndpointAuthMethodsSupported() {
        return this.tokenEndpointAuthMethodsSupported;
    }

    @JsonSetter("userinfo_endpoint")
    public void setUserinfoEndpoint(String userinfoEndpoint) {
        this.userinfoEndpoint = userinfoEndpoint;
    }

    @JsonGetter("userinfo_endpoint")
    public String getUserinfoEndpoint() {
        return this.userinfoEndpoint;
    }

    @JsonSetter("scopes_supported")
    public void setScopesSupported(java.util.List<String> scopesSupported) {
        this.scopesSupported = scopesSupported;
    }

    @JsonGetter("scopes_supported")
    public java.util.List<String> getScopesSupported() {
        return this.scopesSupported;
    }

    @JsonSetter("claims_supported")
    public void setClaimsSupported(java.util.List<String> claimsSupported) {
        this.claimsSupported = claimsSupported;
    }

    @JsonGetter("claims_supported")
    public java.util.List<String> getClaimsSupported() {
        return this.claimsSupported;
    }
}

