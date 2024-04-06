/**
 * BackendRateAllocation automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
public class BackendRateAllocation {
    private Integer id;
    private Integer operationId;
    private Integer userId;
    private Integer planId;
    private Integer appId;
    private Boolean authenticated;
    @JsonSetter("id")
    public void setId(Integer id) {
        this.id = id;
    }
    @JsonGetter("id")
    public Integer getId() {
        return this.id;
    }
    @JsonSetter("operationId")
    public void setOperationId(Integer operationId) {
        this.operationId = operationId;
    }
    @JsonGetter("operationId")
    public Integer getOperationId() {
        return this.operationId;
    }
    @JsonSetter("userId")
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    @JsonGetter("userId")
    public Integer getUserId() {
        return this.userId;
    }
    @JsonSetter("planId")
    public void setPlanId(Integer planId) {
        this.planId = planId;
    }
    @JsonGetter("planId")
    public Integer getPlanId() {
        return this.planId;
    }
    @JsonSetter("appId")
    public void setAppId(Integer appId) {
        this.appId = appId;
    }
    @JsonGetter("appId")
    public Integer getAppId() {
        return this.appId;
    }
    @JsonSetter("authenticated")
    public void setAuthenticated(Boolean authenticated) {
        this.authenticated = authenticated;
    }
    @JsonGetter("authenticated")
    public Boolean getAuthenticated() {
        return this.authenticated;
    }
}
