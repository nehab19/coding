package guru.springframework.spring5webapp.recursion;

public class PalindromePartition {

    static void palindromePartition(String ques, String ans) {
        if (ques.isEmpty()) {
            System.out.println(ans);
            return;
        }

        for (int i = 1; i <= ques.length(); i++) {
            String restOfQues = ques.substring(i);
            String component = ques.substring(0, i);
            if (isPalindrome(component))
                palindromePartition(restOfQues, ans + component + " ");
        }
    }

    static boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        palindromePartition("nitin", "");
    }
}
