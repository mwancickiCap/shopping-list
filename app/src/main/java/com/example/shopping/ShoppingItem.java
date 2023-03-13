package com.example.shopping;

public class ShoppingItem {

    private String name;
    private boolean bought;

    public ShoppingItem(String name) {
        this.name = name;
        bought = false;
    }

    public String getName() {
        return name;
    }

    public boolean isBought() {
        return bought;
    }

    public void setBought(boolean bought) {
        this.bought = bought;
    }
}