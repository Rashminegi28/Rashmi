package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Item {
    private String name;
    private String type;
    private String location;
    private BigDecimal price;



    public Item(String name, String type, String location, BigDecimal price){
        this.name = name;
        this.type= type;
        this.location = location;
        this.price= price;

    }
//Getters
    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }
    // Setters

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void getItem(String location, String name, BigDecimal price, String type) throws FileNotFoundException {
        File itemsFile = new File("java-capstone-module-1-team-3/vendingmachine.csv");
        if (itemsFile.exists()) {
            try (Scanner scanner = new Scanner(itemsFile)) {
                while (scanner.hasNextLine()) {
                    String itemLine = scanner.nextLine();
                    String[] newItemInfo = itemLine.split("\\|");
                    newItemInfo[0] = getLocation();
                    newItemInfo[1] = getName();
                    newItemInfo[2] = String.valueOf(getPrice());
                    newItemInfo[3] = getType();

                }
            }
        }
    }
}
