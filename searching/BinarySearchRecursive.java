package guru.springframework.spring5webapp.searching;

public class BinarySearchRecursive {
    static int binarySearch(int nums[], int low, int high, int target){
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
               return binarySearch(nums,low,mid-1,target);
            } else {
                return binarySearch(nums,mid+1,high,target);
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {23, 56, 78, 90, 12};
        int target = 90;
        int search = binarySearch(nums,0,nums.length-1, target);
        if (search == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index " + search);
        }
    }
}
