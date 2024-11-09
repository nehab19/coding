package guru.springframework.spring5webapp.streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String inputString = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();
        System.out.println(inputString);
        Set<String> characters = new HashSet<>();
        Set<String> collect = Arrays.stream(inputString.split("")).filter(character -> !characters.add(character)).collect(Collectors.toSet());
        System.out.println(collect);
    }

}
