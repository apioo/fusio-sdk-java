/**
 * Connection_Index_Entry automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk.backend;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
public class Connection_Index_Entry {
    private String name;
    private String _class;
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }
    @JsonGetter("name")
    public String getName() {
        return this.name;
    }
    @JsonSetter("class")
    public void set_Class(String _class) {
        this._class = _class;
    }
    @JsonGetter("class")
    public String get_Class() {
        return this._class;
    }
}
