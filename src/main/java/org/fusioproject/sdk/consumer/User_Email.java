/**
 * User_Email automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk.consumer;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
public class User_Email {
    private String email;
    private String captcha;
    @JsonSetter("email")
    public void setEmail(String email) {
        this.email = email;
    }
    @JsonGetter("email")
    public String getEmail() {
        return this.email;
    }
    @JsonSetter("captcha")
    public void setCaptcha(String captcha) {
        this.captcha = captcha;
    }
    @JsonGetter("captcha")
    public String getCaptcha() {
        return this.captcha;
    }
}
