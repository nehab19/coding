package guru.springframework.spring5webapp.arrays;

import java.math.BigInteger;

public class Factorial {
    public static BigInteger findFactorial(int number){
        BigInteger factorial=BigInteger.ONE;
        for(int i=1;i<=number;i++){
            factorial=factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }

    public static void main(String[] args) {
        System.out.println("Factorial of a number is : " +findFactorial(100));
    }
}
