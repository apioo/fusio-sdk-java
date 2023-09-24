/**
 * BackendGeneratorProviderChangelog automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
public class BackendGeneratorProviderChangelog {
    private BackendSchema[] schemas;
    private BackendAction[] actions;
    private BackendOperation[] operations;
    @JsonSetter("schemas")
    public void setSchemas(BackendSchema[] schemas) {
        this.schemas = schemas;
    }
    @JsonGetter("schemas")
    public BackendSchema[] getSchemas() {
        return this.schemas;
    }
    @JsonSetter("actions")
    public void setActions(BackendAction[] actions) {
        this.actions = actions;
    }
    @JsonGetter("actions")
    public BackendAction[] getActions() {
        return this.actions;
    }
    @JsonSetter("operations")
    public void setOperations(BackendOperation[] operations) {
        this.operations = operations;
    }
    @JsonGetter("operations")
    public BackendOperation[] getOperations() {
        return this.operations;
    }
}