package guru.springframework.spring5webapp.arrays;

import java.util.HashSet;

public class FindLongestSubSequence {
    static int findLongestConseqSubseq(int arr[], int n) {
        HashSet<Integer> result = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            result.add(arr[i]);
        }
        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            // if current element is the starting
            // element of a sequence
            if (!result.contains(arr[i] - 1)) {
                int j = arr[i];
                while (result.contains(j)) {
                    j++;
                }
                if (answer < j - arr[i]) {
                    answer = j - arr[i];
                }
            }
        }
        return answer;
    }

    // Driver Code
    public static void main(String args[]) {
        int arr[] = {1, 9, 3, 10, 4, 20, 2};
        int n = arr.length;
        System.out.println(
                "Length of the Longest consecutive subsequence is "
                        + findLongestConseqSubseq(arr, n));
    }
}
