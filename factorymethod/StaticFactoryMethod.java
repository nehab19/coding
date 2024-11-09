package guru.springframework.spring5webapp.factorymethod;
/** These methods can provide more descriptive names for object creation and encapsulate the object creation process.**/
public class StaticFactoryMethod {
    String name;

    private StaticFactoryMethod(String name) {
        this.name = name;
    }

    public static StaticFactoryMethod getSedan() {
        return new StaticFactoryMethod("sedan");
    }

    public static StaticFactoryMethod getSSuv() {
        return new StaticFactoryMethod("suv");

    }

    @Override
    public String toString() {
        return "StaticFactoryMethod{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        StaticFactoryMethod sedan = StaticFactoryMethod.getSedan();
        StaticFactoryMethod suv = StaticFactoryMethod.getSSuv();
        System.out.println(sedan);
        System.out.println(suv);
    }
}
