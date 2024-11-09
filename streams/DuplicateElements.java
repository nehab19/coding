package guru.springframework.spring5webapp.streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElements {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(111, 222, 333, 111, 555, 333, 777, 222);
        Set<Integer> uniqueElements = new HashSet<>();
        Set<Integer> collect = listOfIntegers.stream().filter(element -> !uniqueElements.add(element)).collect(Collectors.toSet());
        System.out.println(collect);
    }

}
