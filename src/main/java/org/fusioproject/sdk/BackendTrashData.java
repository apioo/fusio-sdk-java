/**
 * BackendTrashData automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;
public class BackendTrashData {
    private int id;
    private int status;
    private String name;
    @JsonSetter("id")
    public void setId(int id) {
        this.id = id;
    }
    @JsonGetter("id")
    public int getId() {
        return this.id;
    }
    @JsonSetter("status")
    public void setStatus(int status) {
        this.status = status;
    }
    @JsonGetter("status")
    public int getStatus() {
        return this.status;
    }
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }
    @JsonGetter("name")
    public String getName() {
        return this.name;
    }
}
