package guru.springframework.spring5webapp.designpattern.factory;

public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Hi I am Rectangle");
    }
}
