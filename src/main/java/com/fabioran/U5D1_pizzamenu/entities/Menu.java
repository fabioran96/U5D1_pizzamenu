package com.fabioran.U5D1_pizzamenu.entities;

import java.util.List;


public class Menu {
    private List<MenuItem> items;

    public Menu(List<MenuItem> items) {
        this.items = items;
    }

    public List<MenuItem> getItems() {
        return items;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Menù: \n");
        for (MenuItem item : items) {
            sb.append(item.toString()).append("\n\n");
        }
        return sb.toString();
    }
}
