package guru.springframework.spring5webapp.inheritance;

public interface AnimalInterface {
    void sound();

    default void sleep() {
        System.out.println("The animal is sleeping");
    }

    static void describe() {
        System.out.println("Animals are living beings that can move.");
    }

    private void sharedCode() {
        System.out.println("Shared code logic");
    }


    default void performAction() {
        sharedCode();
        describe();
        System.out.println("Performing action");
    }

}
