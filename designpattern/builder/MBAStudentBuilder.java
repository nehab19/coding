package guru.springframework.spring5webapp.designpattern.builder;

import java.util.ArrayList;
import java.util.List;

public class MBAStudentBuilder extends StudentBuilder {

    @Override
    public StudentBuilder setSubjects() {
        List<String> subject = new ArrayList<>();
        subject.add("Economics");
        subject.add("Business Studies");
        subject.add("Maths");
        this.subjects=subject;
        return this;
    }
}
