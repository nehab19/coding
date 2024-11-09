package guru.springframework.spring5webapp.dependencyinjection;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer{
    @Override
    public void compile() {
        System.out.println("Hi I am in compile method of Desktop ");
    }
}
