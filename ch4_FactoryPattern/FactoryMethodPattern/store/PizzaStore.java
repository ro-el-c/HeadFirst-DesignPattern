package FactoryMethodPattern.store;

import FactoryMethodPattern.pizza.Pizza;

public abstract class PizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza;
        // 정의한 메서드를 고쳐 사용할 수 없도록 하려면 final 로 선언할 것
        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
    /**
     * orderPizza 메서드는 어떤 피자가 만들어지는지 모른다.
     * = PizzaStore 과 Pizza 의 완벽 분리
     * */

    abstract Pizza createPizza(String type); // 추상 메서드 = 팩토리 메서드
}