/**
 * ConsumerToken automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;
import java.time.LocalDate;
import java.time.LocalDateTime;
public class ConsumerToken {
    private Integer id;
    private Integer status;
    private String name;
    private List<String> scopes;
    private String ip;
    private LocalDate expire;
    private LocalDateTime date;
    @JsonSetter("id")
    public void setId(Integer id) {
        this.id = id;
    }
    @JsonGetter("id")
    public Integer getId() {
        return this.id;
    }
    @JsonSetter("status")
    public void setStatus(Integer status) {
        this.status = status;
    }
    @JsonGetter("status")
    public Integer getStatus() {
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
    @JsonSetter("scopes")
    public void setScopes(List<String> scopes) {
        this.scopes = scopes;
    }
    @JsonGetter("scopes")
    public List<String> getScopes() {
        return this.scopes;
    }
    @JsonSetter("ip")
    public void setIp(String ip) {
        this.ip = ip;
    }
    @JsonGetter("ip")
    public String getIp() {
        return this.ip;
    }
    @JsonSetter("expire")
    public void setExpire(LocalDate expire) {
        this.expire = expire;
    }
    @JsonGetter("expire")
    public LocalDate getExpire() {
        return this.expire;
    }
    @JsonSetter("date")
    public void setDate(LocalDateTime date) {
        this.date = date;
    }
    @JsonGetter("date")
    public LocalDateTime getDate() {
        return this.date;
    }
}
