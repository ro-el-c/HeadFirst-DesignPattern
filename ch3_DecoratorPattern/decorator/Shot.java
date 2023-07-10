package decorator;

import component.Beverage;

public class Shot extends OptionDecorator { // 추상 데코레이터를 확장, 구현 - OptionDecorator 에서는 Beverage 를 확장
    public Shot(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.2; // 장식하고 있는 객체에 작업을 위임한 후, 자신의 가격을 더함
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 1 shot"; // 장식하고 있는 객체에 작업을 위임한 후, 자신의 설명을 덧붙임
    }
}