/**
 * Scope_Route automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk.backend;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
public class Scope_Route {
    private int routeId;
    private boolean allow;
    private String methods;
    @JsonSetter("routeId")
    public void setRouteId(int routeId) {
        this.routeId = routeId;
    }
    @JsonGetter("routeId")
    public int getRouteId() {
        return this.routeId;
    }
    @JsonSetter("allow")
    public void setAllow(boolean allow) {
        this.allow = allow;
    }
    @JsonGetter("allow")
    public boolean getAllow() {
        return this.allow;
    }
    @JsonSetter("methods")
    public void setMethods(String methods) {
        this.methods = methods;
    }
    @JsonGetter("methods")
    public String getMethods() {
        return this.methods;
    }
}
