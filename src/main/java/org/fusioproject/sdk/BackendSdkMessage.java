/**
 * BackendSdkMessage automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
public class BackendSdkMessage {
    private Boolean success;
    private String message;
    private String link;
    @JsonSetter("success")
    public void setSuccess(Boolean success) {
        this.success = success;
    }
    @JsonGetter("success")
    public Boolean getSuccess() {
        return this.success;
    }
    @JsonSetter("message")
    public void setMessage(String message) {
        this.message = message;
    }
    @JsonGetter("message")
    public String getMessage() {
        return this.message;
    }
    @JsonSetter("link")
    public void setLink(String link) {
        this.link = link;
    }
    @JsonGetter("link")
    public String getLink() {
        return this.link;
    }
}
