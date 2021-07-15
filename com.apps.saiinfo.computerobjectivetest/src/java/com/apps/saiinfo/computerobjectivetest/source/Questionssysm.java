/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package com.apps.saiinfo.computerobjectivetest.source;

public class Questionssysm {
    private String ANSWER;
    private String OptionA;
    private String OptionB;
    private String OptionC;
    private String OptionD;
    private String QUESTION;
    private int id;

    public Questionssysm() {
        this.id = 0;
        this.QUESTION = "";
        this.ANSWER = "";
        this.OptionA = "";
        this.OptionB = "";
        this.OptionC = "";
        this.OptionD = "";
    }

    public Questionssysm(String string, String string2, String string3, String string4, String string5, String string6) {
        this.QUESTION = string;
        this.OptionA = string2;
        this.OptionB = string3;
        this.OptionC = string4;
        this.OptionD = string5;
        this.ANSWER = string6;
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

    public void setANSWER(String string) {
        this.ANSWER = string;
    }

    public void setId(int n) {
        this.id = n;
    }

    public void setOptionA(String string) {
        this.OptionA = string;
    }

    public void setOptionB(String string) {
        this.OptionB = string;
    }

    public void setOptionC(String string) {
        this.OptionC = string;
    }

    public void setOptionD(String string) {
        this.OptionD = string;
    }

    public void setQUESTION(String string) {
        this.QUESTION = string;
    }
}

