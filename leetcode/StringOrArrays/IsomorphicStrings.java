package guru.springframework.spring5webapp.leetcode.StringOrArrays;

import java.util.HashMap;

public class IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();
        int size = s.length();
        for (int i = 0; i < size; i++) {
            char char1 = s.charAt(i);
            char char2 = t.charAt(i);

            if ((map1.containsKey(char1) && map1.get(char1) != char2) || map2.containsKey(char2) && map2.get(char2) != char1) {
                return false;
            }
            map1.put(char1, char2);
            map2.put(char2, char1);
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg","gge"));
    }
}
