/**
 * BackendUserUser_idPath automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk.backend;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
public class BackendUserUser_idPath {
    private String user_id;
    @JsonSetter("user_id")
    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
    @JsonGetter("user_id")
    public String getUser_id() {
        return this.user_id;
    }
}