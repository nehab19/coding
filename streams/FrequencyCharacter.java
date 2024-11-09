package guru.springframework.spring5webapp.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyCharacter {
    public static void main(String[] args) {
        String request="nehaaaaa budhiraja";
        Map<String, Long> collect = Arrays.stream(request.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);

    }
}
