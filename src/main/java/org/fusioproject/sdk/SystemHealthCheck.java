/**
 * SystemHealthCheck automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;
public class SystemHealthCheck {
    private boolean healthy;
    private String error;
    @JsonSetter("healthy")
    public void setHealthy(boolean healthy) {
        this.healthy = healthy;
    }
    @JsonGetter("healthy")
    public boolean getHealthy() {
        return this.healthy;
    }
    @JsonSetter("error")
    public void setError(String error) {
        this.error = error;
    }
    @JsonGetter("error")
    public String getError() {
        return this.error;
    }
}
