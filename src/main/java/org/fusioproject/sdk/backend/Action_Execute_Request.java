/**
 * Action_Execute_Request automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk.backend;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
public class Action_Execute_Request {
    private String method;
    private String uriFragments;
    private String parameters;
    private String headers;
    private Action_Execute_Request_Body body;
    @JsonSetter("method")
    public void setMethod(String method) {
        this.method = method;
    }
    @JsonGetter("method")
    public String getMethod() {
        return this.method;
    }
    @JsonSetter("uriFragments")
    public void setUriFragments(String uriFragments) {
        this.uriFragments = uriFragments;
    }
    @JsonGetter("uriFragments")
    public String getUriFragments() {
        return this.uriFragments;
    }
    @JsonSetter("parameters")
    public void setParameters(String parameters) {
        this.parameters = parameters;
    }
    @JsonGetter("parameters")
    public String getParameters() {
        return this.parameters;
    }
    @JsonSetter("headers")
    public void setHeaders(String headers) {
        this.headers = headers;
    }
    @JsonGetter("headers")
    public String getHeaders() {
        return this.headers;
    }
    @JsonSetter("body")
    public void setBody(Action_Execute_Request_Body body) {
        this.body = body;
    }
    @JsonGetter("body")
    public Action_Execute_Request_Body getBody() {
        return this.body;
    }
}