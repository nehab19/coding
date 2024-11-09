package guru.springframework.spring5webapp.sorting;

public class BinaryDeletion {

    public static int binarySearch(int[] arr, int low, int high, int key) {
        if (high < low) {
            return -1;
        }
        int mid = (low + high) / 2;
        if(arr[mid]==key){
            return mid;
        }
        if (key > arr[mid]) {
            return binarySearch(arr, mid + 1, high, key);
        } else {
            return binarySearch(arr, low, mid-1, key);
        }
    }

    public static int delete(int[] arr, int size, int key) {
        int position = binarySearch(arr, 0, size - 1, key);
        if (position == -1) {
            System.out.println("Element not found");
            return size;
        } else {
            for (int i = position; i < size - 1; i++) {
                arr[i] = arr[i + 1];
            }
            return size - 1;
        }
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        int size = array.length;
        int key = 40;
        size = delete(array, size, key);
        for (int i = 0; i < size; i++) {
            System.out.println(array[i] + " ");
        }
    }
}
