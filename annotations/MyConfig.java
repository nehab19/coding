package guru.springframework.spring5webapp.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class MyConfig {

    @Bean(name = "Student1")
    @Lazy
    public Student getStudent(){
        System.out.println("Creating first object of student");
        return  new Student("Student1");
    }

    /** as in qualifier we are using student 1 so student 2 object will not be created **/
    @Bean(name = "Student2")
    @Lazy
    public Student createStudent(){
        System.out.println("Creating second object of student");
        return  new Student("Student2");
    }
}
