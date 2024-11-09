package guru.springframework.spring5webapp.streams;

import java.util.Arrays;

public class SumInteger {
    public static void main(String[] args) {
        int i=15623;
        System.out.println(Arrays.stream(String.valueOf(i).split("")).mapToInt(Integer::parseInt).sum());
    }
}
