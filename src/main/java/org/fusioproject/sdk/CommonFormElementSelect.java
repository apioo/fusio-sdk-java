/**
 * CommonFormElementSelect automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;
public class CommonFormElementSelect extends CommonFormElement {
    private List<CommonFormElementSelectOption> options;
    @JsonSetter("options")
    public void setOptions(List<CommonFormElementSelectOption> options) {
        this.options = options;
    }
    @JsonGetter("options")
    public List<CommonFormElementSelectOption> getOptions() {
        return this.options;
    }
}
