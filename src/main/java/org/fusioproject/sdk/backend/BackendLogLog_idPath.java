/**
 * BackendLogLog_idPath automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk.backend;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
public class BackendLogLog_idPath {
    private String log_id;
    @JsonSetter("log_id")
    public void setLog_id(String log_id) {
        this.log_id = log_id;
    }
    @JsonGetter("log_id")
    public String getLog_id() {
        return this.log_id;
    }
}
