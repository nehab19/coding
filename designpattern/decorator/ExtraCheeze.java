package guru.springframework.spring5webapp.designpattern.decorator;

public class ExtraCheeze extends ToppingDecorator {

    BasePizza basePizza;

    ExtraCheeze(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    int cost() {
        return this.basePizza.cost() + 10;
    }
}
