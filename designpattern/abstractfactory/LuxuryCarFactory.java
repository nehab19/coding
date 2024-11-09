package guru.springframework.spring5webapp.designpattern.abstractfactory;

public class LuxuryCarFactory implements AbstractFactory {
    int price;

    LuxuryCarFactory(int price) {
        this.price = price;
    }
    @Override
    public Car getInstance(int price) {
        if (price <= 35000) {
            return new LuxuryCar1();
        } else if (price > 35000) {
            return new LuxuryCar2();
        }
        return null;
    }
}
