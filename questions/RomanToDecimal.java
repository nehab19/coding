package guru.springframework.spring5webapp.questions;

public class RomanToDecimal {
    public static int value(char r) {
        if (r == 'I')
            return 1;
        if (r == 'V')
            return 5;
        if (r == 'X')
            return 10;
        if (r == 'L')
            return 50;
        if (r == 'C')
            return 100;
        if (r == 'D')
            return 500;
        if (r == 'M')
            return 1000;
        return -1;
    }

    public static int romanToDecimal(String str) {
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            int s1 = value(str.charAt(i));
            if (i + 1 < str.length()) {
                int s2 = value(str.charAt(i + 1));
                if (s1 >= s2) {
                    result = result + s1;
                } else {
                    result = result + (s2 - s1);
                    i++;
                }
            } else {
                result = result + s1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "IX";
        System.out.println(romanToDecimal(str));
    }
}
