/**
 * BackendLog automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;
import java.time.LocalDateTime;
public class BackendLog {
    private Integer id;
    private String ip;
    private String userAgent;
    private String method;
    private String path;
    private String header;
    private String body;
    private LocalDateTime date;
    private List<BackendLogError> errors;
    @JsonSetter("id")
    public void setId(Integer id) {
        this.id = id;
    }
    @JsonGetter("id")
    public Integer getId() {
        return this.id;
    }
    @JsonSetter("ip")
    public void setIp(String ip) {
        this.ip = ip;
    }
    @JsonGetter("ip")
    public String getIp() {
        return this.ip;
    }
    @JsonSetter("userAgent")
    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }
    @JsonGetter("userAgent")
    public String getUserAgent() {
        return this.userAgent;
    }
    @JsonSetter("method")
    public void setMethod(String method) {
        this.method = method;
    }
    @JsonGetter("method")
    public String getMethod() {
        return this.method;
    }
    @JsonSetter("path")
    public void setPath(String path) {
        this.path = path;
    }
    @JsonGetter("path")
    public String getPath() {
        return this.path;
    }
    @JsonSetter("header")
    public void setHeader(String header) {
        this.header = header;
    }
    @JsonGetter("header")
    public String getHeader() {
        return this.header;
    }
    @JsonSetter("body")
    public void setBody(String body) {
        this.body = body;
    }
    @JsonGetter("body")
    public String getBody() {
        return this.body;
    }
    @JsonSetter("date")
    public void setDate(LocalDateTime date) {
        this.date = date;
    }
    @JsonGetter("date")
    public LocalDateTime getDate() {
        return this.date;
    }
    @JsonSetter("errors")
    public void setErrors(List<BackendLogError> errors) {
        this.errors = errors;
    }
    @JsonGetter("errors")
    public List<BackendLogError> getErrors() {
        return this.errors;
    }
}
