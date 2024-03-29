package model;

import java.io.Serializable;

public class Goods implements Serializable {
    private String goodsId;
    private String productName;
    private double price;
    private int amount;

    public Goods() {
    }

    public Goods(String goodsId, String productName, double price, int amount) {
        this.goodsId = goodsId;
        this.productName = productName;
        this.price = price;
        this.amount = amount;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "goodsId='" + goodsId + '\'' +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", amount=" + amount +
                '}';
    }
}
