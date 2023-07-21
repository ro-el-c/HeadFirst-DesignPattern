package Laptop_AbstractFactory.AbstractFactory;

import Laptop_AbstractFactory.AbstractProduct.IF_Display;
import Laptop_AbstractFactory.AbstractProduct.IF_KeyBoard;

public interface IF_Laptop {
    IF_Display createDisplay();
    IF_KeyBoard createKeyBoard();
}
