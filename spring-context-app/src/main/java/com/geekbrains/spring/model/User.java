package com.geekbrains.spring.model;

import javax.persistence.*;

@Entity
@Table(name = "Users")
public class User {
    //@ManyToMany
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column(name = "name")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User() {
    }

    @Override
    public String toString() {
        return ("Item id = " + id + "; name = " + name);
    }
}