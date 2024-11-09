package guru.springframework.spring5webapp.sorting;

public class SelectionSort {
    static void sort(int[] arr) {
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            int min_index = i;
            for (int j = i + 1; j < size; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 50, 80, 40, 12};
        System.out.print("\nBefore Insertion: ");
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");

        // Function call
        sort(array);

        System.out.print("\nAfter Insertion: ");
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
    }
}

