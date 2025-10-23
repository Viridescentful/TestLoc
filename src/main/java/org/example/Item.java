package org.example;

public class Item {
    private int amount;
    private int price;

    public Item(Integer amount, Integer price) {
        this.amount = amount;
        this.price = price;
    }

    public Integer getAmount() {
        return amount;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getTotalPrice() {
        return amount * price;
    }
}
