package guru.springframework.spring5webapp.leetcode.StringOrArrays;

public class CountCharacters {

    public static int countCharacters(String[] words, String chars) {

        int[] characterArray = new int[26];
        for (char ch : chars.toCharArray()) {
            characterArray[ch - 'a']++;
        }
        int result = 0;

        for (String word : words) {
            int[] wordCountArray = new int[26];
            for (char ch : word.toCharArray()) {
                wordCountArray[ch - 'a']++;
            }

            boolean characterFormed = true;
            for (int i = 0; i < 26; i++) {
                if (characterArray[i] < wordCountArray[i]) {
                    characterFormed = false;
                    break;
                }
            }
                if (characterFormed) {
                    result = result + word.length();
            }
        }


        return result;
    }
    public static void main(String[] args) {
        String[] words = {"cat", "bt", "hat", "tree"};
        String chars = "atach";
        int result = countCharacters(words, chars);
        System.out.println(result);
    }
}
