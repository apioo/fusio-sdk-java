/**
 * SystemRoute automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
public class SystemRoute {
    private SystemRoutePath routes;
    @JsonSetter("routes")
    public void setRoutes(SystemRoutePath routes) {
        this.routes = routes;
    }
    @JsonGetter("routes")
    public SystemRoutePath getRoutes() {
        return this.routes;
    }
}
