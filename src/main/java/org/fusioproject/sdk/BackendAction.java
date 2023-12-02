/**
 * BackendAction automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;
public class BackendAction {
    private int id;
    private int status;
    private String name;
    private String _class;
    private boolean async;
    private BackendActionConfig config;
    private CommonMetadata metadata;
    @JsonSetter("id")
    public void setId(int id) {
        this.id = id;
    }
    @JsonGetter("id")
    public int getId() {
        return this.id;
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
    @JsonSetter("class")
    public void setClass(String _class) {
        this._class = _class;
    }
    @JsonGetter("class")
    public String get_Class() {
        return this._class;
    }
    @JsonSetter("async")
    public void setAsync(boolean async) {
        this.async = async;
    }
    @JsonGetter("async")
    public boolean getAsync() {
        return this.async;
    }
    @JsonSetter("config")
    public void setConfig(BackendActionConfig config) {
        this.config = config;
    }
    @JsonGetter("config")
    public BackendActionConfig getConfig() {
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
