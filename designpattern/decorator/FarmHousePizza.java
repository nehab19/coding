package guru.springframework.spring5webapp.designpattern.decorator;

public class FarmHousePizza extends BasePizza {

    @Override
    int cost() {
        return 200;
    }
}
