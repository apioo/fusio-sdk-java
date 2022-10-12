/**
 * ActionExecuteResponse automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk.backend;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
public class ActionExecuteResponse {
    private int statusCode;
    private ActionExecuteResponseHeaders headers;
    private ActionExecuteResponseBody body;
    @JsonSetter("statusCode")
    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }
    @JsonGetter("statusCode")
    public int getStatusCode() {
        return this.statusCode;
    }
    @JsonSetter("headers")
    public void setHeaders(ActionExecuteResponseHeaders headers) {
        this.headers = headers;
    }
    @JsonGetter("headers")
    public ActionExecuteResponseHeaders getHeaders() {
        return this.headers;
    }
    @JsonSetter("body")
    public void setBody(ActionExecuteResponseBody body) {
        this.body = body;
    }
    @JsonGetter("body")
    public ActionExecuteResponseBody getBody() {
        return this.body;
    }
}