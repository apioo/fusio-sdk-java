/**
 * BackendAppTokenToken_idPath automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk.backend;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
public class BackendAppTokenToken_idPath {
    private String token_id;
    @JsonSetter("token_id")
    public void setToken_id(String token_id) {
        this.token_id = token_id;
    }
    @JsonGetter("token_id")
    public String getToken_id() {
        return this.token_id;
    }
}