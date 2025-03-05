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
    
