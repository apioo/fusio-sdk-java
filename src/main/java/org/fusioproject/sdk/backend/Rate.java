/**
 * Rate automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk.backend;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.time.Duration;
public class Rate {
    private int id;
    private int priority;
    private String name;
    private int rateLimit;
    private Duration timespan;
    private RateAllocation[] allocation;
    private Metadata metadata;
    @JsonSetter("id")
    public void setId(int id) {
        this.id = id;
    }
    @JsonGetter("id")
    public int getId() {
        return this.id;
    }
    @JsonSetter("priority")
    public void setPriority(int priority) {
        this.priority = priority;
    }
    @JsonGetter("priority")
    public int getPriority() {
        return this.priority;
    }
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }
    @JsonGetter("name")
    public String getName() {
        return this.name;
    }
    @JsonSetter("rateLimit")
    public void setRateLimit(int rateLimit) {
        this.rateLimit = rateLimit;
    }
    @JsonGetter("rateLimit")
    public int getRateLimit() {
        return this.rateLimit;
    }
    @JsonSetter("timespan")
    public void setTimespan(Duration timespan) {
        this.timespan = timespan;
    }
    @JsonGetter("timespan")
    public Duration getTimespan() {
        return this.timespan;
    }
    @JsonSetter("allocation")
    public void setAllocation(RateAllocation[] allocation) {
        this.allocation = allocation;
    }
    @JsonGetter("allocation")
    public RateAllocation[] getAllocation() {
        return this.allocation;
    }
    @JsonSetter("metadata")
    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }
    @JsonGetter("metadata")
    public Metadata getMetadata() {
        return this.metadata;
    }
}
