package Laptop_AbstractFactory.ConcreteProduct;

import Laptop_AbstractFactory.AbstractProduct.IF_KeyBoard;

public class KoreaKeyBoard implements IF_KeyBoard {
    private String factory = "Korea";

    @Override
    public void keyboard() {
        System.out.printf("%s keyboard\n", this.factory);
    }
}
