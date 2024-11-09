package guru.springframework.spring5webapp.streams;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SortArray {
    public static void main(String[] args) {
        int[] a = new int[]{4, 2, 7, 1};
        int[] b = new int[]{8, 3, 9, 5};
        int[] c = IntStream.concat(Arrays.stream(a).sorted().distinct(), Arrays.stream(b).sorted().distinct()).toArray();
        System.out.println(Arrays.toString(Arrays.stream(c).sorted().distinct().toArray()));
    }
}
