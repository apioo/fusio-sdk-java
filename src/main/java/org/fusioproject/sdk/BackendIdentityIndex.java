/**
 * BackendIdentityIndex automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
public class BackendIdentityIndex {
    private BackendIdentityIndexEntry[] providers;
    @JsonSetter("providers")
    public void setProviders(BackendIdentityIndexEntry[] providers) {
        this.providers = providers;
    }
    @JsonGetter("providers")
    public BackendIdentityIndexEntry[] getProviders() {
        return this.providers;
    }
}