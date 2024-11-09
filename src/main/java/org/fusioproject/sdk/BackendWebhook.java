/**
 * BackendWebhook automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk;

import com.fasterxml.jackson.annotation.*;

public class BackendWebhook {
    private Integer id;
    private Integer eventId;
    private Integer userId;
    private String name;
    private String endpoint;
    private java.util.List<BackendWebhookResponse> responses;

    @JsonSetter("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonGetter("id")
    public Integer getId() {
        return this.id;
    }

    @JsonSetter("eventId")
    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    @JsonGetter("eventId")
    public Integer getEventId() {
        return this.eventId;
    }

    @JsonSetter("userId")
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @JsonGetter("userId")
    public Integer getUserId() {
        return this.userId;
    }

    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonGetter("name")
    public String getName() {
        return this.name;
    }

    @JsonSetter("endpoint")
    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    @JsonGetter("endpoint")
    public String getEndpoint() {
        return this.endpoint;
    }

    @JsonSetter("responses")
    public void setResponses(java.util.List<BackendWebhookResponse> responses) {
        this.responses = responses;
    }

    @JsonGetter("responses")
    public java.util.List<BackendWebhookResponse> getResponses() {
        return this.responses;
    }
}

