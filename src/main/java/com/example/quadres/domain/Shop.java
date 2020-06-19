package com.example.quadres.domain;


import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "shop")
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name="id")
    private Integer id;
    private String name;
    private Integer capacity;

    public Shop(){
        }

    public Shop(String name, Integer capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }
}
