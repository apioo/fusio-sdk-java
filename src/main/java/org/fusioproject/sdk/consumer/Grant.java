/**
 * Grant automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk.consumer;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.time.LocalDateTime;
public class Grant {
    private int id;
    private App app;
    private LocalDateTime createDate;
    @JsonSetter("id")
    public void setId(int id) {
        this.id = id;
    }
    @JsonGetter("id")
    public int getId() {
        return this.id;
    }
    @JsonSetter("app")
    public void setApp(App app) {
        this.app = app;
    }
    @JsonGetter("app")
    public App getApp() {
        return this.app;
    }
    @JsonSetter("createDate")
    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }
    @JsonGetter("createDate")
    public LocalDateTime getCreateDate() {
        return this.createDate;
    }
}