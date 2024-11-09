package guru.springframework.spring5webapp.recursion;

public class CoinToss {

    static void coinToss(int n, String ans) {
        if (n == 0) {
            System.out.println(ans);
            return;
        }
        coinToss(n - 1, ans + "H");
        coinToss(n - 1, ans + "T");
    }

    public static void main(String[] args) {
        String ans = "";
        coinToss(3, ans);
    }
}
