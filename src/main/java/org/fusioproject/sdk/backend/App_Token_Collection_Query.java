/**
 * App_Token_Collection_Query automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk.backend;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.time.LocalDateTime;
public class App_Token_Collection_Query extends Collection_Query {
    private LocalDateTime from;
    private LocalDateTime to;
    private int appId;
    private int userId;
    private int status;
    private String scope;
    private String ip;
    private String search;
    @JsonSetter("from")
    public void setFrom(LocalDateTime from) {
        this.from = from;
    }
    @JsonGetter("from")
    public LocalDateTime getFrom() {
        return this.from;
    }
    @JsonSetter("to")
    public void setTo(LocalDateTime to) {
        this.to = to;
    }
    @JsonGetter("to")
    public LocalDateTime getTo() {
        return this.to;
    }
    @JsonSetter("appId")
    public void setAppId(int appId) {
        this.appId = appId;
    }
    @JsonGetter("appId")
    public int getAppId() {
        return this.appId;
    }
    @JsonSetter("userId")
    public void setUserId(int userId) {
        this.userId = userId;
    }
    @JsonGetter("userId")
    public int getUserId() {
        return this.userId;
    }
    @JsonSetter("status")
    public void setStatus(int status) {
        this.status = status;
    }
    @JsonGetter("status")
    public int getStatus() {
        return this.status;
    }
    @JsonSetter("scope")
    public void setScope(String scope) {
        this.scope = scope;
    }
    @JsonGetter("scope")
    public String getScope() {
        return this.scope;
    }
    @JsonSetter("ip")
    public void setIp(String ip) {
        this.ip = ip;
    }
    @JsonGetter("ip")
    public String getIp() {
        return this.ip;
    }
    @JsonSetter("search")
    public void setSearch(String search) {
        this.search = search;
    }
    @JsonGetter("search")
    public String getSearch() {
        return this.search;
    }
}