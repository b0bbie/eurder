package com.eurder.api.customer;

public class CreateCustomerDto {
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String address;
    private int phoneNumber;

    public String getFirstName() {
        return firstName;
    }

    public CreateCustomerDto setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public CreateCustomerDto setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public CreateCustomerDto setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public CreateCustomerDto setAddress(String address) {
        this.address = address;
        return this;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public CreateCustomerDto setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
}
