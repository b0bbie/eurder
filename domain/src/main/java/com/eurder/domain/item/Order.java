package com.eurder.domain.item;

import com.eurder.domain.customer.Customer;

import java.util.List;
import java.util.UUID;

public class Order {
    private Customer customer;
    private String id;
    private List<ItemGroup> itemGroupList;

    public Order(Customer customer, List<ItemGroup> itemGroupList) {
        this.customer = customer;
        this.id = UUID.randomUUID().toString();
        this.itemGroupList = itemGroupList;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<ItemGroup> getItemGroupList() {
        return itemGroupList;
    }

    public void setItemGroupList(List<ItemGroup> itemGroupList) {
        this.itemGroupList = itemGroupList;
    }
}
//place an order on website = POST
