/**
 * Scope automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk.consumer;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
public class Scope {
    private int id;
    private String name;
    private String description;
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
    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = description;
    }
    @JsonGetter("description")
    public String getDescription() {
        return this.description;
    }
}
