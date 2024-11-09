package guru.springframework.spring5webapp.designpattern.factory;

public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Hi I am circle");
    }
}
