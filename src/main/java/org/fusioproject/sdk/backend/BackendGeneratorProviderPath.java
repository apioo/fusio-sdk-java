/**
 * BackendGeneratorProviderPath automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk.backend;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
public class BackendGeneratorProviderPath {
    private String provider;
    @JsonSetter("provider")
    public void setProvider(String provider) {
        this.provider = provider;
    }
    @JsonGetter("provider")
    public String getProvider() {
        return this.provider;
    }
}