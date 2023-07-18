package AbstractFactoryPattern.pizza;

import AbstractFactoryPattern.ingredient.*;

public abstract class Pizza {
    String name;

    Dough dough;
    Sauce sauce;
    Cheese cheese;
    Veggies veggies[];
    Pepperoni pepperoni;
    Clams clam;

    /**
     * prepare 메서드를 추상 메서드로 수정
     * -> 피자를 만드는 데 필요한 재료를 "원재료 팩토리"로부터 가져옴
     * */
    public abstract void prepare();

    public void bake() {
        System.out.println("175도에서 25분 간 굽기");
    }
    public void cut() {
        System.out.println("피자를 사선으로 자르기");
    }
    public void box() {
        System.out.println("상자에 피자 담기");
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) { this.name = name; }
}