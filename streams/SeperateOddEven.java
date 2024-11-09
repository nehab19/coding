package guru.springframework.spring5webapp.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SeperateOddEven {
    public static void main(String[] args) {
    /*    List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
        List<Integer> evenNumbers = listOfIntegers.stream().filter(number -> number % 2 == 0).collect(Collectors.toList());
        List<Integer> oddNumbers = listOfIntegers.stream().filter(number -> number % 2 != 0).collect(Collectors.toList());
        System.out.println("Even numbers ....");
        System.out.println(evenNumbers);
        System.out.println("Odd Numbers...");
        System.out.println(oddNumbers);*/

        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
        //we have a map now with true and false
        Map<Boolean, List<Integer>> oddEvenMap = listOfIntegers.stream().collect(Collectors.partitioningBy(number -> number % 2 == 0));
        oddEvenMap.forEach((key, value) -> {
            if (key) {
                System.out.println("Even numbers");
            } else {
                System.out.println("Odd Numbers");
            }
            for (int number : value) {
                System.out.println(number);
            }
        });
    }

}
