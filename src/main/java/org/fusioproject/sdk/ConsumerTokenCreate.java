/**
 * ConsumerTokenCreate automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;
import java.time.LocalDateTime;
public class ConsumerTokenCreate {
    private String name;
    private List<String> scope;
    private LocalDateTime expire;
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }
    @JsonGetter("name")
    public String getName() {
        return this.name;
    }
    @JsonSetter("scope")
    public void setScope(List<String> scope) {
        this.scope = scope;
    }
    @JsonGetter("scope")
    public List<String> getScope() {
        return this.scope;
    }
    @JsonSetter("expire")
    public void setExpire(LocalDateTime expire) {
        this.expire = expire;
    }
    @JsonGetter("expire")
    public LocalDateTime getExpire() {
        return this.expire;
    }
}