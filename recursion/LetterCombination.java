package guru.springframework.spring5webapp.recursion;

public class LetterCombination {
    static String getCode(char ch) {
        String result = "";
        if (ch == '2') result = "abc";
        else if (ch == '3') result = "def";
        else if (ch == '4') result = "ghi";
        else if (ch == '5') result = "jkl";
        else if (ch == '6') result = "mno";
        else if (ch == '7') result = "pqrs";
        else if (ch == '8') result = "tuv";
        else if (ch == '9') result = "wxyz";
        return result;
    }

    static public void letterCombinations(String ques, String ans) {
        if (ques.isEmpty()) {
            System.out.println(ans);
            return;
        }
        char ch = ques.charAt(0);
        String newQues = ques.substring(1);
        String code = getCode(ch);
        for (int i = 0; i < code.length(); i++) {
            letterCombinations(newQues, ans + code.charAt(i));
        }
    }

    public static void main(String[] args) {
        letterCombinations("23","");
    }

}
