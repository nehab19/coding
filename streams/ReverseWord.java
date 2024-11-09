package guru.springframework.spring5webapp.streams;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWord {
    public static void main(String[] args) {
        String str = "Java Concept Of The Day";
        String collect = Arrays.stream(str.split(" ")).map(word -> new StringBuilder(word).reverse()).collect(Collectors.joining(" "));
        System.out.println(collect);
    }
}
