/**
 * BackendTransaction automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;
import java.time.LocalDateTime;
public class BackendTransaction {
    private int id;
    private int userId;
    private int planId;
    private String transactionId;
    private double amount;
    private double points;
    private LocalDateTime periodStart;
    private LocalDateTime periodEnd;
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
    public void setAmount(double amount) {
        this.amount = amount;
    }
    @JsonGetter("amount")
    public double getAmount() {
        return this.amount;
    }
    @JsonSetter("points")
    public void setPoints(double points) {
        this.points = points;
    }
    @JsonGetter("points")
    public double getPoints() {
        return this.points;
    }
    @JsonSetter("periodStart")
    public void setPeriodStart(LocalDateTime periodStart) {
        this.periodStart = periodStart;
    }
    @JsonGetter("periodStart")
    public LocalDateTime getPeriodStart() {
        return this.periodStart;
    }
    @JsonSetter("periodEnd")
    public void setPeriodEnd(LocalDateTime periodEnd) {
        this.periodEnd = periodEnd;
    }
    @JsonGetter("periodEnd")
    public LocalDateTime getPeriodEnd() {
        return this.periodEnd;
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
