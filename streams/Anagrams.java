package guru.springframework.spring5webapp.streams;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Anagrams {
    public static void main(String[] args) {
        String s1 = "RaceCar";
        String s2 = "CarRace";
        String s1String = Arrays.stream(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        String s2String = Arrays.stream(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
        System.out.println("S1 string :: "+s1String);
        System.out.println("S2 string :: "+s2String);
        if(s1String.equalsIgnoreCase(s2String)){
            System.out.println("String is anagram");
        }else{
            System.out.println("String is not anagram");
        }
    }
}
