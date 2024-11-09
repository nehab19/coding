package guru.springframework.spring5webapp.searching;

import java.util.HashMap;
import java.util.Map;

public class RepeatingAndMissing {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 6, 1, 4};
        Map<Integer, Boolean> map = new HashMap<>();
        for (int i : arr) {
            if (!map.containsKey(i)) {
                map.put(i, true);
            } else {
                System.out.println("Repeated element found" + i);
            }
        }
        for(int i=1;i<arr.length;i++) {
            if (!map.containsKey(i)) {
                System.out.println("Missing element found : " + i);
            }
        }

    }
}
