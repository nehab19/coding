package guru.springframework.spring5webapp.leetcode.StringOrArrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class DestinationCity {
    public static String destCity(List<List<String>> paths) {
        HashSet<String> stringHashSet = new HashSet<>();
        paths.forEach(set -> stringHashSet.add(set.get(0)));
        for (List<String> path : paths) {
            String location = path.get(1);
            if (!stringHashSet.contains(location)) {
                return location;
            }
        }
        return "";

    }


    public static void main(String[] args) {
        List<List<String>> paths = Arrays.asList(
                Arrays.asList("London", "New York"),
                Arrays.asList("New York", "Lima"),
                Arrays.asList("Lima", "Sao Paulo")
        );
        System.out.println(destCity(paths));
    }
}
