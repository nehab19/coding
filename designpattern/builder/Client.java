package guru.springframework.spring5webapp.designpattern.builder;

public class Client {

    public static void main(String[] args) {
        Director directorObject1=new Director(new EngineerStudentBuilder());
        Director directorObject2=new Director(new MBAStudentBuilder());

        Student engineerStudent=directorObject1.createStudent();
        Student mbaStudent=directorObject2.createStudent();

        System.out.println(engineerStudent.toString());
        System.out.println(mbaStudent.toString());
    }
}
