package guru.springframework.spring5webapp.designpattern.strategy;

public class Vehicle {
    //every vehicle has its own drive strategy

    DriveStrategy driveStrategy;

    Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive() {
        //it will call its drive strategy drive method;
        driveStrategy.drive();
    }

}
