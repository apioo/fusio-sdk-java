/**
 * User_Register automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk.consumer;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
public class User_Register {
    private String name;
    private String email;
    private String password;
    private String captcha;
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }
    @JsonGetter("name")
    public String getName() {
        return this.name;
    }
    @JsonSetter("email")
    public void setEmail(String email) {
        this.email = email;
    }
    @JsonGetter("email")
    public String getEmail() {
        return this.email;
    }
    @JsonSetter("password")
    public void setPassword(String password) {
        this.password = password;
    }
    @JsonGetter("password")
    public String getPassword() {
        return this.password;
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
