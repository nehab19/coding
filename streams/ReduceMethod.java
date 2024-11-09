package guru.springframework.spring5webapp.streams;

import java.util.Arrays;
import java.util.List;

public class ReduceMethod {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(100, 34, 2, 4, 5, 6, 7, 8, 10, 20);
        System.out.println("Sum through reduce is : " + numbers.stream().map(number -> number * 2).reduce(0, (c, v) -> c + v));
        System.out.println("Sum through sum is : " + numbers.stream().map(number -> number * 2).reduce(0, (c, v) -> Integer.sum(c, v)));
        System.out.println("Sum through direct sum is : " + numbers.stream().map(number -> number * 2).reduce(0, Integer::sum));
        System.out.println("Sum  is : " + numbers.stream().mapToInt(number -> number * 2).sum());
        System.out.println("Sum of number divisible by 5 are : " + numbers.stream().filter(number -> number % 5 == 0).reduce(Integer::sum).get());
        numbers.stream().filter(number -> number > 2).sorted().forEach(System.out::println);
    }
}
