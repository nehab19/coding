package guru.springframework.spring5webapp.arrays;

public class MaxSubArrayProduct {
    static int maxSubArrayProduct(int[] array) {
        int result = array[0];
        for (int i = 0; i < array.length; i++) {
            int multiply = array[i];
            for (int j = i + 1; j < array.length; j++) {
                result = Math.max(result, multiply);
                multiply = multiply * array[j];
            }
            result = Math.max(result, multiply);

        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = {1, -2, -3, 0, 7, -2};
        System.out.println("Maximum Sub array product is " + maxSubArrayProduct(arr));
    }
}
