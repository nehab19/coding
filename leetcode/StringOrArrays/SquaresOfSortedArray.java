package guru.springframework.spring5webapp.leetcode.StringOrArrays;

import java.util.Arrays;

public class SquaresOfSortedArray {
    public static int[] sortedSquaresApproach1(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
    public static int[] sortedSquaresApproach2(int[] nums) {
        int n=nums.length;
        int i=0,j=n-1,k=n-1;
        int [] result=new int[n];

        while(k>=0){
            int a=nums[i]*nums[i];
            int b=nums[j]*nums[j];

            if(a>b){
                result[k]=a;
                i++;
            }else{
                result[k]=b;
                j--;
            }
            k--;
        }
        return result;
    }

    public static void main(String[] args) {
        int [] result=new int[]{-4,-1,0,3,10};
        System.out.println(Arrays.toString(sortedSquaresApproach1(result)));
        //System.out.println(Arrays.toString(sortedSquaresApproach2(result)));
    }

}
