package guru.springframework.spring5webapp.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SecondHighestNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 9, 1, 4, 8, 6);
        System.out.println(numbers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get());
    }
}
