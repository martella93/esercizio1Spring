package Esercizio1Spring.epicode.esercizio1Spring.bean;

import lombok.Data;

import java.util.List;

@Data
public class Pizze extends MenuItem {

    private List<Toppings> toppings;

}
