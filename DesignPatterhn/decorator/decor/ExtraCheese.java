package DesignPatterhn.decorator.decor;

import DesignPatterhn.decorator.BasePizza;

public class ExtraCheese extends ToppingsDecor {

    BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 10;
    }
}
