package com.techelevator;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;

public class VendingMachineTest extends TestCase {

    @Test
    public void testRestockMachine() {

    }
    @Test

    public void testGetSlots() {

    }
    @Test
    public void testTestRestockMachine() {

    }
    @Test
    public void testTestGetSlots() {
    }
    @Test
    public void testCurrentMoneyProvided() throws NumberFormatException, FileNotFoundException {
        VendingMachine vending = new VendingMachine();
        assertEquals(false, vending.currentMoneyDeposited(new BigDecimal("6.00")));
        assertEquals(true, vending.currentMoneyDeposited(new BigDecimal("5.00")));

    }
    @Test
    public void testSelectProductSlot() {
        VendingMachine vending = new VendingMachine();


    }
    @Test
    public void testReturnChange() throws FileNotFoundException {
        VendingMachine vending = new VendingMachine();
        BigDecimal balance;
        assertEquals("4 quarters 0.0 dimes 0.00 nickels", vending.returnChange(balance = new BigDecimal("1.00")));
        assertEquals("0 quarters 0.0 dimes 0.00 nickels", vending.returnChange(balance = new BigDecimal("0.00")));
        assertEquals("4 quarters 2.0 dimes 0.00 nickels", vending.returnChange(balance = new BigDecimal("1.20")));
        assertEquals("3 quarters 1.0 dimes 1.00 nickels", vending.returnChange(balance = new BigDecimal("0.90")));
    }
//
    @Test
    public void testGetBalance() {
        VendingMachine vending = new VendingMachine();
        BigDecimal expected = new BigDecimal("1.00");
        BigDecimal balance = new BigDecimal("1.00");
        Assert.assertTrue(expected.compareTo(balance) == 0);
    }
}