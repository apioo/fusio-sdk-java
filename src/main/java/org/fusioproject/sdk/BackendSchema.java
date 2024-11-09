/**
 * BackendSchema automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk;

import com.fasterxml.jackson.annotation.*;

public class BackendSchema {
    private Integer id;
    private Integer status;
    private String name;
    private BackendSchemaSource source;
    private BackendSchemaForm form;
    private CommonMetadata metadata;

    @JsonSetter("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonGetter("id")
    public Integer getId() {
        return this.id;
    }

    @JsonSetter("status")
    public void setStatus(Integer status) {
        this.status = status;
    }

    @JsonGetter("status")
    public Integer getStatus() {
        return this.status;
    }

    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonGetter("name")
    public String getName() {
        return this.name;
    }

    @JsonSetter("source")
    public void setSource(BackendSchemaSource source) {
        this.source = source;
    }

    @JsonGetter("source")
    public BackendSchemaSource getSource() {
        return this.source;
    }

    @JsonSetter("form")
    public void setForm(BackendSchemaForm form) {
        this.form = form;
    }

    @JsonGetter("form")
    public BackendSchemaForm getForm() {
        return this.form;
    }

    @JsonSetter("metadata")
    public void setMetadata(CommonMetadata metadata) {
        this.metadata = metadata;
    }

    @JsonGetter("metadata")
    public CommonMetadata getMetadata() {
        return this.metadata;
    }
}

