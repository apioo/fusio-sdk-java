/**
 * BackendEventSubscriptionSubscriptionIdPath automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk.backend;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
public class BackendEventSubscriptionSubscriptionIdPath {
    private String subscriptionId;
    @JsonSetter("subscription_id")
    public void setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }
    @JsonGetter("subscription_id")
    public String getSubscriptionId() {
        return this.subscriptionId;
    }
}
