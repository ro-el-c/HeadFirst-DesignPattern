package Laptop_AbstractFactory.ConcreteProduct;

import Laptop_AbstractFactory.AbstractProduct.IF_Display;

public class AmericaDisplay implements IF_Display {
    private String factory = "America";

    @Override
    public void display() {
        System.out.printf("%s display\n", this.factory);
    }
}
