package com.andrew.demo.entity;

/**
 * @Author Andrew Yang
 * @ClassName OrderInfo
 * @Description
 * @Package com.andrew.demo.entity
 * @Create 2021-08-24 11:21
 */
public class OrderInfo {
    private int id;
    private String buyName;
    private String buyGoods;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBuyName() {
        return buyName;
    }

    public void setBuyName(String buyName) {
        this.buyName = buyName;
    }

    public String getBuyGoods() {
        return buyGoods;
    }

    public void setBuyGoods(String buyGoods) {
        this.buyGoods = buyGoods;
    }
}
