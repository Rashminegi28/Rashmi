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
        Item selectedItem = new Item();
        if (selectedItem.getPrice.get)

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