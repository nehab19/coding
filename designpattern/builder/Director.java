package guru.springframework.spring5webapp.designpattern.builder;

//it will create students according to builder
public class Director {
    StudentBuilder studentBuilder;

    Director(StudentBuilder studentBuilder) {
        this.studentBuilder = studentBuilder;
    }

    public Student createStudent() {
        if (studentBuilder instanceof EngineerStudentBuilder) {
            return createEngineeringStudent();
        }
        if (studentBuilder instanceof MBAStudentBuilder) {
            return createMBAStudent();
        }
        return null;
    }

    private Student createMBAStudent() {
        return studentBuilder.setRollNumber(10).setAge(22).setName("Ashu").setSubjects().build();
    }

    private Student createEngineeringStudent() {
        return studentBuilder.setRollNumber(11).setName("Neha").setMotherName("Savita").setSubjects().setAge(24).build();
    }
}
