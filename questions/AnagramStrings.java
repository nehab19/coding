package guru.springframework.spring5webapp.questions;

import java.util.Arrays;

public class AnagramStrings {
    public static void main(String[] args) {
        String string1="Neha";
        String string2="ahne";
        char[] array1=string1.toUpperCase().toCharArray();
        char[] array2=string2.toUpperCase().toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);
        if(Arrays.equals(array1,array2)){
            System.out.println("Strings are anagrams");
        }else{
            System.out.println("Strings are not anagrams");
        }
    }
}
