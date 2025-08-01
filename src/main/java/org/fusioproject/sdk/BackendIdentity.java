/**
 * BackendIdentity automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk;

import com.fasterxml.jackson.annotation.*;

@JsonClassDescription("This object represents an identity which allows to authenticate with a remote identity provider")
public class BackendIdentity {
    @JsonPropertyDescription("Unique identifier for the object")
    private Integer id;
    @JsonPropertyDescription("The target app for this identity")
    private Integer appId;
    @JsonPropertyDescription("Role which is assigned to new users")
    private Integer roleId;
    @JsonPropertyDescription("Unique name of the object")
    private String name;
    @JsonPropertyDescription("An icon for this identity provider")
    private String icon;
    @JsonPropertyDescription("Underlying class of this identity provider")
    private String _class;
    private BackendIdentityConfig config;
    private Boolean allowCreate;

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

    @JsonSetter("roleId")
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    @JsonGetter("roleId")
    public Integer getRoleId() {
        return this.roleId;
    }

    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonGetter("name")
    public String getName() {
        return this.name;
    }

    @JsonSetter("icon")
    public void setIcon(String icon) {
        this.icon = icon;
    }

    @JsonGetter("icon")
    public String getIcon() {
        return this.icon;
    }

    @JsonSetter("class")
    public void setClass(String _class) {
        this._class = _class;
    }

    @JsonGetter("class")
    public String get_Class() {
        return this._class;
    }

    @JsonSetter("config")
    public void setConfig(BackendIdentityConfig config) {
        this.config = config;
    }

    @JsonGetter("config")
    public BackendIdentityConfig getConfig() {
        return this.config;
    }

    @JsonSetter("allowCreate")
    public void setAllowCreate(Boolean allowCreate) {
        this.allowCreate = allowCreate;
    }

    @JsonGetter("allowCreate")
    public Boolean getAllowCreate() {
        return this.allowCreate;
    }
}

