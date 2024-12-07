package DesignPatterhn.decorator;

import DesignPatterhn.decorator.decor.ExtraCheese;
import DesignPatterhn.decorator.decor.ExtraVeggies;

public class Main {

    public static void main(String[] args) {
        // BasePizza pizza = new Margarita();
        // ToppingsDecor decor = new ExtraCheese(pizza);

        BasePizza pizza = new ExtraVeggies(new ExtraCheese(new Margarita()));
        System.out.println(pizza.cost());

    }
}
