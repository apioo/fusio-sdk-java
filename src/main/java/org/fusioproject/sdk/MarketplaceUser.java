/**
 * MarketplaceUser automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk;

import com.fasterxml.jackson.annotation.*;

public class MarketplaceUser {
    private Integer id;
    private String name;
    private Boolean verified;

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

    @JsonSetter("verified")
    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    @JsonGetter("verified")
    public Boolean getVerified() {
        return this.verified;
    }
}

