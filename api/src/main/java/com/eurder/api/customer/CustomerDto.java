package com.eurder.api.customer;

public class CustomerDto {
    private String id;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String address;
    private int phoneNumber;

    public String getId() {
        return id;
    }

    public CustomerDto setId(String id) {
        this.id = id;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public CustomerDto setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public CustomerDto setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public CustomerDto setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public CustomerDto setAddress(String address) {
        this.address = address;
        return this;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public CustomerDto setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
}
