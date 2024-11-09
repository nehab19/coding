package guru.springframework.spring5webapp.questions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateWordCount {
    public static void main(String[] args) {

        String str = "Bread butter and bread";
        Map<String, Long> collect = Arrays.stream(str.toLowerCase().split("\\W+")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        collect.entrySet().stream().filter(word-> word.getValue() > 1).forEach(print-> System.out.println(print.getKey()));
        System.out.println(collect);
    }

}
