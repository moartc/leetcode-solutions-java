package solutions.algorithms._2000_2999._2126_Destroying_Asteroids;

import java.util.Arrays;

class Solution {

    /*
    seems like it makes sense to sort it and then simply iterate
    update: use long instead of int
     */
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {

        Arrays.sort(asteroids);

        long currentMass = mass;
        for (int asteroid : asteroids) {
            if (asteroid > currentMass) {
                return false;
            } else {
                currentMass += asteroid;
            }
        }
        return true;
    }
}