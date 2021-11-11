package oop;

public class RedHeadDuck extends Duck {

    public RedHeadDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
    
    @Override
    void display() {
        System.out.println("I am real red headed duck");
    }
    
}
