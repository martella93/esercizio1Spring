package Esercizio1Spring.epicode.esercizio1Spring.bean;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Menu {

    private List<Pizze> pizze;
    private List<Drinks> drinks;

    public List<Toppings> getToppings() {
        List<Toppings> allToppings = new ArrayList<>() {
        };
        for (Pizze pizza : pizze) {
            allToppings.addAll(pizza.getToppings());
        }
        return allToppings;
    }
}
