/**
 * BackendCronjob automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class BackendCronjob {
    private Integer id;
    private String name;
    private String cron;
    private String action;
    private java.time.LocalDateTime executeDate;
    private Integer exitCode;
    private CommonMetadata metadata;
    private java.util.List<BackendCronjobError> errors;

    @JsonSetter("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonGetter("id")
    public Integer getId() {
        return this.id;
    }

    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonGetter("name")
    public String getName() {
        return this.name;
    }

    @JsonSetter("cron")
    public void setCron(String cron) {
        this.cron = cron;
    }

    @JsonGetter("cron")
    public String getCron() {
        return this.cron;
    }

    @JsonSetter("action")
    public void setAction(String action) {
        this.action = action;
    }

    @JsonGetter("action")
    public String getAction() {
        return this.action;
    }

    @JsonSetter("executeDate")
    public void setExecuteDate(java.time.LocalDateTime executeDate) {
        this.executeDate = executeDate;
    }

    @JsonGetter("executeDate")
    public java.time.LocalDateTime getExecuteDate() {
        return this.executeDate;
    }

    @JsonSetter("exitCode")
    public void setExitCode(Integer exitCode) {
        this.exitCode = exitCode;
    }

    @JsonGetter("exitCode")
    public Integer getExitCode() {
        return this.exitCode;
    }

    @JsonSetter("metadata")
    public void setMetadata(CommonMetadata metadata) {
        this.metadata = metadata;
    }

    @JsonGetter("metadata")
    public CommonMetadata getMetadata() {
        return this.metadata;
    }

    @JsonSetter("errors")
    public void setErrors(java.util.List<BackendCronjobError> errors) {
        this.errors = errors;
    }

    @JsonGetter("errors")
    public java.util.List<BackendCronjobError> getErrors() {
        return this.errors;
    }
}

