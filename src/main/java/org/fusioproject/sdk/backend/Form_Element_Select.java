/**
 * Form_Element_Select automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk.backend;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
public class Form_Element_Select extends Form_Element {
    private Form_Element_Select_Option[] options;
    @JsonSetter("options")
    public void setOptions(Form_Element_Select_Option[] options) {
        this.options = options;
    }
    @JsonGetter("options")
    public Form_Element_Select_Option[] getOptions() {
        return this.options;
    }
}