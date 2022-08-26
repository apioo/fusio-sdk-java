/**
 * Transaction automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk.backend;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.time.LocalDateTime;
public class Transaction {
    private int id;
    private int userId;
    private int planId;
    private String transactionId;
    private float amount;
    private float points;
    private LocalDateTime insertDate;
    @JsonSetter("id")
    public void setId(int id) {
        this.id = id;
    }
    @JsonGetter("id")
    public int getId() {
        return this.id;
    }
    @JsonSetter("userId")
    public void setUserId(int userId) {
        this.userId = userId;
    }
    @JsonGetter("userId")
    public int getUserId() {
        return this.userId;
    }
    @JsonSetter("planId")
    public void setPlanId(int planId) {
        this.planId = planId;
    }
    @JsonGetter("planId")
    public int getPlanId() {
        return this.planId;
    }
    @JsonSetter("transactionId")
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }
    @JsonGetter("transactionId")
    public String getTransactionId() {
        return this.transactionId;
    }
    @JsonSetter("amount")
    public void setAmount(float amount) {
        this.amount = amount;
    }
    @JsonGetter("amount")
    public float getAmount() {
        return this.amount;
    }
    @JsonSetter("points")
    public void setPoints(float points) {
        this.points = points;
    }
    @JsonGetter("points")
    public float getPoints() {
        return this.points;
    }
    @JsonSetter("insertDate")
    public void setInsertDate(LocalDateTime insertDate) {
        this.insertDate = insertDate;
    }
    @JsonGetter("insertDate")
    public LocalDateTime getInsertDate() {
        return this.insertDate;
    }
}
