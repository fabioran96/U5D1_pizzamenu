package com.fabioran.U5D1_pizzamenu;


import com.fabioran.U5D1_pizzamenu.entities.Bevanda;
import com.fabioran.U5D1_pizzamenu.entities.Menu;
import com.fabioran.U5D1_pizzamenu.entities.Pizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class MenuConfig {

    @Bean
    public Pizza margherita(){
        return new Pizza("Margherita", 5.00, "800 kcal", Arrays.asList("Pomodoro", "Mozzarella"));

    }

    @Bean
    public Pizza hawaianPizza() {
        return new Pizza("Hawaiian Pizza", 750, "900 kcal", Arrays.asList("Pomodoro", "Mozzarella", "Prosciutto", "Ananas"));
    }

    @Bean
    public Pizza diavola(){
        return new Pizza("Diavola", 8.00, "950 kcal", Arrays.asList("Pomodoro", "Mozzarella", "Salame piccante"));
    }

    @Bean
    public Pizza bufala(){
        return new Pizza("Bufala", 10.00, "850 kcal", Arrays.asList("Pomodoro", "Mozzarella", "Mozzarella di Bufala DOP"));
    }

    @Bean
    public Pizza porcini(){
        return new Pizza("Porcini rossa", 11.00, "900 kcal", Arrays.asList("Pomodoro", "Mozzarella", "Funghi Porcini"));
    }

    @Bean
    public Bevanda cola() {
        return new Bevanda("Coca Cola", 2.50, "140 kcal");
    }

    @Bean
    public Bevanda water() {
        return new Bevanda("Acqua Naturale", 1.00, "0 kcal");
    }

    @Bean
    public Bevanda beer() {
        return new Bevanda("Birra alla spina 50cl", 4.00, "150 kcal");
    }

    @Bean
    public Bevanda beer1() {
        return new Bevanda("Birre in bottiglia 33cl", 3.50, "120 kcal");
    }

    @Bean
    public Menu menu() {
        return new Menu(Arrays.asList(margherita(), hawaianPizza(), diavola(), bufala(), porcini(), cola(), water(), beer(), beer1() ));
    }

}
