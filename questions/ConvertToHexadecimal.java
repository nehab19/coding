package guru.springframework.spring5webapp.questions;

public class ConvertToHexadecimal {
    static String convertDecimalToHexadecimal(int num) {
        StringBuilder temp = new StringBuilder();
        if (num != 0) {
            int remainder = num % 16;
            char character;
            if (remainder < 10) {
                character = (char) (remainder + 48);
            } else {
                character = (char) (remainder + 87);
            }
            temp.append(character);
            num = num / 16;
        }
        return temp.toString();
    }

    static String encryptString(String character) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < character.length(); i++) {
            char ch = character.charAt(i);
            int count = 0;
            String hex;

            while (i < character.length() && character.charAt(i) == ch) {
                count++;
                i++;
            }
            i--;
            hex = convertDecimalToHexadecimal(count);
            answer.append(ch);
            answer.append(hex);
        }
        answer.reverse();
        return answer.toString();

    }

    public static void main(String[] args) {
        String character = "aabbc";
        // Function Call
        System.out.println(encryptString(character));
    }
}
