package AbstractFactoryPattern.factory;

import AbstractFactoryPattern.ingredient.*;

public interface PizzaIngredientFactory { // 추상 팩토리
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();
}
