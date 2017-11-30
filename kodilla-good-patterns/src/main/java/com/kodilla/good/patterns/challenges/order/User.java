package com.kodilla.good.patterns.challenges.order;

public class User {
    private String name;
    private String surname;
    private String address;

    public User(String name, String surname, String address) {
        this.name = name;
        this.surname = surname;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }
}
