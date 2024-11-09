package guru.springframework.spring5webapp.sorting;

public class InsertElement {

    public static int insertionSort(int[] arr, int noOfElements, int key, int capacity) {
        if (noOfElements > capacity) {
            return noOfElements;
        }
        int i;
        for(i=noOfElements-1;(i>0 && arr[i]>key);i--){
            arr[i+1]=arr[i];
        }
        arr[i+1]= key;
        return noOfElements+1;
    }

    public static void main(String[] args) {
        int arr[] = new int[20];
        arr[0] = 12;
        arr[1] = 16;
        arr[2] = 20;
        arr[3] = 40;
        arr[4] = 50;
        arr[5] = 70;
        int capacity = arr.length;
        int n = 6;
        int key = 26;

        System.out.print("\nBefore Insertion: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

        // Function call
        n = insertionSort(arr, n, key, capacity);

        System.out.print("\nAfter Insertion: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
