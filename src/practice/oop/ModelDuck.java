package practice.oop;

public class ModelDuck extends Duck{

    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
    
    @Override
    void display() {
        System.out.println("I am a model duck");
    }
    
}
