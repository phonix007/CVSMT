/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package com.apps.saiinfo.computerobjectivetest.source;

public class Questionshsys {
    private String ANSWER;
    private String OptionA;
    private String OptionB;
    private String OptionC;
    private String OptionD;
    private String QUESTION;
    private int id;

    public Questionshsys() {
        this.id = 0;
        this.QUESTION = "";
        this.ANSWER = "";
        this.OptionA = "";
        this.OptionB = "";
        this.OptionC = "";
        this.OptionD = "";
    }

    public Questionshsys(String string2, String string3, String string4, String string5, String string6, String string7) {
        this.QUESTION = string2;
        this.OptionA = string3;
        this.OptionB = string4;
        this.OptionC = string5;
        this.OptionD = string6;
        this.ANSWER = string7;
    }

    public String getANSWER() {
        return this.ANSWER;
    }

    public int getId() {
        return this.id;
    }

    public String getOptionA() {
        return this.OptionA;
    }

    public String getOptionB() {
        return this.OptionB;
    }

    public String getOptionC() {
        return this.OptionC;
    }

    public String getOptionD() {
        return this.OptionD;
    }

    public String getQUESTION() {
        return this.QUESTION;
    }

    public void setANSWER(String string2) {
        this.ANSWER = string2;
    }

    public void setId(int n) {
        this.id = n;
    }

    public void setOptionA(String string2) {
        this.OptionA = string2;
    }

    public void setOptionB(String string2) {
        this.OptionB = string2;
    }

    public void setOptionC(String string2) {
        this.OptionC = string2;
    }

    public void setOptionD(String string2) {
        this.OptionD = string2;
    }

    public void setQUESTION(String string2) {
        this.QUESTION = string2;
    }
}

