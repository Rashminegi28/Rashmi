package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class VendingMachine<Static> {
    private BigDecimal balance;
    private Map<String, Item> slots = new HashMap<>();

    private static final BigDecimal QUARTERS = new BigDecimal("0.25");
    private static final BigDecimal DIMES =  new BigDecimal("0.1");
    private static final BigDecimal NICKELS = new BigDecimal("0.05");

    public VendingMachine(){

    }
    public void restockMachine(String fileName) throws FileNotFoundException {
        File itemsFile = new File(fileName);
        if (itemsFile.exists()) {
            try (Scanner scanner = new Scanner(itemsFile)) {
                while (scanner.hasNextLine()) {
                    String itemLine = scanner.nextLine();
                    String[] newItemInfo = itemLine.split("\\|");
                    Item item = new Item(newItemInfo[1], newItemInfo[3], newItemInfo[0], new BigDecimal(newItemInfo[2]));
                    slots.put(newItemInfo[0], item);
                }
            }
        }
    }
    public Map<String, Item> getSlots() {
        return slots;
    }
    public void currentMoneyProvided(BigDecimal moneyInput) {
        if (moneyInput.equals(new BigDecimal("1.00")) || moneyInput.equals(new BigDecimal("2.00")) ||
                moneyInput.equals(new BigDecimal("5.00")) || moneyInput.equals(new BigDecimal("10.00"))) {
            balance.add(moneyInput);
        }

    }

    public String selectProductSlot(Item inputtedItem) {
        Item item = new Item(item.getName(), item.getType(), item.getLocation(), item.getPrice(), item.getCount());

        int count = item.getCount();
        String printOut = "";
        if (!inputtedItem.equals(item.getLocation())) {
            printOut = "invalid slot";
        }
        if (count == 0) {
            printOut = "Sold out";
        }
        if (count >= 0 && inputtedItem.equals(item.getLocation())) {
            int comparePrice = balance.compareTo(item.getPrice());
            if (comparePrice >= 0) {
                balance.subtract(item.getPrice());
                count--;
                   printOut = item.getName() + ", " + item.getPrice() + ", " + balance;
                if (item.getType().equals("Chip")) {
                    return printOut += "Crunch, Crunch, Yum!";
                } else if (item.getType().equals("Candy")) {
                    return printOut += "Munch, Munch, Yum!";
                }else if (item.getType().equals("Drink")) {
                    return printOut += "Glug, Glug, Yum!";
                } else if (item.getType().equals("Gum")) {
                    return printOut += "Chew, Chew, Yum!";
                }

            }
        } return printOut;
    }

    public String returnChange() {
        BigDecimal change = balance;
        BigDecimal[] quarterChange = change.divideAndRemainder(QUARTERS);
        String numQuarters = quarterChange[0].toString();
        BigDecimal[] dimeChange = quarterChange[1].divideAndRemainder(DIMES);
        String numDime = dimeChange[0].toString();
        BigDecimal nickelChange = dimeChange[1].divide(NICKELS, RoundingMode.DOWN);
        String numNickel = nickelChange.toString();
        balance.equals(BigDecimal.ZERO);
        String totalChange = numQuarters + " quarters " + numDime + " Dimes" + numNickel + " nickels";
        return totalChange;
        }

//    public Item selectProduct(String slotId){
//        return slots.get(slotId);
//    }

    public BigDecimal getBalance() {
        return balance;
    }




}
