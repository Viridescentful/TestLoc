package org;

import java.util.ArrayList;

public class ShoppingCart {
    private ArrayList<Item> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public int getTotalAmount() {
        int total = 0;
        for (Item item : items) {
            total += item.getTotalPrice();
        }
        return total;
    }
}
