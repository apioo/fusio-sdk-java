/**
 * BackendDatabaseTableColumn automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class BackendDatabaseTableColumn {
    private String name;
    private String type;
    private Integer length;
    private Integer precision;
    private Integer scale;
    private Boolean unsigned;
    private Boolean fixed;
    private Boolean notNull;
    private Boolean autoIncrement;
    private Object _default;
    private String comment;

    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonGetter("name")
    public String getName() {
        return this.name;
    }

    @JsonSetter("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonGetter("type")
    public String getType() {
        return this.type;
    }

    @JsonSetter("length")
    public void setLength(Integer length) {
        this.length = length;
    }

    @JsonGetter("length")
    public Integer getLength() {
        return this.length;
    }

    @JsonSetter("precision")
    public void setPrecision(Integer precision) {
        this.precision = precision;
    }

    @JsonGetter("precision")
    public Integer getPrecision() {
        return this.precision;
    }

    @JsonSetter("scale")
    public void setScale(Integer scale) {
        this.scale = scale;
    }

    @JsonGetter("scale")
    public Integer getScale() {
        return this.scale;
    }

    @JsonSetter("unsigned")
    public void setUnsigned(Boolean unsigned) {
        this.unsigned = unsigned;
    }

    @JsonGetter("unsigned")
    public Boolean getUnsigned() {
        return this.unsigned;
    }

    @JsonSetter("fixed")
    public void setFixed(Boolean fixed) {
        this.fixed = fixed;
    }

    @JsonGetter("fixed")
    public Boolean getFixed() {
        return this.fixed;
    }

    @JsonSetter("notNull")
    public void setNotNull(Boolean notNull) {
        this.notNull = notNull;
    }

    @JsonGetter("notNull")
    public Boolean getNotNull() {
        return this.notNull;
    }

    @JsonSetter("autoIncrement")
    public void setAutoIncrement(Boolean autoIncrement) {
        this.autoIncrement = autoIncrement;
    }

    @JsonGetter("autoIncrement")
    public Boolean getAutoIncrement() {
        return this.autoIncrement;
    }

    @JsonSetter("default")
    public void setDefault(Object _default) {
        this._default = _default;
    }

    @JsonGetter("default")
    public Object getDefault() {
        return this._default;
    }

    @JsonSetter("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    @JsonGetter("comment")
    public String getComment() {
        return this.comment;
    }
}

