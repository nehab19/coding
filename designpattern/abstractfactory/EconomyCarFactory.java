package guru.springframework.spring5webapp.designpattern.abstractfactory;

public class EconomyCarFactory implements AbstractFactory {

    int price;

    EconomyCarFactory(int price) {
        this.price = price;
    }

    @Override
    public Car getInstance(int price) {
        if (price <= 20000) {
            return new EconomicCar1();
        } else if (price > 20000) {
            return new EconomyCar2();
        }
        return null;
    }
}
