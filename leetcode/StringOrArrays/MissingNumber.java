package guru.springframework.spring5webapp.leetcode.StringOrArrays;

public class MissingNumber {
    public static int missingNumberApproach1(int[] nums) {
        int length = nums.length;
        int totalSum = length * (length + 1) / 2;
        for (int i = 0; i < length; i++) {
            totalSum = totalSum - nums[i];
        }
        return totalSum;
    }

    public static int missingNumberApproach2(int[] nums) {
        int sum = nums.length;
        for (int i = 0; i < nums.length; i++) {
            sum = sum ^ i;
            sum = sum ^ nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        //System.out.println(missingNumberApproach1(new int[]{3, 0, 1}));
        System.out.println(missingNumberApproach2(new int[]{3, 0, 1}));
    }

}
