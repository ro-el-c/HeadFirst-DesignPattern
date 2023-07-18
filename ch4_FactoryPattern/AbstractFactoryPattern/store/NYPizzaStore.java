package AbstractFactoryPattern.store;

import AbstractFactoryPattern.factory.NYIngredientFactory;
import AbstractFactoryPattern.factory.PizzaIngredientFactory;
import AbstractFactoryPattern.pizza.CheesePizza;
import AbstractFactoryPattern.pizza.PepperoniPizza;
import AbstractFactoryPattern.pizza.Pizza;
import AbstractFactoryPattern.pizza.VeggiePizza;

public class NYPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYIngredientFactory();

        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("뉴욕 치즈 피자");
        } else if (item.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("뉴욕 야채 피자");
        } else if (item.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("뉴욕 페퍼로니 피자");
        }

        return pizza;
    }
}
