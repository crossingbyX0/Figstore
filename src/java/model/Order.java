/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author atung
 */
public class Order implements Serializable {

    private int id;
    private String odate;
    private String userName;
    private int totalMoney;

    public Order() {
    }

    public Order(int id, String userName, int totalMoney) {
        this.id = id;
        this.userName = userName;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        this.odate = sdf.format(date);

        this.totalMoney = totalMoney;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return odate;
    }

    public void setDate(String odate) {
        this.odate = odate;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(int totalMoney) {
        this.totalMoney = totalMoney;
    }

    @Override
    public String toString() {
        return "Order{" + "id=" + id + ", odate=" + odate + ", userName=" + userName + ", totalMoney=" + totalMoney + '}';
    }

}
