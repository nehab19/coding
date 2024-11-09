package guru.springframework.spring5webapp.questions;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class RepeatingCharacters {
    static void longestSubstring(String inputString) {
        char[] array = inputString.toCharArray();
        String longestSubstring = null;
        int longestSubstringLength = 0;
        LinkedHashMap<Character, Integer> charPositionMap = new LinkedHashMap<>();
        for (int i = 0; i < array.length; i++) {
           char character=array[i];
           if(!charPositionMap.containsKey(character)){
               charPositionMap.put(character,i);
           }else{
               i=charPositionMap.get(character);
               charPositionMap.clear();
           }

        }
        longestSubstringLength=charPositionMap.size();
        longestSubstring=charPositionMap.keySet().toString();
        System.out.println("Lngest substring : "+longestSubstring);
        System.out.println("Lngest substring length :  "+longestSubstringLength);

    }

    public static void main(String[] args) {
        longestSubstring("javaconceptoftheday");
    }
}
