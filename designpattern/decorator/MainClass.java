package guru.springframework.spring5webapp.designpattern.decorator;

public class MainClass {

    public static void main(String[] args) {
        ToppingDecorator toppingDecorator = new ExtraCheeze(new MargheritaPizza());
        System.out.println("Cost of margherita pizza with extra cheeze : " + toppingDecorator.cost());

        ToppingDecorator toppingDecorator1 = new Mushroom(new ExtraCheeze(new MargheritaPizza()));

    }
}
