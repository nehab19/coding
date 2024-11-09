package guru.springframework.spring5webapp.streams;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstRepeatedCharacter {
    public static void main(String[] args) {
        String inputString = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();
        Map<String, Long> collect = Arrays.stream(inputString.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        System.out.println(collect);
        Map.Entry<String, Long> stringLongEntry = collect.entrySet().stream().filter(character -> character.getValue().intValue() > 1).findFirst().get();
        Map.Entry<String, Long> stringLongEntryNon = collect.entrySet().stream().filter(character -> character.getValue().intValue() == 1).findFirst().get();
        System.out.println("Repeated Character : " +stringLongEntry.getKey());
        System.out.println("Non Repeated Character : " +stringLongEntryNon.getKey());
    }

}
