/**
 * BackendDatabaseTableForeignKeyConstraint automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;
public class BackendDatabaseTableForeignKeyConstraint {
    private String name;
    private String foreignTable;
    private List<String> localColumnNames;
    private List<String> foreignColumnNames;
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }
    @JsonGetter("name")
    public String getName() {
        return this.name;
    }
    @JsonSetter("foreignTable")
    public void setForeignTable(String foreignTable) {
        this.foreignTable = foreignTable;
    }
    @JsonGetter("foreignTable")
    public String getForeignTable() {
        return this.foreignTable;
    }
    @JsonSetter("localColumnNames")
    public void setLocalColumnNames(List<String> localColumnNames) {
        this.localColumnNames = localColumnNames;
    }
    @JsonGetter("localColumnNames")
    public List<String> getLocalColumnNames() {
        return this.localColumnNames;
    }
    @JsonSetter("foreignColumnNames")
    public void setForeignColumnNames(List<String> foreignColumnNames) {
        this.foreignColumnNames = foreignColumnNames;
    }
    @JsonGetter("foreignColumnNames")
    public List<String> getForeignColumnNames() {
        return this.foreignColumnNames;
    }
}