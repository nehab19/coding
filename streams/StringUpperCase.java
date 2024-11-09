package guru.springframework.spring5webapp.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringUpperCase {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("java", "python", "c++", "javascript");
        List<String> list = strings.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(list);

        //Even numbers sum

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(numbers.stream().filter(number->number%2==0).mapToInt(number->number).sum());
        System.out.println(numbers.stream().filter(number->number%2==0).mapToInt(Integer::intValue).sum());
    }
}
