package com.project.subscribing;

public class Subscriber {

    // Fields
    private String firstName;
    private String lastName;
    private SubscriberAddress fullAddress;
    private String mail;
    private int age;

    // Constructors
    public Subscriber(String firstName, String lastName, SubscriberAddress fullAddress, String mail) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullAddress = fullAddress;
        this.mail = mail;
    }

    public Subscriber(String firstName, String lastName, SubscriberAddress fullAddress, String mail, int age) {
        this(firstName, lastName, fullAddress, mail);
        this.age = age;
    }

}
