/**
 * BackendTransactionTransactionIdPath automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk.backend;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
public class BackendTransactionTransactionIdPath {
    private String transactionId;
    @JsonSetter("transaction_id")
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }
    @JsonGetter("transaction_id")
    public String getTransactionId() {
        return this.transactionId;
    }
}
