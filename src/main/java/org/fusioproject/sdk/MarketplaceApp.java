/**
 * MarketplaceApp automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;
public class MarketplaceApp extends MarketplaceObject {
    private List<String> scopes;
    private String downloadUrl;
    private String hash;
    @JsonSetter("scopes")
    public void setScopes(List<String> scopes) {
        this.scopes = scopes;
    }
    @JsonGetter("scopes")
    public List<String> getScopes() {
        return this.scopes;
    }
    @JsonSetter("downloadUrl")
    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }
    @JsonGetter("downloadUrl")
    public String getDownloadUrl() {
        return this.downloadUrl;
    }
    @JsonSetter("hash")
    public void setHash(String hash) {
        this.hash = hash;
    }
    @JsonGetter("hash")
    public String getHash() {
        return this.hash;
    }
}
