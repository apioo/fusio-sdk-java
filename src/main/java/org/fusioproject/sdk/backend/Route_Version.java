/**
 * Route_Version automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk.backend;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
public class Route_Version {
    private int version;
    private int status;
    private Route_Methods methods;
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
    public void setMethods(Route_Methods methods) {
        this.methods = methods;
    }
    @JsonGetter("methods")
    public Route_Methods getMethods() {
        return this.methods;
    }
}
