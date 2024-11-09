package guru.springframework.spring5webapp.searching;

/**
 * Binary Search Algorithm is a searching algorithm used in a sorted array by repeatedly dividing the search interval
 * in half. The idea of binary search is to use the information that the array is sorted and reduce the
 * time complexity to O(log N).
 **/
/**Best Case: O(1)
 Average Case: O(log N)
 Worst Case: O(log N)**/

public class BinarySearch {
    static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {23, 56, 78, 90, 12};
        int target = 90;
        int search = search(nums, target);
        if (search == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index " + search);
        }
    }
}
