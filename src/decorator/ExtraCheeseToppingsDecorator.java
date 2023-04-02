package decorator;

import pizza.BasePizza;

public class ExtraCheeseToppingsDecorator extends ToppingsDecorator{

    BasePizza basePizza;
    public ExtraCheeseToppingsDecorator(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 10;
    }

}
