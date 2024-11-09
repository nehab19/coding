package guru.springframework.spring5webapp.questions;

public class SwapVariable {
    public static void main(String[] args) {
        String a = "Coding";
        String b = "Ninjas";
        System.out.println("Before swap: " + a + b);

        a=a+b;
        System.out.println(a);

        b=a.substring(0,a.length()-b.length());
        System.out.println(b);

        a=a.substring(b.length());
        System.out.println(a);
    }
}
