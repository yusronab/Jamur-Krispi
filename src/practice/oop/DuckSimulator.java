package practice.oop;

import java.util.Scanner;

public class DuckSimulator {
    public static void main(String[] args) {
        MallardDuck mallard = new MallardDuck();
        FlyBehavior cannotFly = () -> System.out.println("< < I cannot fly > >");
        QuackBehavior squeak = () -> System.out.println("< < Squeak > >");
        RubberDuck rubber = new RubberDuck(cannotFly, squeak);
        DecoyDuck decoy = new DecoyDuck();
        Duck model = new ModelDuck();
        RedHeadDuck redHead = new RedHeadDuck();
        MuteQuack mute = new MuteQuack();
        
//        mallard.performQuack();
//        rubber.performQuack();
//        decoy.performQuack();
//        model.performFly();
//        model.setFlyBehavior(new FlyRocketPower());
//        model.performFly();
        
        Scanner input = new Scanner(System.in);
        System.out.println("""
                           | Mallard | Decoy | Model | Red Head | Rubber |
                           
                           Choose your duck:
                           """);
        String text1 = input.next();
        if (text1.equalsIgnoreCase("mallard")){
            mallard.display();
            Scanner doing = new Scanner(System.in);
            System.out.println("""
                               | Fly | Swim | Quack | Squeak |
                               | Rocket | Sillence | else |
                               
                               Do Something:
                               """);
            String text2 = doing.next();
            if (text2.equalsIgnoreCase("fly")){
                mallard.performFly();
            }
            else if (text2.equalsIgnoreCase("quack")){
                mallard.performQuack();
            }
            else if (text2.equalsIgnoreCase("squeak")){
                squeak.quack();
            }
            else if (text2.equalsIgnoreCase("sillence")){
                mute.quack();
            }
            else if (text2.equalsIgnoreCase("swim")){
                mallard.swim();
            }
            else if (text2.equalsIgnoreCase("rocket")){
                FlyRocketPower rocket = new FlyRocketPower();
                rocket.fly();
            }
            else{
                cannotFly.fly();
            }
        }
        else if (text1.equalsIgnoreCase("decoy")){
            decoy.display();
            Scanner doing = new Scanner(System.in);
            System.out.println("""
                               | Fly | Swim | Quack | Squeak |
                               | Rocket | Sillence | else |
                               
                               Do Something:
                               """);
            String text2 = doing.next();
            if (text2.equalsIgnoreCase("fly")){
                decoy.performFly();
            }
            else if (text2.equalsIgnoreCase("quack")){
                decoy.performQuack();
            }
            else if (text2.equalsIgnoreCase("squeak")){
                squeak.quack();
            }
            else if (text2.equalsIgnoreCase("sillence")){
                mute.quack();
            }
            else if (text2.equalsIgnoreCase("swim")){
                decoy.swim();
            }
            else if (text2.equalsIgnoreCase("rocket")){
                FlyRocketPower rocket = new FlyRocketPower();
                rocket.fly();
            }
            else{
                cannotFly.fly();
            }
        }
        else if (text1.equalsIgnoreCase("model")){
            model.display();
            Scanner doing = new Scanner(System.in);
            System.out.println("""
                               | Fly | Swim | Quack | Squeak |
                               | Rocket | Sillence | else |
                               
                               Do Something:
                               """);
            String text2 = doing.next();
            if (text2.equalsIgnoreCase("fly")){
                model.performFly();
            }
            else if (text2.equalsIgnoreCase("quack")){
                model.performQuack();
            }
            else if (text2.equalsIgnoreCase("squeak")){
                squeak.quack();
            }
            else if (text2.equalsIgnoreCase("sillence")){
                mute.quack();
            }
            else if (text2.equalsIgnoreCase("swim")){
                model.swim();
            }
            else if (text2.equalsIgnoreCase("rocket")){
                FlyRocketPower rocket = new FlyRocketPower();
                rocket.fly();
            }
            else{
                cannotFly.fly();
            }
        }
        else if (text1.equalsIgnoreCase("rubber")){
            rubber.display();
            Scanner doing = new Scanner(System.in);
            System.out.println("""
                               | Fly | Swim | Quack | Squeak |
                               | Rocket | Sillence | else |
                               
                               Do Something:
                               """);
            String text2 = doing.next();
            if (text2.equalsIgnoreCase("fly")){
                rubber.performFly();
            }
            else if (text2.equalsIgnoreCase("quack")){
                rubber.performQuack();
            }
            else if (text2.equalsIgnoreCase("squeak")){
                squeak.quack();
            }
            else if (text2.equalsIgnoreCase("sillence")){
                mute.quack();
            }
            else if (text2.equalsIgnoreCase("swim")){
                rubber.swim();
            }
            else if (text2.equalsIgnoreCase("rocket")){
                FlyRocketPower rocket = new FlyRocketPower();
                rocket.fly();
            }
            else{
                cannotFly.fly();
            }
        }
        else{
            redHead.display();
            Scanner doing = new Scanner(System.in);
            System.out.println("""
                               | Fly | Swim | Quack | Squeak |
                               | Rocket | Sillence | else |
                               
                               Do Something:
                               """);
            String text2 = doing.next();
            if (text2.equalsIgnoreCase("fly")){
                redHead.performFly();
            }
            else if (text2.equalsIgnoreCase("quack")){
                redHead.performQuack();
            }
            else if (text2.equalsIgnoreCase("squeak")){
                squeak.quack();
            }
            else if (text2.equalsIgnoreCase("sillence")){
                mute.quack();
            }
            else if (text2.equalsIgnoreCase("swim")){
                redHead.swim();
            }
            else if (text2.equalsIgnoreCase("rocket")){
                FlyRocketPower rocket = new FlyRocketPower();
                rocket.fly();
            }
            else{
                cannotFly.fly();
            }
        }
    }
}
