package guru.springframework.spring5webapp.streams;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
public class IncreasingOrderLength {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
        listOfStrings.stream().sorted(Comparator.comparing(s->s.length())).forEach(System.out::println);
    }
}
