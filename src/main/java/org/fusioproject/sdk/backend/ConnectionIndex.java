/**
 * ConnectionIndex automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk.backend;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
public class ConnectionIndex {
    private ConnectionIndexEntry[] connections;
    @JsonSetter("connections")
    public void setConnections(ConnectionIndexEntry[] connections) {
        this.connections = connections;
    }
    @JsonGetter("connections")
    public ConnectionIndexEntry[] getConnections() {
        return this.connections;
    }
}