package edu.bsuir.MobileOperator.entities;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class User {
    private  long id;
    private String name, surName, email, address, password, phone;
    private boolean isAdmin;
    private double balance;

    public User(long id, String name, String surName, String email, String address, String password, String phone, boolean isAdmin, double balance) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.email = email;
        this.address = address;
        this.password = password;
        this.phone = phone;
        this.isAdmin = isAdmin;
        this.balance = balance;
    }
}
