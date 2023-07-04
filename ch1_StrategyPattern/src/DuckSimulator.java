import duck.Duck;
import duck.MallardDuck;
import duck.ModelDuck;
import flyBehavior.FlyRocketPowered;

public class DuckSimulator {
    public static void main(String[] args) {
        // MallardDuck
        System.out.println("========== Mallard Duck ==========");
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        System.out.println();

        // Setter method 생성 후
        // ModelDuck
        System.out.println("========== Model Duck ==========");
        Duck model = new ModelDuck();
        model.performQuack();
        model.performFly();
        System.out.println("!! change fly behavior !!");
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}