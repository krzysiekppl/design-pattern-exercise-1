package main;

import pizza.*;

import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        PizzaFactory pizzaFactory = new PizzaFactory();

        Pizza capri = pizzaFactory.create(PizzaType.CAPRI, 20, Arrays.asList("cheese", "tomato"));

        System.out.println(capri);
    }

}
