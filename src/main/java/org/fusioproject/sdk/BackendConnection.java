/**
 * BackendConnection automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk;

import com.fasterxml.jackson.annotation.*;

public class BackendConnection {
    private Integer id;
    private String name;
    private String _class;
    @JsonPropertyDescription("Indicates whether it is possible to start an OAuth2 authorization code flow on this connection")
    private Boolean oauth;
    private BackendConnectionConfig config;
    private CommonMetadata metadata;

    @JsonSetter("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonGetter("id")
    public Integer getId() {
        return this.id;
    }

    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonGetter("name")
    public String getName() {
        return this.name;
    }

    @JsonSetter("class")
    public void setClass(String _class) {
        this._class = _class;
    }

    @JsonGetter("class")
    public String get_Class() {
        return this._class;
    }

    @JsonSetter("oauth2")
    public void setOauth(Boolean oauth) {
        this.oauth = oauth;
    }

    @JsonGetter("oauth2")
    public Boolean getOauth() {
        return this.oauth;
    }

    @JsonSetter("config")
    public void setConfig(BackendConnectionConfig config) {
        this.config = config;
    }

    @JsonGetter("config")
    public BackendConnectionConfig getConfig() {
        return this.config;
    }

    @JsonSetter("metadata")
    public void setMetadata(CommonMetadata metadata) {
        this.metadata = metadata;
    }

    @JsonGetter("metadata")
    public CommonMetadata getMetadata() {
        return this.metadata;
    }
}

