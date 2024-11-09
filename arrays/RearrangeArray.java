package guru.springframework.spring5webapp.arrays;

import java.util.Arrays;

public class RearrangeArray {
    public static void rearrangeArray(int[] arr) {
        int n = arr.length - 1;
        int i = -1;
        int temp = 0;
        for (int j = 0; j <= n; j++) {
            if (arr[j] < 0) {
                i++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int negative = 0;
        int positive = i + 1;
        while (positive <=n && negative < positive && arr[negative] < 0) {
            temp = arr[negative];
            arr[negative] = arr[positive];
            arr[positive] = temp;
            positive++;
            negative = negative + 2;

        }

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -4, -1,4};

        System.out.println("Original Array: " + Arrays.toString(arr));

        rearrangeArray(arr);

        System.out.println("Rearranged Array: " + Arrays.toString(arr));
    }

}
