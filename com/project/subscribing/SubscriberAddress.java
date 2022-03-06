package com.project.subscribing;

public class SubscriberAddress {

    // Fields
    private String street;
    private int zipcode;
    private String city;
    private String country;
    private int id;

    // Constructor
    public SubscriberAddress(String street, int zipcode, String city, String country, int id) {
        this.street = street;
        this.zipcode = zipcode;
        this.city = city;
        this.country = country;
        this.id = id;
    }
}
