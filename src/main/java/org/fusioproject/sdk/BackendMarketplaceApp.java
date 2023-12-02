/**
 * BackendMarketplaceApp automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;
public class BackendMarketplaceApp {
    private String version;
    private String description;
    private String screenshot;
    private String website;
    private String downloadUrl;
    private String shaHash;
    private String startUrl;
    @JsonSetter("version")
    public void setVersion(String version) {
        this.version = version;
    }
    @JsonGetter("version")
    public String getVersion() {
        return this.version;
    }
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = description;
    }
    @JsonGetter("description")
    public String getDescription() {
        return this.description;
    }
    @JsonSetter("screenshot")
    public void setScreenshot(String screenshot) {
        this.screenshot = screenshot;
    }
    @JsonGetter("screenshot")
    public String getScreenshot() {
        return this.screenshot;
    }
    @JsonSetter("website")
    public void setWebsite(String website) {
        this.website = website;
    }
    @JsonGetter("website")
    public String getWebsite() {
        return this.website;
    }
    @JsonSetter("downloadUrl")
    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }
    @JsonGetter("downloadUrl")
    public String getDownloadUrl() {
        return this.downloadUrl;
    }
    @JsonSetter("sha1Hash")
    public void setShaHash(String shaHash) {
        this.shaHash = shaHash;
    }
    @JsonGetter("sha1Hash")
    public String getShaHash() {
        return this.shaHash;
    }
    @JsonSetter("startUrl")
    public void setStartUrl(String startUrl) {
        this.startUrl = startUrl;
    }
    @JsonGetter("startUrl")
    public String getStartUrl() {
        return this.startUrl;
    }
}
