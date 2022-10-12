/**
 * Schema automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk.backend;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
public class Schema {
    private int id;
    private int status;
    private String name;
    private SchemaSource source;
    private SchemaForm form;
    private Metadata metadata;
    @JsonSetter("id")
    public void setId(int id) {
        this.id = id;
    }
    @JsonGetter("id")
    public int getId() {
        return this.id;
    }
    @JsonSetter("status")
    public void setStatus(int status) {
        this.status = status;
    }
    @JsonGetter("status")
    public int getStatus() {
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
    public void setSource(SchemaSource source) {
        this.source = source;
    }
    @JsonGetter("source")
    public SchemaSource getSource() {
        return this.source;
    }
    @JsonSetter("form")
    public void setForm(SchemaForm form) {
        this.form = form;
    }
    @JsonGetter("form")
    public SchemaForm getForm() {
        return this.form;
    }
    @JsonSetter("metadata")
    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }
    @JsonGetter("metadata")
    public Metadata getMetadata() {
        return this.metadata;
    }
}
