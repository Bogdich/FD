package com.foodev.server.domain;

import javax.persistence.*;
import java.util.HashSet;

/**
 * Created by Adrienne on 26.04.17.
 */
@Entity
@Table(name = "subscription")
public class Subscription {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    @ManyToOne
    @Column(name = "user")
    private User user;
    @ManyToOne
    @Column(name = "category")
    private Category category;
}
