package guru.springframework.spring5webapp.inheritance;

class Rabbit implements AnimalInterface{

    @Override
    public void sound() {
        System.out.println("I make kur kur sound because I am rabbit");
    }
    @Override
    public void sleep(){
        System.out.println("rabbit is sleeping");
    }



}

class Squirrel implements AnimalInterface{

    @Override
    public void sound() {
        System.out.println("Hi I am squirrel");
    }
}

public class ImplementingClass {
    public static void main(String[] args) {
        AnimalInterface.describe();
        Rabbit rabbit=new Rabbit();
        rabbit.sound();
        rabbit.performAction();
        rabbit.sleep();

        Squirrel squirrel=new Squirrel();
        squirrel.sound();
        squirrel.performAction();
        squirrel.sleep();

    }
}
