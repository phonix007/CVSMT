/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package com.dnyanwata.mscitquiznearn.Model;

public class QuestionModel {
    private String answer;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String question;

    public QuestionModel() {
    }

    public QuestionModel(String string2, String string3, String string4, String string5, String string6, String string7) {
        this.question = string2;
        this.option1 = string3;
        this.option2 = string4;
        this.option3 = string5;
        this.option4 = string6;
        this.answer = string7;
    }

    public String getAnswer() {
        return this.answer;
    }

    public String getOption1() {
        return this.option1;
    }

    public String getOption2() {
        return this.option2;
    }

    public String getOption3() {
        return this.option3;
    }

    public String getOption4() {
        return this.option4;
    }

    public String getQuestion() {
        return this.question;
    }

    public void setAnswer(String string2) {
        this.answer = string2;
    }

    public void setOption1(String string2) {
        this.option1 = string2;
    }

    public void setOption2(String string2) {
        this.option2 = string2;
    }

    public void setOption3(String string2) {
        this.option3 = string2;
    }

    public void setOption4(String string2) {
        this.option4 = string2;
    }

    public void setQuestion(String string2) {
        this.question = string2;
    }
}

