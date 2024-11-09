package guru.springframework.spring5webapp.leetcode.StringOrArrays;

public class MaxProduct {
    static int maxProduct(int[] nums) {
        int result = 0;
        int maxNumber = nums[0];

        for (int i = 1; i < nums.length; i++) {
            result = Math.max(result, ((maxNumber - 1) * (nums[i] - 1)));
            maxNumber = Math.max(maxNumber, nums[i]);
        }
        return result;
    }

    static int maxProductApproach(int[] nums) {
        int firstMax = 0;
        int secondMax = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > firstMax) {
                secondMax = firstMax;
                firstMax = nums[i];
            } else {
                secondMax = Math.max(secondMax, nums[i]);
            }
        }
        return (firstMax - 1) * (secondMax - 1);
    }

    public static void main(String[] args) {
        System.out.println(maxProduct(new int[]{1, 4, 6, 7, 8}));
        System.out.println(maxProductApproach(new int[]{1, 4, 6, 7, 8}));
    }
}
