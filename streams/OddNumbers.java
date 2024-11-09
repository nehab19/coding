package guru.springframework.spring5webapp.streams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class OddNumbers {
    public static void main(String[] args) {

        Stream.iterate(1,n->n+2).limit(10).forEach(System.out::println);

    }
}

