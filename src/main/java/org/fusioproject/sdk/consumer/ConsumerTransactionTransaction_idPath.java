/**
 * ConsumerTransactionTransaction_idPath automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk.consumer;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
public class ConsumerTransactionTransaction_idPath {
    private String transaction_id;
    @JsonSetter("transaction_id")
    public void setTransaction_id(String transaction_id) {
        this.transaction_id = transaction_id;
    }
    @JsonGetter("transaction_id")
    public String getTransaction_id() {
        return this.transaction_id;
    }
}