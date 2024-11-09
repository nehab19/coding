package guru.springframework.spring5webapp.leetcode.StringOrArrays;

public class MaxScore {
    static int maxScoreApproach1(String s) {
        int n = s.length();
        int result = Integer.MIN_VALUE;
        System.out.println(s.charAt(n - 1));
        System.out.println(s.charAt(n - 2));
        for (int i = 0; i < n - 2; i++) {
            int zeroCount = 0;
            for (int j = 0; j <= i; j++) {
                if (s.charAt(j) == '0') {
                    zeroCount++;
                }
            }
            int oneCount = 0;
            for (int j = i + 1; j < n; j++) {
                if (s.charAt(j) == '1') {
                    oneCount++;
                }
            }
            result = Math.max(result, (zeroCount + oneCount));
        }
        return result;
    }

    static int maxScoreApproach2(String s) {
        int n = s.length();
        int result = Integer.MIN_VALUE;
        int totalOnes = (int) s.chars().filter(character -> character == '1').count();
        int zeroCount = 0;
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == '0') {
                zeroCount++;
            } else {
                totalOnes--;
            }
            result = Math.max(result, (zeroCount + totalOnes));
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(maxScoreApproach2("0101110"));
    }
}
