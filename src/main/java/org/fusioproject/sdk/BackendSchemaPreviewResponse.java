/**
 * BackendSchemaPreviewResponse automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
public class BackendSchemaPreviewResponse {
    private String preview;
    @JsonSetter("preview")
    public void setPreview(String preview) {
        this.preview = preview;
    }
    @JsonGetter("preview")
    public String getPreview() {
        return this.preview;
    }
}