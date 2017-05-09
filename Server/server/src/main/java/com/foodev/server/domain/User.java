package com.foodev.server.domain;

import javax.persistence.*;

/**
 * Created by Adrienne on 26.04.17.
 */
@Entity
@Table(name = "User")
public class User {
    @Id
    @Column(name="id")
    @GeneratedValue
    private int id;

    @Column(name = "login")
    private String login;
    @Column(name = "password")
    private String password;
    @Column(name = "is_admin")
    private boolean isAdmin;

    public User() {
    }

    public User(int id, String login, String password, boolean isAdmin) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }
}
