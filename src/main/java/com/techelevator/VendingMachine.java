package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class VendingMachine<Static> {
    private BigDecimal balance;
    private Map<String, Item> slots = new TreeMap<>();
    private final BigDecimal quarters = BigDecimal.valueOf(0.25);
    private final BigDecimal dimes = BigDecimal.valueOf(0.1);
    private final BigDecimal nickels = BigDecimal.valueOf(0.05);


    public void restockMachine(String fileName) throws FileNotFoundException {
        File itemsFile = new File(fileName);
        if (itemsFile.exists()) {
            try (Scanner scanner = new Scanner(itemsFile)) {
                while (scanner.hasNextLine()) {
                    String itemLine = scanner.nextLine();
                    String[] newItemInfo = itemLine.split("\\|");
                    Item item = new Item(newItemInfo[1], newItemInfo[3], newItemInfo[0], new BigDecimal(newItemInfo[2]), 5);
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

        }
        return balance;

    }

    public String selectProductSlot(String inputtedItem) {
        Item item = new Item(item.getName(), item.getType(), item.getLocation(), item.getPrice(), item.getCount());
        int count = item.getCount();

        if (!inputtedItem.equals(item.getLocation())) {
            return "invalid slot";
        }
        if (count == 0) {
            return "Sold out";
        }
        if (count >= 0 && inputtedItem.equals(item.getLocation())) {
            int comparePrice = balance.compareTo(item.getPrice());
            if (comparePrice >= 0) {
                balance.subtract(item.getPrice());
                count--;
                  String printOut = item.getName() + ", " + item.getPrice() + ", " + balance;
                if (item.getType().equals("Chip")) {
                    return printOut += "Crunch, Crunch, Yum!";
                }
                if (item.getType().equals("Candy")) {
                    return printOut += "Munch, Munch, Yum!";
                }
                if (item.getType().equals("Drink")) {
                    return printOut += "Glug, Glug, Yum!";
                }
                if (item.getType().equals("Gum")) {
                    return printOut += "Chew, Chew, Yum!";
                }
                return printOut;
            }
        }
    }

    public String returnChange() {
        BigDecimal change = balance;
        BigDecimal[] quarterChange = change.divideAndRemainder(BigDecimal.valueOf(.25));
        String numQuarters = quarterChange[0].toString();
        BigDecimal[] dimeChange = quarterChange[1].divideAndRemainder(BigDecimal.valueOf(.10));
        String numDime = dimeChange[0].toString();
        BigDecimal nickelChange = dimeChange[1].divide(BigDecimal.valueOf(.05), RoundingMode.DOWN);
        String numNickel = nickelChange.toString();
        balance.equals(BigDecimal.valueOf(0.0));
        String totalChange = numQuarters + " quarters " + numDime + " Dimes" + numNickel + " nickels";
        return totalChange;
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
