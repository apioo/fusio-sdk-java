/**
 * BackendActionAction_idPath automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk.backend;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
public class BackendActionAction_idPath {
    private String action_id;
    @JsonSetter("action_id")
    public void setAction_id(String action_id) {
        this.action_id = action_id;
    }
    @JsonGetter("action_id")
    public String getAction_id() {
        return this.action_id;
    }
}