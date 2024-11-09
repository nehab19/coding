package guru.springframework.spring5webapp.streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RepetativeElement {
    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");
        Map<String, Long> stringLongMap = listOfStrings.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(stringLongMap.entrySet());
        stringLongMap.entrySet().stream().max(Map.Entry.comparingByValue()).get();
        Map.Entry<String, Long> stringLongEntry = stringLongMap.entrySet().stream().max(Map.Entry.comparingByValue()).get();
        System.out.println("Most frequent key : "+stringLongEntry.getKey());
        System.out.println("Most frequent value : "+stringLongEntry.getValue());
    }

}
