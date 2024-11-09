package guru.springframework.spring5webapp.questions;

import java.util.Arrays;

public class LongestCommonPrefix {
    static String longestCommonPrefix(String[] arrays) {
        if (arrays == null || arrays.length == 0) {
            return "-1";
        }
        Arrays.sort(arrays);
        String firstElement = arrays[0];
        String lastElement = arrays[arrays.length - 1];

        int minlength = Math.min(firstElement.length(), lastElement.length());
        int i = 0;

        while (i < minlength && firstElement.charAt(i) == lastElement.charAt(i)) {
            i++;
        }
        if (i == 0) {
            return "-1";
        }
        return firstElement.substring(0, i);
    }

    public static void main(String[] args) {
      String[] arrays={"flower","flow","flight"};
        System.out.println("The longest prefix is : " +longestCommonPrefix(arrays));
    }
}
