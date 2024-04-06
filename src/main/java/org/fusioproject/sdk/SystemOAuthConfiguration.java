/**
 * SystemOAuthConfiguration automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;
public class SystemOAuthConfiguration {
    private String issuer;
    private String tokenEndpoint;
    private List<String> tokenEndpointAuthMethodsSupported;
    private String userinfoEndpoint;
    private List<String> scopesSupported;
    private List<String> claimsSupported;
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
    public void setTokenEndpointAuthMethodsSupported(List<String> tokenEndpointAuthMethodsSupported) {
        this.tokenEndpointAuthMethodsSupported = tokenEndpointAuthMethodsSupported;
    }
    @JsonGetter("token_endpoint_auth_methods_supported")
    public List<String> getTokenEndpointAuthMethodsSupported() {
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
    public void setScopesSupported(List<String> scopesSupported) {
        this.scopesSupported = scopesSupported;
    }
    @JsonGetter("scopes_supported")
    public List<String> getScopesSupported() {
        return this.scopesSupported;
    }
    @JsonSetter("claims_supported")
    public void setClaimsSupported(List<String> claimsSupported) {
        this.claimsSupported = claimsSupported;
    }
    @JsonGetter("claims_supported")
    public List<String> getClaimsSupported() {
        return this.claimsSupported;
    }
}