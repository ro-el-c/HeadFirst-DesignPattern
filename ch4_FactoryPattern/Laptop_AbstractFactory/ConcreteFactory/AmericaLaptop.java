package Laptop_AbstractFactory.ConcreteFactory;

import Laptop_AbstractFactory.AbstractFactory.IF_Laptop;
import Laptop_AbstractFactory.AbstractProduct.IF_Display;
import Laptop_AbstractFactory.AbstractProduct.IF_KeyBoard;
import Laptop_AbstractFactory.ConcreteProduct.AmericaDisplay;
import Laptop_AbstractFactory.ConcreteProduct.AmericaKeyBoard;

public class AmericaLaptop implements IF_Laptop {
    private String america = "America";

    @Override
    public IF_Display createDisplay() {
        return new AmericaDisplay();
    }

    @Override
    public IF_KeyBoard createKeyBoard() {
        return new AmericaKeyBoard();
    }
}
