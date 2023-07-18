package AbstractFactoryPattern.store;


import AbstractFactoryPattern.pizza.Pizza;

public abstract class PizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

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