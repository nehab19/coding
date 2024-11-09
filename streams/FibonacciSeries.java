package guru.springframework.spring5webapp.streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 10; // Number of terms in the Fibonacci series
        int firstTerm = 0, secondTerm = 1;

        System.out.print("Fibonacci Series up to " + n + " terms: ");

        for (int i = 0; i <= n; i++) {
            System.out.print(firstTerm + " ");

            // Compute the next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

        Stream.iterate(new int[]{0, 1}, f -> new int[]{f[1], f[0] + f[1]})
                .limit(10)
                .map(f -> f[0]).
        forEach(i -> System.out.print(i + " "));


    }

}
