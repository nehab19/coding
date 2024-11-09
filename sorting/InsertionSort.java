package guru.springframework.spring5webapp.sorting;

public class InsertionSort {
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j > 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 50, 80, 40, 12};
        System.out.print("\nBefore Insertion: ");
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");

        // Function call
        insertionSort(array);

        System.out.print("\nAfter Insertion: ");
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
    }
}
