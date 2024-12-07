package DesignPatterhn.decorator.decor;

import DesignPatterhn.decorator.BasePizza;

public class ExtraVeggies extends ToppingsDecor {

    BasePizza basePizza;

    public ExtraVeggies(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 20;
    }
}
