/**
 * Account_ChangePassword automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk.backend;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
public class Account_ChangePassword {
    private String oldPassword;
    private String newPassword;
    private String verifyPassword;
    @JsonSetter("oldPassword")
    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }
    @JsonGetter("oldPassword")
    public String getOldPassword() {
        return this.oldPassword;
    }
    @JsonSetter("newPassword")
    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }
    @JsonGetter("newPassword")
    public String getNewPassword() {
        return this.newPassword;
    }
    @JsonSetter("verifyPassword")
    public void setVerifyPassword(String verifyPassword) {
        this.verifyPassword = verifyPassword;
    }
    @JsonGetter("verifyPassword")
    public String getVerifyPassword() {
        return this.verifyPassword;
    }
}
