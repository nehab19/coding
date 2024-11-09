package guru.springframework.spring5webapp.questions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseStrings {
    public static String reverseWords(String s){
        String [] array=s.trim().split("\\s+");
        StringBuilder stringBuilder=new StringBuilder();
        for(int i=array.length-1;i>=0;i--){
            stringBuilder.append(array[i]);
            if(i !=0){
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString();
        /*List<String> collect = Arrays.stream(s.split("\\W+")).collect(Collectors.collectingAndThen(Collectors.toList(), word -> {
            Collections.reverse(word);
            return word;
        }));
        return String.join(" ",collect);*/
    }


    public static void main(String[] args) {
        String words="Neha is the best";
        System.out.println(reverseWords(words));
    }
}
