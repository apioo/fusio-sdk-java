/**
 * ConsumerTokenUpdate automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ConsumerTokenUpdate {
    private String name;
    private java.time.LocalDate expire;

    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonGetter("name")
    public String getName() {
        return this.name;
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

