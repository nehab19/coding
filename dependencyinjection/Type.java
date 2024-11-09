package guru.springframework.spring5webapp.dependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Type {
    @Autowired
    @Qualifier("laptop")
    private Computer computer;
    public int age;
    Type(){
        System.out.println("I am in default constructor");
    }
    Type(int age){
        this.age=age;
        System.out.println(" I am in parameterised constructor");
    }

    /* Type(Computer computer){
         this.computer=computer;
     }*/
    public void build() {
        Type type=new Type(5);
        computer.compile();
    }

}
