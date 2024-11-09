package guru.springframework.spring5webapp.exception;

/** in this case 1/0 will give an arithematic exception which is not present in compute
 * method rather than main so it will return directly to main method **/

public class ExceptionHandler {
    static int divideByZero(int a, int b) {
        int i = a / b;
        return i;
    }

    static int computeDivision(int a, int b) {
        int res = 0;
        try {
            res = divideByZero(a, b);
        } catch (NumberFormatException ex) {
            // ElevatorDisplay message when exception occurs
            System.out.println("NumberFormatException is occurred");
        }
        return res;
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        try {
            int i = computeDivision(a, b);
        } catch (ArithmeticException ex) {
            // ElevatorDisplay message when exception occurs
            System.out.println("Arithematic Exception is occurred");
        }
       }
}
