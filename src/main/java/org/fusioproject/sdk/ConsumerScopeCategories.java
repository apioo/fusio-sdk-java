/**
 * ConsumerScopeCategories automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk;

import com.fasterxml.jackson.annotation.*;

public class ConsumerScopeCategories {
    private java.util.List<ConsumerScopeCategory> categories;

    @JsonSetter("categories")
    public void setCategories(java.util.List<ConsumerScopeCategory> categories) {
        this.categories = categories;
    }

    @JsonGetter("categories")
    public java.util.List<ConsumerScopeCategory> getCategories() {
        return this.categories;
    }
}

