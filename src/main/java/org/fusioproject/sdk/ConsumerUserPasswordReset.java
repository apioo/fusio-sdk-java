/**
 * ConsumerUserPasswordReset automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
public class ConsumerUserPasswordReset {
    private String token;
    private String newPassword;
    @JsonSetter("token")
    public void setToken(String token) {
        this.token = token;
    }
    @JsonGetter("token")
    public String getToken() {
        return this.token;
    }
    @JsonSetter("newPassword")
    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }
    @JsonGetter("newPassword")
    public String getNewPassword() {
        return this.newPassword;
    }
}