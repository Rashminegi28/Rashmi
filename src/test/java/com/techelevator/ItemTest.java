package com.techelevator;

import junit.framework.TestCase;

import java.math.BigDecimal;

public class ItemTest extends TestCase {

    public void testTestGetName() {
        Item item = new Item ("Rock", "candy", "A1", new BigDecimal("1.05"), 5 );
        assertEquals("Rock", item.getName());
    }

    public void testGetLocation() {
        Item item = new Item ("Rock", "candy", "B3", new BigDecimal("1.05"), 5 );
        assertEquals("B3", item.getLocation());
    }

    public void testGetPrice() {
        Item item = new Item ("Rock", "candy", "B3", new BigDecimal("1.05"), 5 );
        assertEquals(new BigDecimal("1.05"), item.getPrice());
    }

    public void testGetType() {
        Item item = new Item ("Rock", "candy", "B3", new BigDecimal("1.05"), 5 );
        assertEquals("candy", item.getType());
    }

    public void testTestSetName() {
    }

    public void testSetLocation() {
    }

    public void testSetPrice() {
    }

    public void testSetType() {
    }
}