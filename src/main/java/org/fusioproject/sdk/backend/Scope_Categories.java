/**
 * Scope_Categories automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk.backend;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
public class Scope_Categories {
    private Scope_Category[] categories;
    @JsonSetter("categories")
    public void setCategories(Scope_Category[] categories) {
        this.categories = categories;
    }
    @JsonGetter("categories")
    public Scope_Category[] getCategories() {
        return this.categories;
    }
}