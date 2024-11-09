package guru.springframework.spring5webapp.designpattern.abstractfactory;

public class AbstractFactoryProducer {
    public AbstractFactory getFactoryInstance(String value,int price) {
        if (value.equalsIgnoreCase("Economy")) {
            return new EconomyCarFactory(price);
        } else if (value.equalsIgnoreCase("Luxury") || value.equalsIgnoreCase("Preemium")) {
            return new LuxuryCarFactory(price);
        }
        return null;
    }
}
