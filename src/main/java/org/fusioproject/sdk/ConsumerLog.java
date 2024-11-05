/**
 * ConsumerLog automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ConsumerLog {
    private Integer id;
    private Integer appId;
    private String ip;
    private String userAgent;
    private String method;
    private String path;
    private String header;
    private String body;
    private java.time.LocalDateTime date;

    @JsonSetter("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonGetter("id")
    public Integer getId() {
        return this.id;
    }

    @JsonSetter("appId")
    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    @JsonGetter("appId")
    public Integer getAppId() {
        return this.appId;
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
    public void setDate(java.time.LocalDateTime date) {
        this.date = date;
    }

    @JsonGetter("date")
    public java.time.LocalDateTime getDate() {
        return this.date;
    }
}

