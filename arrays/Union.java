package guru.springframework.spring5webapp.arrays;

import java.util.ArrayList;
import java.util.HashSet;

public class Union {
    public static ArrayList<Integer> findUnion(int array1[], int array2[]) {
        HashSet<Integer> union = new HashSet<>();

        for (int i : array1) {
            union.add(i);
        }
        for (int i : array2) {
            union.add(i);
        }
        return new ArrayList<>(union);
    }
    public static ArrayList<Integer> findIntersection(int[] array1, int[] array2){
        HashSet<Integer> intersection = new HashSet<>();
        for(int i : array1){
            intersection.add(i);
        }
        ArrayList<Integer> result = new ArrayList<>();
        for(int i : array2){
            if(intersection.contains(i)){
                result.add(i);
                intersection.remove(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 2, 3};
        int[] arr2 = {2, 3, 3, 4, 5, 5};
        ArrayList<Integer> union = findUnion(arr1, arr2);
        ArrayList<Integer> intersection = findIntersection(arr1, arr2);
        for (int i : union) {
            System.out.println(i + " ");
        }
        System.out.println("------------------");
        for (int i : intersection) {
            System.out.println(i + " ");
        }
    }
}
