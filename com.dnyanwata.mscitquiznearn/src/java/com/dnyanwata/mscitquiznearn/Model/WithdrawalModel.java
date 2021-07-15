/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.google.firebase.firestore.ServerTimestamp
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Date
 */
package com.dnyanwata.mscitquiznearn.Model;

import com.google.firebase.firestore.ServerTimestamp;
import java.util.Date;

public class WithdrawalModel {
    @ServerTimestamp
    private Date createdAt;
    private String mobileNo;
    private String requestBy;
    private String upiId;
    private String userId;

    public WithdrawalModel() {
    }

    public WithdrawalModel(String string2, String string3, String string4, String string5) {
        this.userId = string2;
        this.mobileNo = string3;
        this.requestBy = string4;
        this.upiId = string5;
    }

    public Date getCreatedAt() {
        return this.createdAt;
    }

    public String getMobileNo() {
        return this.mobileNo;
    }

    public String getRequestBy() {
        return this.requestBy;
    }

    public String getUpiId() {
        return this.upiId;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setCreatedAt(Date date) {
        this.createdAt = date;
    }

    public void setMobileNo(String string2) {
        this.mobileNo = string2;
    }

    public void setRequestBy(String string2) {
        this.requestBy = string2;
    }

    public void setUpiId(String string2) {
        this.upiId = string2;
    }

    public void setUserId(String string2) {
        this.userId = string2;
    }
}

