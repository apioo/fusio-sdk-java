/**
 * UserCreate automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk.backend;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
public class UserCreate extends User {
    private String password;
    @JsonSetter("password")
    public void setPassword(String password) {
        this.password = password;
    }
    @JsonGetter("password")
    public String getPassword() {
        return this.password;
    }
}
