package com.foodev.server.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Adrienne on 26.04.17.
 */
@Entity
@Table(name = "order")
public class Order {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    @ManyToOne
    @Column(name = "user_id")
    private User user;
    @Column(name = "date")
    private Date date;

    ArrayList<Dish> dish;

    public Order() {
    }

    public Order(int id, User user, Date date, ArrayList<Dish> dish) {
        this.id = id;
        this.user = user;
        this.date = date;
        this.dish = dish;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public ArrayList<Dish> getDish() {
        return dish;
    }

    public void setDish(ArrayList<Dish> dish) {
        this.dish = dish;
    }
}
