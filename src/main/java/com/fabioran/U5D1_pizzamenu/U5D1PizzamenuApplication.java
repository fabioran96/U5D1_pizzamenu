package com.fabioran.U5D1_pizzamenu;

import com.fabioran.U5D1_pizzamenu.entities.Menu;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class U5D1PizzamenuApplication {

	public static void main(String[] args) {
		SpringApplication.run(U5D1PizzamenuApplication.class, args);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(U5D1PizzamenuApplication.class);
		Menu menu = context.getBean(Menu.class);
		System.out.println(menu.toString());

	}

}
