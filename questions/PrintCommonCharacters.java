package guru.springframework.spring5webapp.questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintCommonCharacters {
    public static void main(String[] args) {
        String str1="thin sticks";
        String str2="thick bricks";
        List<String> list = Arrays.stream(str1.split("")).collect(Collectors.toList());
        List<String> list1 = Arrays.stream(str2.split("")).collect(Collectors.toList());

        System.out.println(list);
        System.out.println(list1);
        list.stream().filter(list1::contains).collect(Collectors.toList()).stream().sorted().distinct().forEach(System.out::println);
    }
}
