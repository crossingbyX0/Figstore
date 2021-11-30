/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author atung
 */
public class Product implements Serializable {

    private String name, id;

    private int price;
    private int quantity;
    private String des;
    private String image;
    private int brandId;

    public Product() {
    }

    public Product(String id, String name, int brandId, int price, int quantity, String des, String image) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.des = des;
        this.image = image;
        this.brandId = brandId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }


    

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity + ", des=" + des + ", image=" + image + ", brandId=" + brandId + '}';
    }

}
