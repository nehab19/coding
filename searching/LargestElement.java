package guru.springframework.spring5webapp.searching;

public class LargestElement {
    public static void getLargestThreeElements(int[] array, int arraySize) {
        int i, first, second, third;
        if (arraySize < 3) {
            System.out.println("Invalid input! Must atleast contain 3 elements");
            return;
        }
        first = second = third = Integer.MIN_VALUE;
        for (i = 0; i < arraySize; i++) {
            if (array[i] > first) {
                third = second;
                second = first;
                first = array[i];
            } else if (array[i] > second) {
                third = second;
                second = array[i];
            } else if(array[i] > third){
                third = array[i];
            }
        }
        System.out.println("The largest three elements are : " + first + " , " + second + " , " + third);
    }

    public static void main(String[] args) {
        int [] array={45,90,12,34,87,5,6,7};
        int length = array.length;
        getLargestThreeElements(array, length);
    }
}
