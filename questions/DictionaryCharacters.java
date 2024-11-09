package guru.springframework.spring5webapp.questions;

import java.util.Arrays;
import java.util.Vector;

public class DictionaryCharacters {

    static boolean isSubSequence(String str1, String str2) {
        int str1Length = str1.length();
        int str2Length = str2.length();

        int j = 0;
        for (int i = 0; i < str2Length && j < str1Length; i++) {
            if (str1.charAt(j) == str2.charAt(i)) {
                j++;
            }
        }
        return (j == str1Length);
    }

    static String findLongestString(Vector<String> dictionary, String str) {
        String result = "";
        int length = 0;

        for (String word : dictionary) {
            if (length < word.length() && isSubSequence(word, str)) {
                result = word;
                length = word.length();
            }
        }
        return result;
    }


    public static void main(String[] args) {
        String[] arr = {"ale", "apple", "monkey", "plea"};
        Vector dict = new Vector(Arrays.asList(arr));
        String str = "abpcplea";
        System.out.println(findLongestString(dict, str));
    }
}
