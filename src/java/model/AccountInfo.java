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
public class AccountInfo implements Serializable {

    private String userName, name, date, address, phone;

    public AccountInfo() {
    }

    public AccountInfo(String userName, String name, String address, String date, String phone) {
        this.userName = userName;
        this.name = name;
        this.date = date;
        this.address = address;
        this.phone = phone;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "AccountInfo{" + "userName=" + userName + ", name=" + name + ", date=" + date + ", address=" + address + ", phone=" + phone + '}';
    }

}
