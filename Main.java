public class Main {
    public static void main(String[] args) {
        MallardDuck md = new MallardDuck();
        System.out.println("------------");
        md.display();
        md.performQuack();
        md.performSwim();
        md.performFly();

        System.out.println("------------");
        RedHeadDuck rd = new RedHeadDuck();
        rd.display();
        rd.performQuack();
        rd.performSwim();
        rd.performFly();

        System.out.println("------------");
        RubberDuck rubber = new RubberDuck();
        rubber.display();
        rubber.performQuack();
        rubber.performSwim();
        rubber.performFly();

