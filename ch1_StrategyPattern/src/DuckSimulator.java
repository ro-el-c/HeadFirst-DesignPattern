import duck.Duck;
import duck.MallardDuck;

public class DuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();;
        mallard.performQuack();;
    }
}