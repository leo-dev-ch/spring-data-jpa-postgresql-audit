package com.mkyong.entity;

import com.mkyong.config.Auditable;

import javax.persistence.*;

@Entity
public class Person extends Auditable<String> {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String name;

    public Person() { }

    public Person(String name) {
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
