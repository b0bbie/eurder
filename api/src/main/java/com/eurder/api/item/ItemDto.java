package com.eurder.api.item;

public class ItemDto {
    private String id;
    private String name;
    private String description;
    private int price;
    private int amountOnStock;

    public String getId() {
        return id;
    }

    public ItemDto setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public ItemDto setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public ItemDto setDescription(String description) {
        this.description = description;
        return this;
    }

    public int getPrice() {
        return price;
    }

    public ItemDto setPrice(int price) {
        this.price = price;
        return this;
    }

    public int getAmountOnStock() {
        return amountOnStock;
    }

    public ItemDto setAmountOnStock(int amountOnStock) {
        this.amountOnStock = amountOnStock;
        return this;
    }
}
