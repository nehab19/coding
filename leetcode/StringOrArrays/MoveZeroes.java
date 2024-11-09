package guru.springframework.spring5webapp.leetcode.StringOrArrays;

import java.util.Arrays;

public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
            }
        }
        Arrays.stream(nums).forEach(System.out::println);
    }

    public static void main(String[] args)  {
        moveZeroes(new int[]{0,1,0,3,12});
    }
}

