/**
 * GeneratorIndexProviders automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk.backend;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
public class GeneratorIndexProviders {
    private GeneratorIndexProvider[] providers;
    @JsonSetter("providers")
    public void setProviders(GeneratorIndexProvider[] providers) {
        this.providers = providers;
    }
    @JsonGetter("providers")
    public GeneratorIndexProvider[] getProviders() {
        return this.providers;
    }
}