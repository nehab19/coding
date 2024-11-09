package guru.springframework.spring5webapp.leetcode.StringOrArrays;

public class BuyChocolates {
    public static int buyChoco(int[] prices, int money) {
        int smallestNumber = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int price : prices) {
            if (price < smallestNumber) {
                secondSmallest = smallestNumber;
                smallestNumber = price;
            } else {
                secondSmallest = Math.min(secondSmallest, price);
            }
        }
        if (smallestNumber + secondSmallest <= money) {
            return (money - (smallestNumber + secondSmallest));
        } else {
            return money;
        }
    }

    public static void main(String[] args) {
        int[] prices = new int[]{1, 2, 2};
        System.out.println(buyChoco(prices, 3));
    }
}
