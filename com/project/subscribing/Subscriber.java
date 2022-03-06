package com.project.subscribing;

public class Subscriber {

    // Fields
    private String firstName;
    private String lastName;
    private SubscriberAddress subscriberAddress;
    private String mail;
    private int id;

    // Constructor
    public Subscriber(String firstName, String lastName, SubscriberAddress subscriberAddress, String mail, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subscriberAddress = subscriberAddress;
        this.mail = mail;
        this.id = id;
    }
}
