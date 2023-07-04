package duck;

import flyBehavior.FlyBehavior;
import quackBehavior.QuackBehavior;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck(){}
    public  abstract void display();
    public void performFly() {
        flyBehavior.fly(); // 행동 클래스에 위임
    }

    public void performQuack( ){
        quackBehavior.quack(); // 행동 클래스에 위임
    }

    public void swim() {
        System.out.println("모든 오리는 물에 뜹니다. 가짜 오리도 뜨죠!");
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
