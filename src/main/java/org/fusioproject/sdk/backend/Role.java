/**
 * Role automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk.backend;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
public class Role {
    private int id;
    private int categoryId;
    private String name;
    private String[] scopes;
    @JsonSetter("id")
    public void setId(int id) {
        this.id = id;
    }
    @JsonGetter("id")
    public int getId() {
        return this.id;
    }
    @JsonSetter("categoryId")
    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
    @JsonGetter("categoryId")
    public int getCategoryId() {
        return this.categoryId;
    }
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }
    @JsonGetter("name")
    public String getName() {
        return this.name;
    }
    @JsonSetter("scopes")
    public void setScopes(String[] scopes) {
        this.scopes = scopes;
    }
    @JsonGetter("scopes")
    public String[] getScopes() {
        return this.scopes;
    }
}
