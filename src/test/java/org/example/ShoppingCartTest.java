package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShoppingCartTest {
    ShoppingCart cart;
    Item item1;
    Item item2;
    Item item3;

    @BeforeEach
    void setUp() {
        cart = new ShoppingCart();

        item1 = new Item(2, 3);
        item2 = new Item(5, 4);
        item3 = new Item(1, 10);

        cart.addItem(item1);
        cart.addItem(item2);
        cart.addItem(item3);
    }

    @Test
    void getTotalAmount() {
        assertEquals(36, cart.getTotalAmount());
    }
}