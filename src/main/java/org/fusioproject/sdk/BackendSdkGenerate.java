/**
 * BackendSdkGenerate automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
public class BackendSdkGenerate {
    private String format;
    private String config;
    @JsonSetter("format")
    public void setFormat(String format) {
        this.format = format;
    }
    @JsonGetter("format")
    public String getFormat() {
        return this.format;
    }
    @JsonSetter("config")
    public void setConfig(String config) {
        this.config = config;
    }
    @JsonGetter("config")
    public String getConfig() {
        return this.config;
    }
}