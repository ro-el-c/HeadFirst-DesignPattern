package duck;

import flyBehavior.FlyWithWings;
import quackBehavior.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("나는야 물오리");
    }
}
