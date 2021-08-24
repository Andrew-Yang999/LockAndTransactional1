package com.andrew.demo.entity;

/**
 * @Author Andrew Yang
 * @ClassName Product
 * @Description
 * @Package com.andrew.demo.entity
 * @Create 2021-08-24 10:06
 */
public class Product {
    int id;
    String productName;
    Integer productCount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getProductCount() {
        return productCount;
    }

    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }
}
