package component;

public class Espresso extends Beverage {
    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return super.cost() + 1.99;
    }
}