package guru.springframework.spring5webapp.questions;

import java.util.Arrays;
import java.util.Optional;

public class HighestAltitude {
    public int largestAltitude(int[] gain) {
        int highestAltitude = 0;
        int altitude = 0;

        for (int i = 0; i < gain.length; i++) {
            altitude += gain[i];

            if (altitude > highestAltitude)
                highestAltitude = altitude;
        }

        return highestAltitude;
    }

    public static void main(String[] args) {
        HighestAltitude highestAltitude=new HighestAltitude();
        System.out.println(highestAltitude.largestAltitude(new int[]{-5,1,5,0,-7}));
    }
}
