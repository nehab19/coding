package guru.springframework.spring5webapp.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FilterExample {
    public static void main(String[] args) {
        List<String> names= Arrays.asList("Sam","Bunny","Naina");
       names.stream().filter(name->!name.equals("Neha")).forEach(System.out::println);

       /* for(String name:names){
            if(!name.equals("Neha")){
                System.out.println(name);
            }
        }*/
    }
}
