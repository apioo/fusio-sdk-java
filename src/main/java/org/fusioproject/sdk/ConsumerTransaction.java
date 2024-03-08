/**
 * ConsumerTransaction automatically generated by SDKgen please do not edit this file manually
 * @see https://sdkgen.app
 */

package org.fusioproject.sdk;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;
import java.util.List;
import java.time.LocalDateTime;
public class ConsumerTransaction {
    private Integer id;
    private Integer userId;
    private Integer planId;
    private ConsumerPlan plan;
    private String transactionId;
    private Double amount;
    private Double points;
    private LocalDateTime periodStart;
    private LocalDateTime periodEnd;
    private LocalDateTime insertDate;
    @JsonSetter("id")
    public void setId(Integer id) {
        this.id = id;
    }
    @JsonGetter("id")
    public Integer getId() {
        return this.id;
    }
    @JsonSetter("userId")
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    @JsonGetter("userId")
    public Integer getUserId() {
        return this.userId;
    }
    @JsonSetter("planId")
    public void setPlanId(Integer planId) {
        this.planId = planId;
    }
    @JsonGetter("planId")
    public Integer getPlanId() {
        return this.planId;
    }
    @JsonSetter("plan")
    public void setPlan(ConsumerPlan plan) {
        this.plan = plan;
    }
    @JsonGetter("plan")
    public ConsumerPlan getPlan() {
        return this.plan;
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
    public void setAmount(Double amount) {
        this.amount = amount;
    }
    @JsonGetter("amount")
    public Double getAmount() {
        return this.amount;
    }
    @JsonSetter("points")
    public void setPoints(Double points) {
        this.points = points;
    }
    @JsonGetter("points")
    public Double getPoints() {
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
