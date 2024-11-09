package guru.springframework.spring5webapp.streams;

import java.util.Arrays;
import java.util.OptionalDouble;

public class SumAverage {
    public static void main(String[] args) {
        int[] a = new int[] {45, 12, 56, 15, 24, 75, 31, 89};
        int sum = Arrays.stream(a).sum();
        Double average = Arrays.stream(a).average().getAsDouble();
        System.out.println("Sum is : "+sum);
        System.out.println("Average is : "+average);
    }
}
