package com.eurder.domain.item;

import java.time.LocalDate;

public class ItemGroup {
    private String Id;
    private int amount;
    private LocalDate shippingDate;

    public ItemGroup(Item item, int amount, LocalDate shippingDate) {
        this.Id = item.getId();
        this.amount = amount;
        this.shippingDate = shippingDate;
    }

    public void defineShippingDate(Item item){
        if(item.getAmountOnStock() != 0 && this.amount <= item.getAmountOnStock()){
            shippingDate = LocalDate.now().plusDays(1);
        }
        else shippingDate = LocalDate.now().plusDays(7);
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public LocalDate getShippingDate() {
        return shippingDate;
    }

    public void setShippingDate(LocalDate shippingDate) {
        this.shippingDate = shippingDate;
    }
}
