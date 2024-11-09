package guru.springframework.spring5webapp.arrays;

public class MaxSubArray {
    static int findMaxSubArray(int[] array) {
        int maximumSoFar = Integer.MIN_VALUE;
        int maximumEnd = 0;

        for (int i = 0; i < array.length; i++) {
            maximumEnd = maximumEnd + array[i];
            maximumSoFar = Math.max(maximumSoFar, maximumEnd);
            maximumEnd = Math.max(maximumEnd, 0);
        }
        return maximumSoFar;
    }

    static void maxSubArraySum(int a[]) {
        int max_so_far = Integer.MIN_VALUE, max_end = 0, start = 0, end = 0, s = 0;
        for (int i = 0; i < a.length; i++) {
            max_end = max_end + a[i];
            if (max_so_far <= max_end) {
                max_so_far = max_end;
                start = s;
                end = i;
            }
            if (max_end < 0) {
                max_end = 0;
                s = s + 1;
            }
        }
        System.out.println("The array start and end " + start + " " + end);
    }

    public static void main(String[] args) {
        int[] a = {-2,1,-3,4,-1,2,1,-5,4};
        // System.out.println("Maximum contiguous sum is " + findMaxSubArray(a));
        System.out.println(findMaxSubArray(a));
    }
}
