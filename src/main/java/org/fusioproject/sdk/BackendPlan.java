/**
 * BackendPlan automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk;

import com.fasterxml.jackson.annotation.*;

public class BackendPlan {
    private Integer id;
    private String name;
    private String description;
    private Double price;
    private Integer points;
    private Integer period;
    private String externalId;
    private java.util.List<String> scopes;
    private CommonMetadata metadata;

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

    @JsonSetter("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonGetter("description")
    public String getDescription() {
        return this.description;
    }

    @JsonSetter("price")
    public void setPrice(Double price) {
        this.price = price;
    }

    @JsonGetter("price")
    public Double getPrice() {
        return this.price;
    }

    @JsonSetter("points")
    public void setPoints(Integer points) {
        this.points = points;
    }

    @JsonGetter("points")
    public Integer getPoints() {
        return this.points;
    }

    @JsonSetter("period")
    public void setPeriod(Integer period) {
        this.period = period;
    }

    @JsonGetter("period")
    public Integer getPeriod() {
        return this.period;
    }

    @JsonSetter("externalId")
    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    @JsonGetter("externalId")
    public String getExternalId() {
        return this.externalId;
    }

    @JsonSetter("scopes")
    public void setScopes(java.util.List<String> scopes) {
        this.scopes = scopes;
    }

    @JsonGetter("scopes")
    public java.util.List<String> getScopes() {
        return this.scopes;
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

