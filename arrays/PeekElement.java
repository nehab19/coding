package guru.springframework.spring5webapp.arrays;

public class PeekElement {
    static int findPeak(int arr[], int n) {
        if (n == 0) {
            return 0;
        }
        if (arr[0] >= arr[1]) {
            return 0;
        }
        if (arr[n - 1] >= arr[n - 2]) {
            return n - 1;
        }
        for (int i = 1; i < n; i++) {
            if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1]) {
                return i;
            }
        }
        return 0;
    }

    // Driver Code
    public static void main(String[] args) {
        int arr[] = {10, 20, 15, 32, 23};
        int n = arr.length;
        System.out.print("Index of a peak point is " + findPeak(arr, n));
    }
}
