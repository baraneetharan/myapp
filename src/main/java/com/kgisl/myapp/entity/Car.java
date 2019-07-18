package com.kgisl.myapp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Car
 */
@Entity
public class Car {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int regno;
    private String brand;

    /**
     * @return the regno
     */
    public int getRegno() {
        return regno;
    }
    /**
     * @param regno the regno to set
     */
    public void setRegno(int regno) {
        this.regno = regno;
    }
    /**
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }
    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }
}