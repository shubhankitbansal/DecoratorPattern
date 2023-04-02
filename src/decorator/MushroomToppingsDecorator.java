package decorator;

import pizza.BasePizza;

public class MushroomToppingsDecorator extends ToppingsDecorator{

    BasePizza basePizza;

    public MushroomToppingsDecorator(BasePizza basePizza){
        this.basePizza = basePizza;
    }
    @Override
    public int cost() {
        return this.basePizza.cost() + 35;
    }

}
