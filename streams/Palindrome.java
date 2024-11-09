package guru.springframework.spring5webapp.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Palindrome {
    public boolean isPalindrome(int x) {
       if(x<0){
           return false;
       }
       long reverseNumber=0;
       long temp=x;
       while(temp!=0){
           int digit= (int) (temp%10);
           reverseNumber=reverseNumber*10+digit;
           temp=temp/10;
       }
       return (reverseNumber==x);
    }
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";;
        boolean isPalindrome= IntStream.range(0,str.length()-1).noneMatch
                (element->str.charAt(element) != str.charAt(str.length()-element-1));
        if(isPalindrome){
            System.out.println("It is palindrome");
        }else{
            System.out.println("It is not a palindrome");
        }
    }
}
