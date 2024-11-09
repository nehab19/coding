package guru.springframework.spring5webapp.sorting;

public class BubbleSort {
    public static void bubbleSort(int[] array, int n) {
        int i, j, temp;
        for (i = 0; i < n - 1; i++) {
            for (j = 0; j < n - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};

        System.out.print("\nBefore Insertion: ");
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");

        // Function call
        bubbleSort(array, array.length);

        System.out.print("\nAfter Insertion: ");
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
    }

}
