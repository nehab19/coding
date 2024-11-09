package guru.springframework.spring5webapp.questions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        String str="Hello java";
       String newString=str.replaceAll(" ","");
        System.out.println(newString);



       String reverse= "when in doubt use brute force";
        List<String> reversedWords =Arrays.stream(reverse.split("\\W+")).collect(Collectors.collectingAndThen(Collectors.toList(),list->{
            Collections.reverse(list);
            return list;
        }));
        String result= String.join(" ",reversedWords);
        System.out.println(result);

    }
}
