package guru.springframework.spring5webapp.leetcode.StringOrArrays;

public class LargestOddNumber {
    static String findLargestOddNumber(String number) {
        for (int i = number.length() - 1; i >= 0; i--) {
            System.out.println(Integer.parseInt(String.valueOf(number.charAt(i))));
            if (Character.getNumericValue(number.charAt(i)) % 2 != 0) {
                return number.substring(0, i + 1);
            }
        }
        return "";

    }

    public static void main(String[] args) {
        System.out.println(findLargestOddNumber("13970"));
    }
}
