package com.eurder.domain.item;

import java.util.UUID;

public class Item {
    private String id;
    private String name;
    private String description;
    private int price;
    private int amountOnStock;

    public Item(String name, String description, int price, int amountOnStock) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.description = description;
        this.price = price;
        this.amountOnStock = amountOnStock;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmountOnStock() {
        return amountOnStock;
    }

    public void setAmountOnStock(int amountOnStock) {
        this.amountOnStock = amountOnStock;
    }
}
