/**
 * BackendGeneratorProvider automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;
public class BackendGeneratorProvider {
    private String path;
    private List<String> scopes;
    private Boolean _public;
    private BackendGeneratorProviderConfig config;
    @JsonSetter("path")
    public void setPath(String path) {
        this.path = path;
    }
    @JsonGetter("path")
    public String getPath() {
        return this.path;
    }
    @JsonSetter("scopes")
    public void setScopes(List<String> scopes) {
        this.scopes = scopes;
    }
    @JsonGetter("scopes")
    public List<String> getScopes() {
        return this.scopes;
    }
    @JsonSetter("public")
    public void setPublic(Boolean _public) {
        this._public = _public;
    }
    @JsonGetter("public")
    public Boolean getPublic() {
        return this._public;
    }
    @JsonSetter("config")
    public void setConfig(BackendGeneratorProviderConfig config) {
        this.config = config;
    }
    @JsonGetter("config")
    public BackendGeneratorProviderConfig getConfig() {
        return this.config;
    }
}
