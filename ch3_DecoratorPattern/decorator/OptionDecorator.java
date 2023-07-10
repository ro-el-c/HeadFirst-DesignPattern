package decorator;

import component.Beverage;

public abstract class OptionDecorator extends Beverage {
    Beverage beverage;

    public abstract String getDescription();
}