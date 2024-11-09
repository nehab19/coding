package guru.springframework.spring5webapp.designpattern.strategy;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle=new Vehicle(new NormalDriveStrategy());
        vehicle.drive();

    }
}
