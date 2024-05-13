package Esercizio1Spring.epicode.esercizio1Spring;

import Esercizio1Spring.epicode.esercizio1Spring.appConfig.AppConfing;
import Esercizio1Spring.epicode.esercizio1Spring.bean.Drinks;
import Esercizio1Spring.epicode.esercizio1Spring.bean.Menu;
import Esercizio1Spring.epicode.esercizio1Spring.bean.Pizze;
import Esercizio1Spring.epicode.esercizio1Spring.bean.Toppings;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Esercizio1SpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(Esercizio1SpringApplication.class, args);

		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfing.class);

		Menu menu = ctx.getBean(Menu.class);

		System.out.println("Menu:");

		System.out.println("PIZZE");
		for (Pizze pizza : menu.getPizze()) {
			System.out.println("Pizza: " + pizza.getName());
			System.out.println("Price: $" + pizza.getPrice());
			System.out.println("Calories: " + pizza.getCalorie());
			System.out.println("Toppings:");
			for (Toppings topping : pizza.getToppings()) {
				System.out.println("- " + topping.getName() + " ($" + topping.getPrice() + ")");
			}
			System.out.println();
		}

		System.out.println("DRINKS");
		System.out.println();
		for (Drinks drink : menu.getDrinks()) {
			System.out.println("Drink: " + drink.getName() + "(" + drink.getSize() + "l)");
			System.out.println("Price: $" + drink.getPrice());
			System.out.println("Calories: " + drink.getCalorie());
			System.out.println();
		}

		System.out.println("TOPPINGS");
		System.out.println();
		for (Toppings topping : menu.getToppings()) {
			System.out.println("- " + topping.getName() +"(Calorie: "+ topping.getCalorie() + ")" + " (Prezzo: $" + topping.getPrice() + ")");
		}

	}

	}


