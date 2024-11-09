package guru.springframework.spring5webapp.recursion;

import java.util.ArrayList;
import java.util.List;

public class ValidParenthesis {
    static void validParenthesis(int n, int closingCount, int openingCount, String ans, ArrayList<String> list) {
        if (openingCount == n && closingCount == n) {
            list.add(ans);
            return;
        }
        if (openingCount > n || closingCount > openingCount) {
            return;
        }
        validParenthesis(n, closingCount + 1, openingCount, ans + ")", list);
        validParenthesis(n, closingCount, openingCount + 1, ans + "(", list);
    }

    static List<String> generateParenthesis(int n) {
        ArrayList<String> list = new ArrayList<>();
        validParenthesis(n, 0, 0, "", list);
        return list;
    }

    public static void main(String[] args) {
        System.out.println(generateParenthesis(2));
    }
}
