/**
 * FormElementSelectOption automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk.backend;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
public class FormElementSelectOption {
    private String key;
    private String value;
    @JsonSetter("key")
    public void setKey(String key) {
        this.key = key;
    }
    @JsonGetter("key")
    public String getKey() {
        return this.key;
    }
    @JsonSetter("value")
    public void setValue(String value) {
        this.value = value;
    }
    @JsonGetter("value")
    public String getValue() {
        return this.value;
    }
}