package FactoryMethodPattern.store;

import FactoryMethodPattern.pizza.NYStyleCheesePizza;
import FactoryMethodPattern.pizza.NYStylePepperoniPizza;
import FactoryMethodPattern.pizza.NYStyleVeggiePizza;
import FactoryMethodPattern.pizza.Pizza;

public class NYStylePizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String item) {
        // 추상 메서드 구현
        if (item.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else if (item.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        } else return null;
    }
}