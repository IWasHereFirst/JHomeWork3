package com.project.subscribing;

public class SubscriberAddress {

    // Fields
    private String street;
    private int streetNr;
    private String city;
    private String country;
    private int zipCode;

    // Constructor
    public SubscriberAddress(String street, int streetNr, String city, String country, int zipCode) {
        this.street = street;
        this.streetNr = streetNr;
        this.city = city;
        this.country = country;
        this.zipCode = zipCode;
    }
}
