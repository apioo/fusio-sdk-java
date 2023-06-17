/**
 * Plan automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk.backend;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
public class Plan {
    private int id;
    private String name;
    private String description;
    private double price;
    private int points;
    private int period;
    private String externalId;
    private String[] scopes;
    private Metadata metadata;
    @JsonSetter("id")
    public void setId(int id) {
        this.id = id;
    }
    @JsonGetter("id")
    public int getId() {
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
    public void setPrice(double price) {
        this.price = price;
    }
    @JsonGetter("price")
    public double getPrice() {
        return this.price;
    }
    @JsonSetter("points")
    public void setPoints(int points) {
        this.points = points;
    }
    @JsonGetter("points")
    public int getPoints() {
        return this.points;
    }
    @JsonSetter("period")
    public void setPeriod(int period) {
        this.period = period;
    }
    @JsonGetter("period")
    public int getPeriod() {
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
    public void setScopes(String[] scopes) {
        this.scopes = scopes;
    }
    @JsonGetter("scopes")
    public String[] getScopes() {
        return this.scopes;
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
