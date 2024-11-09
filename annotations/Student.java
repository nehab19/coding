package guru.springframework.spring5webapp.annotations;


public class Student {

    String name;

    public Student(String name) {
        this.name = name;
    }

    public void studying() {
        System.out.println(this.name  + " Calling student");
    }
}
