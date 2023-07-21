package Laptop_AbstractFactory.ConcreteProduct;

import Laptop_AbstractFactory.AbstractProduct.IF_Display;

public class KoreaDisplay implements IF_Display {
    private String factory = "Korea";

    @Override
    public void display() {
        System.out.printf("%s display\n", this.factory);
    }
}
