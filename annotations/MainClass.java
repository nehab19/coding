package guru.springframework.spring5webapp.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MainClass implements CommandLineRunner {

    @Autowired
    @Qualifier("Student1")
    private Student student;

    public static void main(String[] args) {
        SpringApplication.run(MainClass.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        student.studying();
    }
}
