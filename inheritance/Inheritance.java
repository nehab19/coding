package guru.springframework.spring5webapp.inheritance;

class Animal {

    public void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Animal amimal=new Animal();
        amimal.sound();

        Animal dog=new Dog();
        dog.sound();

    }

}


