package guru.springframework.spring5webapp.consumer;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerTest {
    public static void main(String[] args) {
        Consumer<String> cs= s-> System.out.println(s);
        cs.accept("Hi neha");
        Supplier<String> supplier = ()->{
            String [] strings={"Sunny", "Bunny","Hunny"};
            return strings[0];
        };
        System.out.println(supplier.get());
    }
}
