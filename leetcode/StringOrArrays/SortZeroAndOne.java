package guru.springframework.spring5webapp.leetcode.StringOrArrays;

public class SortZeroAndOne {
    public static void sortZeroesAndOnes(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[left] == 0) {
                left++;
            } else if (arr[right] == 1) {
                right--;
            } else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }

        }

    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0, 1, 0, 1, 0};
        sortZeroesAndOnes(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
