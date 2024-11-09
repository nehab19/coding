package guru.springframework.spring5webapp.designpattern.decorator;

public class VegDelightPizza extends BasePizza{

    @Override
    int cost() {
        return 120;
    }
}
