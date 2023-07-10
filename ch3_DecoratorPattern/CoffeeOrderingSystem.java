import component.Beverage;
import component.Espresso;
import component.Latte;
import decorator.Shot;
import decorator.Whip;

public class CoffeeOrderingSystem {
    public static void main(String[] args) {
        // 옵션을 추가하지 않은 에스프레소 주문
        Beverage beverage = new Espresso();
        //beverage = new Size(beverage);
        System.out.println(beverage.getDescription() + ": $" + beverage.cost());

        // 샷 추가와 휘핑 크림을 추가한 라떼 주문
        Beverage beverage2 = new Latte();
        //beverage2 = new Size(beverage2);
        beverage2 = new Shot(beverage2); // Latte 를 Shot 으로 감싼다.
        beverage2 = new Whip(beverage2); // Shot 을 Whip 으로 감싼다.
        System.out.println(beverage2.getDescription() + ": $" + beverage2.cost());

        // Venti 사이즈에 샷 추가한 라떼 주문
        Beverage beverage3 = new Latte();
        beverage3.setSize(Beverage.Size.VENTI);
        //beverage3 = new Size(beverage3, Beverage.Size.VENTI);
        beverage3 = new Shot(beverage3); // Latte 를 Shot 으로 감싼다.
        beverage3 = new Whip(beverage3); // Shot 을 Whip 으로 감싼다.
        System.out.println(beverage3.getDescription() + ": $" + beverage3.cost());
    }
}