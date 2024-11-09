package guru.springframework.spring5webapp.searching;

/** best case can be O(1) if found at first index else can lead to O(N) **/
/** Linear search algorithm is preferred when the list or array is unsorted, or when the size of the input is relatively small.**/
/**Linear search algorithm can be used in scenarios such as searching for a specific value in a phone book
searching for a name in an unsorted list of contacts, or finding an item in a grocery list **/

public class LinearSearch {
    public static int searchElement(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {2, 56, 78, 12, 90};
        int element = 3;
        int result = searchElement(array, element);
        if (result == -1) {
            System.out.println("Element not found in array");
        } else {
            System.out.println("Element searched at position : " + result);
        }
    }
}
