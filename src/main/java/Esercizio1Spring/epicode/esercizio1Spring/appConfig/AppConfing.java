package Esercizio1Spring.epicode.esercizio1Spring.appConfig;

import Esercizio1Spring.epicode.esercizio1Spring.bean.Drinks;
import Esercizio1Spring.epicode.esercizio1Spring.bean.Menu;
import Esercizio1Spring.epicode.esercizio1Spring.bean.Pizze;
import Esercizio1Spring.epicode.esercizio1Spring.bean.Toppings;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class AppConfing {

    @Bean
    public Toppings pomodoro() {
        Toppings pomodoro = new Toppings();
        pomodoro.setName("Pomodoro");
        pomodoro.setPrice(0.50);
        return pomodoro;
    }
    @Bean
    public Toppings cheese() {
        Toppings cheese = new Toppings();
        cheese.setName("Cheese");
        cheese.setPrice(0.69);
        return cheese;
    }

    @Bean
    public Toppings ham() {
        Toppings ham = new Toppings();
        ham.setName("Ham");
        ham.setPrice(0.50);
        return ham;
    }
    @Bean
    public Toppings onions() {
        Toppings onions = new Toppings();
        onions.setName("Onions");
        onions.setPrice(0.69);
        return onions;
    }

    @Bean
    public Toppings salami() {
        Toppings salami = new Toppings();
        salami.setName("Salami");
        salami.setPrice(0.99);
        return salami;
    }

    @Bean
    public Toppings pineapple() {
        Toppings pineapple = new Toppings();
        pineapple.setName("Pineapple");
        pineapple.setPrice(0.50);
        return pineapple;
    }

    @Bean
    public Pizze margherita(){
        Pizze pizza = new Pizze();
        pizza.setName("Margherita");
        pizza.setCalorie(1104);
        pizza.setPrice(4.99);
        pizza.setToppings(List.of(pomodoro(),cheese()));
        return pizza;
    }

    @Bean
    public Pizze hawaiian(){
        Pizze pizza = new Pizze();
        pizza.setName("Hawaiian");
        pizza.setCalorie(1024);
        pizza.setPrice(6.49);
        pizza.setToppings(List.of(pomodoro(),cheese(), ham(), pineapple()));
        return pizza;
    }

    @Bean
    public Pizze salamiPizza(){
        Pizze pizza = new Pizze();
        pizza.setName("Salami");
        pizza.setCalorie(1160);
        pizza.setPrice(5.99);
        pizza.setToppings(List.of(pomodoro(),cheese(),salami()));
        return pizza;
    }

    @Bean
    public Drinks lemonade(){
        Drinks lemonade = new Drinks();
        lemonade.setName("Lemonade");
        lemonade.setCalorie(128);
        lemonade.setPrice(1.29);
        lemonade.setSize(0.33);
        return lemonade;
    }

    @Bean
    public Drinks water(){
        Drinks water = new Drinks();
        water.setName("Water");
        water.setCalorie(0);
        water.setPrice(1.29);
        water.setSize(0.5);
        return water;
    }

    @Bean
    public Drinks wine(){
        Drinks wine = new Drinks();
        wine.setName("Wine");
        wine.setCalorie(607);
        wine.setPrice(7.49);
        wine.setSize(0.75);
        return wine;
    }

    @Bean
    public Menu menu(List<Pizze> pizze, List<Drinks> drinks) {
        Menu menu = new Menu();
        menu.setPizze(pizze);
        menu.setDrinks(drinks);
        return menu;
    }
}
