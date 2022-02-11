package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class VendingMachine {
    private BigDecimal balance;
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
    public BigDecimal currentMoneyProvided(BigDecimal moneyInput) {
        if (moneyInput.equals(BigDecimal.valueOf(1.0)) || moneyInput.equals(BigDecimal.valueOf(2.0)) ||
                moneyInput.equals(BigDecimal.valueOf(5.0)) || moneyInput.equals(BigDecimal.valueOf(10.0))) {
            balance.add(moneyInput);
        } else {

        } return balance;

    }
    public String selectProductSlot(String inputtedItem) {
        Item item = new Item(item.getName(), item.getType(), item.getLocation(), item.getPrice(), item.getCount());
        int count = item.getCount();
        if (!inputtedItem.equals(item.getLocation())){
        }
        if (inputtedItem.equals(item.getLocation())) {
            int comparePrice = balance.compareTo(item.getPrice());
                if (comparePrice >= 0) {
                    balance.subtract(item.getPrice());
                    count--;
                    String printOut = item.getName() +", " + item.getPrice()+ ", " + balance;
                    return printOut;
                }


                }


        }

    public Item selectProduct(String slotId){
        return slots.get(slotId);
    }
    public Map<String, Item> getSlots() {
        return slots;
    }
    public BigDecimal getBalance() {
        return balance;
    }




}
