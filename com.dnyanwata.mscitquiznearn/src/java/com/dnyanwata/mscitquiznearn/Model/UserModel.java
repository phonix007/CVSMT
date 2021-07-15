/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package com.dnyanwata.mscitquiznearn.Model;

public class UserModel {
    private long coins = 20L;
    private String email;
    private String mobile;
    private String name;
    private String pass;
    private String status;
    private String vCode;

    public UserModel() {
    }

    public UserModel(String string2, String string3, String string4, String string5, String string6) {
        this.name = string2;
        this.email = string3;
        this.mobile = string4;
        this.pass = string5;
        this.vCode = string6;
    }

    public long getCoins() {
        return this.coins;
    }

    public String getEmail() {
        return this.email;
    }

    public String getMobile() {
        return this.mobile;
    }

    public String getName() {
        return this.name;
    }

    public String getPass() {
        return this.pass;
    }

    public String getStatus() {
        return this.status;
    }

    public String getvCode() {
        return this.vCode;
    }

    public void setCoins(long l) {
        this.coins = l;
    }

    public void setEmail(String string2) {
        this.email = string2;
    }

    public void setMobile(String string2) {
        this.mobile = string2;
    }

    public void setName(String string2) {
        this.name = string2;
    }

    public void setPass(String string2) {
        this.pass = string2;
    }

    public void setStatus(String string2) {
        this.status = string2;
    }

    public void setvCode(String string2) {
        this.vCode = string2;
    }
}

