package com.fabioran.U5D1_pizzamenu.entities;

public class Bevanda extends MenuItem {

    public Bevanda(String name, double price, String nutritionalInfo) {
        super(name, price, nutritionalInfo);
    }

    @Override
    public String toString() {
        return getName() + " - " + getPrice() + "€\n" +
                "Informazioni nutrizionali: " + getNutritionalInfo();
    }
}
