package guru.springframework.spring5webapp.staticMethod;

public class Mobile {

    int price;
    static String name;
    String brand;

    public void show() {
        System.out.println("Hi I am in non static block");
        System.out.println(brand + " : " + name + " : " + price + " : ");
    }

    public static void showStatic() {
        System.out.println("Hi I am in static block ");
        System.out.println(name + " : ");
    }

    Mobile(){
        System.out.println("Hi I am in constructor");
        price=0;
        brand="Nokia";
    }
    static {
        System.out.println("Hi I am in static block");
        name="Samsung";
    }
}
class Main{
    public static void main(String[] args) {
        Mobile.name="Nokia";
    }
}
