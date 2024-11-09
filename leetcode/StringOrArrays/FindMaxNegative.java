package guru.springframework.spring5webapp.leetcode.StringOrArrays;

import java.util.Arrays;
import java.util.HashSet;

public class FindMaxNegative {
    public static int findMaxKApproach1(int[] nums){
        int result=-1;

        for(int i=0;i<nums.length;i++){
            for(int j:nums){
                if(i==-j){
                    result=Math.max(result,Math.abs(nums[j]));
                }
            }
        }
        return result;
    }
    public static int findMaxKApproach2(int[] nums){
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        while(i<j){
            if(-nums[i]==nums[j]){
                return nums[j];
            }
            else if(-nums[i]<nums[j]){
                j--;
            }else{
                i++;
            }
        }
        return -1;
    }
    public static int findMaxKApproach3(int[] nums){
        HashSet<Integer> seen=new HashSet<>();
        int result =-1;
        for(int num : nums){
            if(seen.contains(-num)){
               result=Math.max(result,Math.abs(num));
            }
            seen.add(num);
        }
        return result;
    }
    public static int findMaxKApproach4(int[] nums){
        int result=-1;
        int [] array=new int[2001];
        for(int num :nums){
            if(array[-num+1000]==1){
                result=Math.max(result,Math.abs(num));
            }
            array[num+1000]=1;
        }
        return result;
    }
}
