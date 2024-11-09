package guru.springframework.spring5webapp.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MaxMinNumbers {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        System.out.println("Max element : " + listOfIntegers.stream().max(Comparator.naturalOrder()).get());
        System.out.println("Min element : " + listOfIntegers.stream().min(Comparator.naturalOrder()).get());
    }
}
