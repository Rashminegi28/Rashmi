package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class VendingMachine {

    private Map<String, Item> slots = new TreeMap<>();

    public void restockMachine(String fileName) throws FileNotFoundException {
        File itemsFile = new File(fileName);
        if (itemsFile.exists()) {
            try (Scanner scanner = new Scanner(itemsFile)) {
                while (scanner.hasNextLine()) {
                    String itemLine = scanner.nextLine();
                    String[] newItemInfo = itemLine.split("\\|");
                    Item item = new Item(newItemInfo[1],newItemInfo[3], newItemInfo[0], new BigDecimal(newItemInfo[2]), 5);
                    slots.put(newItemInfo[0], item);
                }
            }
        }
    }

    public Map<String, Item> getSlots() {
        return slots;
    }




}
