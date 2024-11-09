package guru.springframework.spring5webapp.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.IntStream;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = new int[] {5, 1, 7, 3, 9, 6};
        Integer[] arrayObject = {1, 2, 3, 4, 5};
        int[] array1 = IntStream.range(0, array.length - 1).map(element -> array[array.length - element - 1]).toArray();
        System.out.println(Arrays.toString(Arrays.stream(arrayObject).sorted(Comparator.reverseOrder()).toArray()));
        System.out.println(Arrays.toString(array1));
    }
}
