package guru.springframework.spring5webapp.questions;

public class ReplaceOccurence {
    static void modifyString(String s, String s1, String s2) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int k = 0;
            if (s.charAt(i) == s1.charAt(k) && i + s1.length() <= s.length()) {
                int j;

                for (j = i; j < i + s1.length(); j++) {
                    if (s.charAt(j) != s1.charAt(k)) {
                        break;
                    } else {
                        k = k + 1;
                    }
                }
                if (j == i + s1.length()) {
                    ans.append(s2);
                    i = j - 1;
                } else {
                    ans.append(s.charAt(i));
                }
            } else {
                ans.append(s.charAt(i));
            }
        }
        System.out.println(ans);
    }

    // Driver Code
    public static void main(String[] args) {
        String S = "abababa";
        String S1 = "aba";
        String S2 = "a";
        modifyString(S, S1, S2);
    }
}
