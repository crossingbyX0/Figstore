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
public class brand implements Serializable{
   private int brandId;
   private String brand;
   private int originId;

    public brand() {
    }

    public brand(int brandId, String brand, int originId) {
        this.brandId = brandId;
        this.brand = brand;
        this.originId = originId;
    }

    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getOriginId() {
        return originId;
    }

    public void setOriginId(int originId) {
        this.originId = originId;
    }

//    @Override
//    public String toString() {
//        return "brand{" + "brandId=" + brandId + ", brand=" + brand + ", originId=" + originId + '}';
//    }
//
//   
}
