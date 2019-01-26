package pizza;

import java.util.List;

public class PizzaFactory {

    public Pizza create(PizzaType pizzaType, double cost, List<String> components) {

        if (PizzaType.CAPRICIOSA.equals(pizzaType)) {
            return new CapriciosaPizza(cost, components);
        } else if (PizzaType.HAVAI.equals(pizzaType)) {
            return new HawaiPizza(cost, components);
        } else if (PizzaType.MARGERITA.equals(pizzaType)) {
            return new MargheritaPizza(cost, components);
        } else if (PizzaType.CAPRI.equals(pizzaType)) {
            return new Capri(cost, components);
        }
        return null;
    }

}
