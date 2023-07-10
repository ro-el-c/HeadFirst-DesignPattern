package component;

public abstract class Beverage {
    String description = "NOTHING";

    public abstract double cost();
    public String getDescription() {
        return description;
    }
}
