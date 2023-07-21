package Laptop_AbstractFactory.ConcreteFactory;

import Laptop_AbstractFactory.AbstractFactory.IF_Laptop;
import Laptop_AbstractFactory.AbstractProduct.IF_Display;
import Laptop_AbstractFactory.AbstractProduct.IF_KeyBoard;
import Laptop_AbstractFactory.ConcreteProduct.KoreaDisplay;
import Laptop_AbstractFactory.ConcreteProduct.KoreaKeyBoard;

public class KoreaLaptop implements IF_Laptop {
    private String korea = "Korea";

    @Override
    public IF_Display createDisplay() {
        return new KoreaDisplay();
    }

    @Override
    public IF_KeyBoard createKeyBoard() {
        return new KoreaKeyBoard();
    }
}
