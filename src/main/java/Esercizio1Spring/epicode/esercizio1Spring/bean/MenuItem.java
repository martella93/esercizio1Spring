package Esercizio1Spring.epicode.esercizio1Spring.bean;

import lombok.Data;

@Data
public abstract class MenuItem {

    private String name;
    private double price;
    private int calorie;
}
