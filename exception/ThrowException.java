package guru.springframework.spring5webapp.exception;

public class ThrowException {
    int a = 1;
    int b = 0;

    public static void fun() {
        try {
            throw new NullPointerException();
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException in fun");
            throw e;
        }
    }

    public static void main(String[] args) {
        try{
            fun();
        }catch (NullPointerException e){
            System.out.println("Caught NullPointerException in main");
        }
    }
}
