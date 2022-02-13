package com.techelevator;

import junit.framework.TestCase;

import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class VendingMachineTest extends TestCase {

    public void testRestockMachine() {

    }

    public void testGetSlots() {

    }

    public void testTestRestockMachine() {
    }

    public void testTestGetSlots() {
    }

    public void testCurrentMoneyProvided() throws NumberFormatException, FileNotFoundException {
        VendingMachine vending = new VendingMachine();
        assertEquals(false, vending.currentMoneyProvided(new BigDecimal("6.00")));
        assertEquals(true, vending.currentMoneyProvided(new BigDecimal("5.00")));

    }

    public void testSelectProductSlot() {
        VendingMachine vending = new VendingMachine();

//        assertEquals("Potato Crisps, 3.05, 5.00 Crunch, Crunch, Yum!",  );
    }

    public void testReturnChange() throws FileNotFoundException {
//        VendingMachine vending = new VendingMachine();
//        BigDecimal balance = new BigDecimal("1.00");
//        assertEquals("4 quarters, 0.00 dimes, 0.00 nickels", vending.returnChange(balance));
    }
//
    public void testGetBalance() {
    }
}