/**
 * BackendMarketplaceAppNamePath automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk.backend;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
public class BackendMarketplaceAppNamePath {
    private String appName;
    @JsonSetter("app_name")
    public void setAppName(String appName) {
        this.appName = appName;
    }
    @JsonGetter("app_name")
    public String getAppName() {
        return this.appName;
    }
}
