/**
 * BackendConnectionIntrospectionEntityRow automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;
public class BackendConnectionIntrospectionEntityRow {
    private List<String> values;
    @JsonSetter("values")
    public void setValues(List<String> values) {
        this.values = values;
    }
    @JsonGetter("values")
    public List<String> getValues() {
        return this.values;
    }
}
