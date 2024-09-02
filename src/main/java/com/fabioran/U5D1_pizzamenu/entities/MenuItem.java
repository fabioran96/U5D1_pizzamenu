package com.fabioran.U5D1_pizzamenu.entities;


public abstract class MenuItem {
    private String name;
    private double price;
    private String nutritionalInfo;

    public MenuItem(String name, double price, String nutritionalInfo) {
        this.name = name;
        this.price = price;
        this.nutritionalInfo = nutritionalInfo;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public String getNutritionalInfo() {
        return nutritionalInfo;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", nutritionalInfo='" + nutritionalInfo + '\'' +
                '}';
    }
}




