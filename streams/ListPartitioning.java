package guru.springframework.spring5webapp.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListPartitioning {
    public static void main(String[] args) {
        List<String> strings = List.of("Java", "Go", "Python", "C", "Ruby");
        Map<Boolean, List<String>> booleanListMap = strings.stream().collect(Collectors.partitioningBy(s -> s.length() > 3));
        System.out.println("String with length 3 are : "+booleanListMap.get(true));
        System.out.println("String with not length 3 are : "+booleanListMap.get(false));

        }
    }
