package FactoryMethodPattern;

import FactoryMethodPattern.pizza.Pizza;
import FactoryMethodPattern.store.ChicagoStylePizzaStore;
import FactoryMethodPattern.store.NYStylePizzaStore;
import FactoryMethodPattern.store.PizzaStore;

public class PizzaSystem {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYStylePizzaStore();
        PizzaStore chicagoStore = new ChicagoStylePizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("1번 손님이 주문한 " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("2번 손님이 주문한 " + pizza.getName());
    }
}
