package com.foodev.server.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Created by Adrienne on 26.04.17.
 */
@Entity
@Table(name = "user_info")
public class UserInfo {
    @OneToOne(optional = false)
    @Column(name = "user")
    private User user;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "number")
    private String number;
    @Column(name = "adress")
    private String address;
    @Column(name = "email")
    private String email;

    public UserInfo() {
    }

    public UserInfo(User user, String name, String surname, String number, String address, String email) {
        this.user = user;
        this.name = name;
        this.surname = surname;
        this.number = number;
        this.address = address;
        this.email = email;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
