package guru.springframework.spring5webapp.functionalInterface;


@java.lang.FunctionalInterface
interface Sound {
    int x=20;
    abstract String makeSound(String animal);

    //we can have any number of abstract and default methods
    default void sound(){
        System.out.println("The value of x is : "+x);
    }
    static void sound1(){
        System.out.println("The value of x is : "+x);
    }
}

public class FunctionalInterface {
    public static void main(String[] args) {
        //anonymous class
        Sound sound = (String animal) -> "I am " + animal + " and I roar";
        String soundMake = sound.makeSound("Lion");
        System.out.println(soundMake);
    }
}

