/**
 * BackendAppApp_idPath automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk.backend;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
public class BackendAppApp_idPath {
    private String app_id;
    @JsonSetter("app_id")
    public void setApp_id(String app_id) {
        this.app_id = app_id;
    }
    @JsonGetter("app_id")
    public String getApp_id() {
        return this.app_id;
    }
}
