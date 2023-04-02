import decorator.ExtraCheeseToppingsDecorator;
import decorator.MushroomToppingsDecorator;
import pizza.BasePizza;
import pizza.GoldenCornPizza;

public class Main {
    public static void main(String[] args) {

        BasePizza goldenCornPizza = new MushroomToppingsDecorator(new ExtraCheeseToppingsDecorator(new GoldenCornPizza()));
        System.out.println(goldenCornPizza.cost());

    }
}