/**
 * ConsumerPaymentCheckoutResponse automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk;

import com.fasterxml.jackson.annotation.*;

public class ConsumerPaymentCheckoutResponse {
    private String approvalUrl;

    @JsonSetter("approvalUrl")
    public void setApprovalUrl(String approvalUrl) {
        this.approvalUrl = approvalUrl;
    }

    @JsonGetter("approvalUrl")
    public String getApprovalUrl() {
        return this.approvalUrl;
    }
}

