/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package com.dnyanwata.mscitquiznearn.Model;

public class CategoryModel {
    private String categoryId;
    private String categoryImage;
    private String categoryName;

    public CategoryModel() {
    }

    public CategoryModel(String string2, String string3, String string4) {
        this.categoryId = string2;
        this.categoryName = string3;
        this.categoryImage = string4;
    }

    public String getCategoryId() {
        return this.categoryId;
    }

    public String getCategoryImage() {
        return this.categoryImage;
    }

    public String getCategoryName() {
        return this.categoryName;
    }

    public void setCategoryId(String string2) {
        this.categoryId = string2;
    }

    public void setCategoryImage(String string2) {
        this.categoryImage = string2;
    }

    public void setCategoryName(String string2) {
        this.categoryName = string2;
    }
}

