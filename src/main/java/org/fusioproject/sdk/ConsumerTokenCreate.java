/**
 * ConsumerTokenCreate automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;
import java.time.LocalDate;
public class ConsumerTokenCreate {
    private String name;
    private List<String> scopes;
    private LocalDate expire;
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }
    @JsonGetter("name")
    public String getName() {
        return this.name;
    }
    @JsonSetter("scopes")
    public void setScopes(List<String> scopes) {
        this.scopes = scopes;
    }
    @JsonGetter("scopes")
    public List<String> getScopes() {
        return this.scopes;
    }
    @JsonSetter("expire")
    public void setExpire(LocalDate expire) {
        this.expire = expire;
    }
    @JsonGetter("expire")
    public LocalDate getExpire() {
        return this.expire;
    }
}
