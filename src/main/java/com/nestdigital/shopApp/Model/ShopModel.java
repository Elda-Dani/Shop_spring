package com.nestdigital.shopApp.Model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "shops")
public class ShopModel {
@Id
@GeneratedValue
    private int id;
    private String dresstype;
    private String dresssize;
    private String description;
    private int price;

    public ShopModel() {
    }

    public ShopModel(int id, String dresstype, String dresssize, String description, int price) {
        this.id = id;
        this.dresstype = dresstype;
        this.dresssize = dresssize;
        this.description = description;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDresstype() {
        return dresstype;
    }

    public void setDresstype(String dresstype) {
        this.dresstype = dresstype;
    }

    public String getDresssize() {
        return dresssize;
    }

    public void setDresssize(String dresssize) {
        this.dresssize = dresssize;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
