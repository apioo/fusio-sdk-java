/**
 * BackendScopeCategories automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk;

import com.fasterxml.jackson.annotation.*;

public class BackendScopeCategories {
    private java.util.List<BackendScopeCategory> categories;

    @JsonSetter("categories")
    public void setCategories(java.util.List<BackendScopeCategory> categories) {
        this.categories = categories;
    }

    @JsonGetter("categories")
    public java.util.List<BackendScopeCategory> getCategories() {
        return this.categories;
    }
}

