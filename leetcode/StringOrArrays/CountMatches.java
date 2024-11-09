package guru.springframework.spring5webapp.leetcode.StringOrArrays;

public class CountMatches {
    public static int numberOfMatches(int num) {
        int result = 0;
        while (num > 1) {
            if (num % 2 == 0) {
                result = result + num / 2;
                num = num / 2;
            } else {
                result = result + (num - 1) / 2;
                num = (num - 1) / 2 + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(numberOfMatches(7));
    }
}
