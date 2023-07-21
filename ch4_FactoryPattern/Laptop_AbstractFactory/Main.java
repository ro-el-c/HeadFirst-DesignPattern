package Laptop_AbstractFactory;


import Laptop_AbstractFactory.AbstractFactory.IF_Laptop;
import Laptop_AbstractFactory.AbstractProduct.IF_Display;
import Laptop_AbstractFactory.AbstractProduct.IF_KeyBoard;
import Laptop_AbstractFactory.ConcreteFactory.AmericaLaptop;
import Laptop_AbstractFactory.ConcreteFactory.KoreaLaptop;

public class Main {
    public static void main(String[] args) {
        IF_Laptop americaLaptop = new AmericaLaptop();
        IF_Display americaDisplay = americaLaptop.createDisplay();
        IF_KeyBoard americaKeyBoard = americaLaptop.createKeyBoard();
        americaDisplay.display();
        americaKeyBoard.keyboard();

        IF_Laptop koreaLaptop = new KoreaLaptop();
        IF_Display koreaDisplay = koreaLaptop.createDisplay();
        IF_KeyBoard koreaKeyBoard = koreaLaptop.createKeyBoard();
        koreaDisplay.display();
        koreaKeyBoard.keyboard();
    }
}

// 아메리카, 코리아 -> 다른 사람이 만들 때, 서로 다르게 개발을 하더라도. 타입이 정해져 있기 때문에 엉킬 일이 없다.
// 규모가 커질 때 효율적