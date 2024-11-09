package guru.springframework.spring5webapp.recursion;

public class ClimbingStairs {
    static void climbingStairs(int current, int n, String ans) {
        if (current == n) {
            System.out.println(ans);
            return;
        }
        if (current > n) {
            return;
        }
        climbingStairs(current + 1, n, ans + "1");
        climbingStairs(current + 2, n, ans + "2");
        climbingStairs(current + 3, n, ans + "3");
    }

    public static void main(String[] args) {
        climbingStairs(0, 5, "");
    }
}
