/**
 * RouteVersion automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk.backend;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
public class RouteVersion {
    private int version;
    private int status;
    private RouteMethods methods;
    @JsonSetter("version")
    public void setVersion(int version) {
        this.version = version;
    }
    @JsonGetter("version")
    public int getVersion() {
        return this.version;
    }
    @JsonSetter("status")
    public void setStatus(int status) {
        this.status = status;
    }
    @JsonGetter("status")
    public int getStatus() {
        return this.status;
    }
    @JsonSetter("methods")
    public void setMethods(RouteMethods methods) {
        this.methods = methods;
    }
    @JsonGetter("methods")
    public RouteMethods getMethods() {
        return this.methods;
    }
}
