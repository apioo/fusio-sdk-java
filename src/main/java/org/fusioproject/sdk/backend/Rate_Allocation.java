/**
 * Rate_Allocation automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk.backend;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
public class Rate_Allocation {
    private int id;
    private int routeId;
    private int userId;
    private int planId;
    private int appId;
    private boolean authenticated;
    @JsonSetter("id")
    public void setId(int id) {
        this.id = id;
    }
    @JsonGetter("id")
    public int getId() {
        return this.id;
    }
    @JsonSetter("routeId")
    public void setRouteId(int routeId) {
        this.routeId = routeId;
    }
    @JsonGetter("routeId")
    public int getRouteId() {
        return this.routeId;
    }
    @JsonSetter("userId")
    public void setUserId(int userId) {
        this.userId = userId;
    }
    @JsonGetter("userId")
    public int getUserId() {
        return this.userId;
    }
    @JsonSetter("planId")
    public void setPlanId(int planId) {
        this.planId = planId;
    }
    @JsonGetter("planId")
    public int getPlanId() {
        return this.planId;
    }
    @JsonSetter("appId")
    public void setAppId(int appId) {
        this.appId = appId;
    }
    @JsonGetter("appId")
    public int getAppId() {
        return this.appId;
    }
    @JsonSetter("authenticated")
    public void setAuthenticated(boolean authenticated) {
        this.authenticated = authenticated;
    }
    @JsonGetter("authenticated")
    public boolean getAuthenticated() {
        return this.authenticated;
    }
}
