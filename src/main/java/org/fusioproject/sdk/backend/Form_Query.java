/**
 * Form_Query automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk.backend;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
public class Form_Query {
    private String _class;
    @JsonSetter("class")
    public void set_Class(String _class) {
        this._class = _class;
    }
    @JsonGetter("class")
    public String get_Class() {
        return this._class;
    }
}