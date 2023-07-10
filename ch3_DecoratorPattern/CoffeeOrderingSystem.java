import component.*;
import decorator.*;

public class CoffeeOrderingSystem {
    public static void main(String[] args) {
        // 옵션을 추가하지 않은 에스프레소 주문
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        // 샷 추가와 휘핑 크림을 추가한 라떼 주문
        Beverage beverage2 = new Latte();
        beverage2 = new Shot(beverage2); // Latte 를 Shot 으로 감싼다.
        beverage2 = new Whip(beverage2); // Shot 을 Whip 으로 감싼다.
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
    }
}