package component;

public class Decaf extends Beverage {
    public Decaf() {
        description = "Decaffeinated";
    }

    @Override
    public double cost() { return 2.11; }
}
