package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ItemTest {
    Item item1;

    @BeforeEach
    void setUp() {
        item1 = new Item(2, 3);
    }

    @Test
    void getAmount() {
        assertEquals(2, item1.getAmount());
    }

    @Test
    void getPrice() {
        assertEquals(3, item1.getPrice());
    }

    @Test
    void getTotalPrice() {
        assertEquals(6, item1.getTotalPrice());
    }
}