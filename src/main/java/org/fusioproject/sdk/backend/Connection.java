/**
 * Connection automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk.backend;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
public class Connection {
    private int id;
    private String name;
    private String _class;
    private Connection_Config config;
    @JsonSetter("id")
    public void setId(int id) {
        this.id = id;
    }
    @JsonGetter("id")
    public int getId() {
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
    public void set_Class(String _class) {
        this._class = _class;
    }
    @JsonGetter("class")
    public String get_Class() {
        return this._class;
    }
    @JsonSetter("config")
    public void setConfig(Connection_Config config) {
        this.config = config;
    }
    @JsonGetter("config")
    public Connection_Config getConfig() {
        return this.config;
    }
}