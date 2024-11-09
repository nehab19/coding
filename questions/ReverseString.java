package guru.springframework.spring5webapp.questions;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseString {
    public static void main(String[] args) {
        String str="Java Concept Of The Day";
        String collect = Arrays.stream(str.split("\\s+")).map(word -> new StringBuilder(word).reverse().toString()).collect(Collectors.joining(" "));
        System.out.println(collect);
    }
}
