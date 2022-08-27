/**
 * Collection automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk.backend;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
public class Collection<T> {
    private int totalResults;
    private int startIndex;
    private int itemsPerPage;
    private T[] entry;
    @JsonSetter("totalResults")
    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }
    @JsonGetter("totalResults")
    public int getTotalResults() {
        return this.totalResults;
    }
    @JsonSetter("startIndex")
    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }
    @JsonGetter("startIndex")
    public int getStartIndex() {
        return this.startIndex;
    }
    @JsonSetter("itemsPerPage")
    public void setItemsPerPage(int itemsPerPage) {
        this.itemsPerPage = itemsPerPage;
    }
    @JsonGetter("itemsPerPage")
    public int getItemsPerPage() {
        return this.itemsPerPage;
    }
    @JsonSetter("entry")
    public void setEntry(T[] entry) {
        this.entry = entry;
    }
    @JsonGetter("entry")
    public T[] getEntry() {
        return this.entry;
    }
}
