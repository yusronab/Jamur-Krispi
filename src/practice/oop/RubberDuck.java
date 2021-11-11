package practice.oop;

public class RubberDuck extends Duck{

    public RubberDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = () -> System.out.println("Squeak");
    }
    
    public RubberDuck(FlyBehavior fb, QuackBehavior qb){
        this.flyBehavior = fb;
        this.quackBehavior = qb;
    }
    
    @Override
    void display() {
        System.out.println("I am rubber duck");
    }
    
}
