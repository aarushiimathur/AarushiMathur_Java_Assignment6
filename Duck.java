public abstract class Duck {
    QuackBehaviour quackBehaviour;
    SwimBehaviour swimBehaviour;
    FlyBehavior flyBehavior;
    
    abstract public void display();

    public void setQuackBehaviour(QuackBehaviour qb) {
        quackBehaviour = qb;
    }
    public void setSwimBehaviour(SwimBehaviour sb) {
        swimBehaviour = sb;
    }
    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }
    public void performSwim(){
        swimBehaviour.swim();
    }

    public void performQuack(){
        quackBehaviour.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }
}
