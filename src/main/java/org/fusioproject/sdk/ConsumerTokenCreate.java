/**
 * ConsumerTokenCreate automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk;

import com.fasterxml.jackson.annotation.*;

public class ConsumerTokenCreate {
    private String name;
    private java.util.List<String> scopes;
    private java.time.LocalDate expire;

    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonGetter("name")
    public String getName() {
        return this.name;
    }

    @JsonSetter("scopes")
    public void setScopes(java.util.List<String> scopes) {
        this.scopes = scopes;
    }

    @JsonGetter("scopes")
    public java.util.List<String> getScopes() {
        return this.scopes;
    }

    @JsonSetter("expire")
    public void setExpire(java.time.LocalDate expire) {
        this.expire = expire;
    }

    @JsonGetter("expire")
    public java.time.LocalDate getExpire() {
        return this.expire;
    }
}

