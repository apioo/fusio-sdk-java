/**
 * BackendRoutesRouteIdPath automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk.backend;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
public class BackendRoutesRouteIdPath {
    private String routeId;
    @JsonSetter("route_id")
    public void setRouteId(String routeId) {
        this.routeId = routeId;
    }
    @JsonGetter("route_id")
    public String getRouteId() {
        return this.routeId;
    }
}
