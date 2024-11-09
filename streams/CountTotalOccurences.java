package guru.springframework.spring5webapp.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountTotalOccurences {

    public static void main(String[] args) {
        String s = "Java is java again java again";
        char c = 'a';
        Long list = Arrays.stream(s.toLowerCase().split("")).filter(character->character.equalsIgnoreCase(String.valueOf(c))).count();
        System.out.println(list);
    }
}
