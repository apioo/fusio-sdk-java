/**
 * Message automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk.backend;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
public class Message {
    private boolean success;
    private String message;
    @JsonSetter("success")
    public void setSuccess(boolean success) {
        this.success = success;
    }
    @JsonGetter("success")
    public boolean getSuccess() {
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
}
