/**
 * Collection_Query automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk.backend;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
public class Collection_Query {
    private int startIndex;
    private int count;
    private String search;
    @JsonSetter("startIndex")
    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }
    @JsonGetter("startIndex")
    public int getStartIndex() {
        return this.startIndex;
    }
    @JsonSetter("count")
    public void setCount(int count) {
        this.count = count;
    }
    @JsonGetter("count")
    public int getCount() {
        return this.count;
    }
    @JsonSetter("search")
    public void setSearch(String search) {
        this.search = search;
    }
    @JsonGetter("search")
    public String getSearch() {
        return this.search;
    }
}
