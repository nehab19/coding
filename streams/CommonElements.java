package guru.springframework.spring5webapp.streams;

import java.util.Arrays;
import java.util.List;

public class CommonElements {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);
        List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34);
        list1.stream().filter(element->list2.contains(element)).forEach(print-> System.out.println("The element is : " +print));
    }
}
