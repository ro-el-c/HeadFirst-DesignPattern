package component;

public class Latte extends Beverage {
    public Latte() {
        description = "Latte"; // Beverage 로부터 상속 받음
    }

    @Override
    public double cost() {
        return 2.90;
    }
}