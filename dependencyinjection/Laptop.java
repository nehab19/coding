package guru.springframework.spring5webapp.dependencyinjection;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {

    public void compile(){
        System.out.println("Hi I in compile method of Laptop");
    }
}
