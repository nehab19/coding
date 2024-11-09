package guru.springframework.spring5webapp.factorymethod;

/**A Factory Pattern or Factory Method Pattern says that just define an
 * interface or abstract class for creating an object but let the subclasses
 * decide which class to instantiate. In other words, subclasses are responsible to create the instance of the class**/

    interface Product{
        void display();
    }

    class ConcreteProductOne implements Product{
        @Override
        public void display() {
            System.out.println("Hi I am in ConcreteProduct one");
        }
    }
    class ComcatProductTwo implements Product{
        @Override
        public void display() {
            System.out.println("Hi I am in ComcatProduct Two");
        }
    }
    interface Factory{
        Product factoryMethod();
    }

    class ConcreteFactoryOne implements Factory{
        @Override
        public Product factoryMethod() {
            return new ConcreteProductOne();
        }
    }
    class ConcreteFactoryTwo implements Factory{
        @Override
        public Product factoryMethod() {
            return new ComcatProductTwo();
        }
    }
public class FactoryMethod {
    public static void main(String[] args) {
        Factory factory=new ConcreteFactoryOne();
        Product product=factory.factoryMethod();
        product.display();

    }

}
