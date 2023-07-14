package FactoryMethodPattern.store;

import FactoryMethodPattern.pizza.*;

public class ChicagoStylePizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String item) {
        // 추상 메서드 구현
        if (item.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        } else if (item.equals("pepperoni")) {
            return new ChicagoStylePepperoniPizza();
        } else return null;
    }
}