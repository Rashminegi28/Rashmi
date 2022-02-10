package com.techelevator;

import java.math.BigDecimal;
import java.util.Map;
import java.util.TreeMap;

public class VendingMachine {
    private int itemsLeftInSlot;
    private Map<Item,String> slots = new TreeMap<>();

    private VendingMachine(int itemsLeftInSlot, Map<Item,String> slots){
        this.itemsLeftInSlot= 5;
        this.slots = slots;

    }

    public int getItemsLeftInSlot() {
        return itemsLeftInSlot;
    }

    public Map<Item, String> getSlots() {

        return slots;

    }

    public void setItemsLeftInSlot(int itemsLeftInSlot) {
        this.itemsLeftInSlot = itemsLeftInSlot;
    }


}
