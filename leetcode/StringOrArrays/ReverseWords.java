package guru.springframework.spring5webapp.leetcode.StringOrArrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseWords {
    static public String reverseWords(String s) {
        List<String> reverseWord= Arrays.stream(s.trim().split("\\W+")).collect(Collectors.collectingAndThen(Collectors.toList(),word->{
            Collections.reverse(word);
            return word;
        }));
        System.out.println(reverseWord);
        String result= String.join(" ",reverseWord);
        return result;
    }



    public static void main(String[] args) {
        System.out.println(reverseWords("  hello world  "));
    }
}
