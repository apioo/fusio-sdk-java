/**
 * App automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk.backend;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.time.LocalDateTime;
public class App {
    private int id;
    private int userId;
    private int status;
    private String name;
    private String url;
    private String parameters;
    private String appKey;
    private String appSecret;
    private LocalDateTime date;
    private String[] scopes;
    private App_Token[] tokens;
    @JsonSetter("id")
    public void setId(int id) {
        this.id = id;
    }
    @JsonGetter("id")
    public int getId() {
        return this.id;
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
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }
    @JsonGetter("name")
    public String getName() {
        return this.name;
    }
    @JsonSetter("url")
    public void setUrl(String url) {
        this.url = url;
    }
    @JsonGetter("url")
    public String getUrl() {
        return this.url;
    }
    @JsonSetter("parameters")
    public void setParameters(String parameters) {
        this.parameters = parameters;
    }
    @JsonGetter("parameters")
    public String getParameters() {
        return this.parameters;
    }
    @JsonSetter("appKey")
    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }
    @JsonGetter("appKey")
    public String getAppKey() {
        return this.appKey;
    }
    @JsonSetter("appSecret")
    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }
    @JsonGetter("appSecret")
    public String getAppSecret() {
        return this.appSecret;
    }
    @JsonSetter("date")
    public void setDate(LocalDateTime date) {
        this.date = date;
    }
    @JsonGetter("date")
    public LocalDateTime getDate() {
        return this.date;
    }
    @JsonSetter("scopes")
    public void setScopes(String[] scopes) {
        this.scopes = scopes;
    }
    @JsonGetter("scopes")
    public String[] getScopes() {
        return this.scopes;
    }
    @JsonSetter("tokens")
    public void setTokens(App_Token[] tokens) {
        this.tokens = tokens;
    }
    @JsonGetter("tokens")
    public App_Token[] getTokens() {
        return this.tokens;
    }
}
