/**
 * ConsumerEventSubscriptionUpdate automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;
public class ConsumerEventSubscriptionUpdate {
    private String event;
    private String endpoint;
    @JsonSetter("event")
    public void setEvent(String event) {
        this.event = event;
    }
    @JsonGetter("event")
    public String getEvent() {
        return this.event;
    }
    @JsonSetter("endpoint")
    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }
    @JsonGetter("endpoint")
    public String getEndpoint() {
        return this.endpoint;
    }
}
