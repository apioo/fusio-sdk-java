/**
 * BackendConnectionConnection_idRedirectPath automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk.backend;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
public class BackendConnectionConnection_idRedirectPath {
    private String connection_id;
    @JsonSetter("connection_id")
    public void setConnection_id(String connection_id) {
        this.connection_id = connection_id;
    }
    @JsonGetter("connection_id")
    public String getConnection_id() {
        return this.connection_id;
    }
}
