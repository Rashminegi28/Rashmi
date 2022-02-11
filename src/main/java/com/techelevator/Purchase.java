package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.Scanner;

public class Purchase {
    private BigDecimal balance;



    public BigDecimal getBalance() {
        return balance;

    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal currentMoneyProvided() {
        Scanner moneyScanner = new Scanner(System.in);
        String inputtedMoney = moneyScanner.nextLine();
        BigDecimal moneyInput = BigDecimal.valueOf(Long.parseLong(inputtedMoney));
        if (moneyInput.equals(BigDecimal.valueOf(1.0)) || moneyInput.equals(BigDecimal.valueOf(2.0)) ||
                moneyInput.equals(BigDecimal.valueOf(5.0)) || moneyInput.equals(BigDecimal.valueOf(10.0))) {
            balance.add(moneyInput);
        } else {
            return balance;
        }
        return moneyInput;
    }

    public void selectProduct() {
        Scanner selectedItem = new Scanner(System.in);
        String inputtedItem = selectedItem.nextLine();

        Item item = new Item;
        if (inputtedItem.equals(item.getLocation()){
            int comparePrice = balance.compareTo(item.getPrice());
            if (comparePrice>=0){
                balance.subtract(item.getPrice());
                item.getCount(--
            } else
                // get back to purchase menu
            } catch (Exception e) {
            System.out.println("not enough balance");
        }

    }



//        File itemsFile = new File(String.valueOf(fileName));
//        if (itemsFile.exists()) {
//            try (Scanner scanner = new Scanner(itemsFile)) {
//                while (scanner.hasNextLine()) {
//                    String itemLine = scanner.nextLine();
//                    String[] newItemInfo = itemLine.split("\\|");
//                    BigDecimal price = BigDecimal.valueOf(Long.parseLong(newItemInfo[2]));
//                    String productLocation = newItemInfo[0];
//                    try
//                }
//            } catch (FileNotFoundException e) {
//                e.printStackTrace();
//            }
//        }String inputLocation;
//            if (!productLocation.equals(inputLocation)){
//    }
}