package com.fabioran.U5D1_pizzamenu.entities;

import java.util.List;


public class Pizza  extends MenuItem {
    private List<String> toppings;

    public Pizza(String name, double price, String nutritionalInfo, List<String> toppings) {
        super(name, price, nutritionalInfo);
        this.toppings = toppings;
    }

   public List<String> getToppings(){
        return toppings;
   }

    @Override
    public String toString() {
        return getName() + "-" + getPrice() + "€\n" +
                "Ingredienti: " + String.join(", ", toppings) + "\n" +
                "Informazioni nutrizionali: " + getNutritionalInfo();

    }
}
