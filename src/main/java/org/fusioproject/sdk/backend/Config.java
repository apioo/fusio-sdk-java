/**
 * Config automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk.backend;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
public class Config {
    private int id;
    private int type;
    private String name;
    private String description;
    private Object value;
    @JsonSetter("id")
    public void setId(int id) {
        this.id = id;
    }
    @JsonGetter("id")
    public int getId() {
        return this.id;
    }
    @JsonSetter("type")
    public void setType(int type) {
        this.type = type;
    }
    @JsonGetter("type")
    public int getType() {
        return this.type;
    }
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }
    @JsonGetter("name")
    public String getName() {
        return this.name;
    }
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = description;
    }
    @JsonGetter("description")
    public String getDescription() {
        return this.description;
    }
    @JsonSetter("value")
    public void setValue(Object value) {
        this.value = value;
    }
    @JsonGetter("value")
    public Object getValue() {
        return this.value;
    }
}
