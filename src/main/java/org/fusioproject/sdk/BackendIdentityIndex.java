/**
 * BackendIdentityIndex automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;
public class BackendIdentityIndex {
    private List<BackendIdentityIndexEntry> providers;
    @JsonSetter("providers")
    public void setProviders(List<BackendIdentityIndexEntry> providers) {
        this.providers = providers;
    }
    @JsonGetter("providers")
    public List<BackendIdentityIndexEntry> getProviders() {
        return this.providers;
    }
}
