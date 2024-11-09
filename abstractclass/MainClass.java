package guru.springframework.spring5webapp.abstractclass;

abstract class Base {
    Base() {
        System.out.println("I am in base class constructor");
    }

    abstract void fun();

    static void makeSound() {
        System.out.println("Hi I am in static method of base class");
    }

    void call() {
        System.out.println("Hi i am in base class call");
    }

    /**
     * final methods cannot be overiden
     **/
    final void print() {
        System.out.println("I am in print of base class");
    }


}

class DerivedClass extends Base {
    DerivedClass() {
        System.out.println("Hi i am in Derived class constructor");
    }

    static void makeSound() {
        System.out.println("Hi I am in static method of derived class");
    }

    @Override
    void call() {
        System.out.println("Hi i am in derived class call");
    }

    @Override
    void fun() {
        System.out.println("I am having fun in derived class");
    }
}

public class MainClass {
    public static void main(String[] args) {
        DerivedClass derivedClass = new DerivedClass();
        derivedClass.fun();
        Base.makeSound();
        derivedClass.call();
        derivedClass.print();
        DerivedClass.makeSound();
    }

}
