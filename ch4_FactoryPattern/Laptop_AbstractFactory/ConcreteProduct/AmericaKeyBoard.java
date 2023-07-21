package Laptop_AbstractFactory.ConcreteProduct;


import Laptop_AbstractFactory.AbstractProduct.IF_KeyBoard;

public class AmericaKeyBoard implements IF_KeyBoard {
    private String factory = "America";

    @Override
    public void keyboard() {
        System.out.printf("%s keyboard\n", this.factory);
    }
}
