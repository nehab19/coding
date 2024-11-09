package guru.springframework.spring5webapp.arrays;

import java.util.ArrayList;

public class SubArraySum {
    static ArrayList<Integer> subarraySum(int[] arr, int n, long sum) {
        ArrayList<Integer> result = new ArrayList<>();
        boolean flag = false;

        for (int i = 0; i < n; i++) {
            int currentSum = arr[i];

            if (currentSum == sum) {
                result.add(i + 1);
                result.add(i + 1);
                flag = true;
                break;
            } else {
                for (int j = i + 1; j < n; j++) {
                    currentSum = currentSum + arr[j];
                    if (currentSum == sum) {
                        result.add(i + 1);
                        result.add(j + 1);
                        flag = true;
                        break;
                    }
                }
                if (flag) {
                    break;
                }
            }
        }
        if (flag) {
            return result;
        }
        result.add(-1);
        return result;

    }

    // Driver Code
    public static void main(String[] args) {
        int[] arr = {15, 2, 4, 8, 9, 5, 10, 23};
        int n = arr.length;
        long sum = 23;
        ArrayList<Integer> result = subarraySum(arr, n, sum);
        for (int i : result)
            System.out.print(i + " ");
    }
}
