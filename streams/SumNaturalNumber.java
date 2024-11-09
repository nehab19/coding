package guru.springframework.spring5webapp.streams;

import java.util.stream.IntStream;

public class SumNaturalNumber {
    public static void main(String[] args) {
        System.out.println(IntStream.rangeClosed(1,10).sum());
    }
}
