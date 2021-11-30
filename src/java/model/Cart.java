/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author atung
 */
public class Cart {

    private String username;
    private List<Item> items;

    public Cart() {
    }

    public Cart(String username) {
        this.username = username;
        items = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
    
    public List<Item> getItems() {
        return items;
    }
    
    public int getQuantityById(String id) {
        return getItemById(id).getQuantity();
    }

    public Item getItemById(String id) {
        for (Item i : items) {
            if (i.getProduct().getId() == null ? id == null : i.getProduct().getId().equals(id)) {
                return i;
            }
        }
        return null;
    }

    public void addItem(Item t) {
        if (getItemById(t.getProduct().getId()) != null) {
            Item m = getItemById(t.getProduct().getId());
            m.setQuantity(m.getQuantity() + t.getQuantity());
        } else {
            items.add(t);
        }
    }

    public void removeItem(String id) {
        if (getItemById(id) != null) {
            items.remove(getItemById(id));
        }
    }

    public int getTotalMoney() {
        int t = 0;
        for (Item i : items) {
            t += (i.getQuantity() * i.getPrice());
        }
        return t;
    }

    @Override
    public String toString() {
        return "Cart{" + "username=" + username + ", items=" + items + '}';
    }
}
