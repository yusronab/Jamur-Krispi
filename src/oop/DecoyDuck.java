package oop;

public class DecoyDuck extends Duck {

    public DecoyDuck(){
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new MuteQuack());
    }
    
    @Override
    void display() {
        System.out.println("I am a duck decoy");
    }
    
}
