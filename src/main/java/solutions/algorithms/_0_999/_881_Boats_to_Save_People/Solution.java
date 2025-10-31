package solutions.algorithms._0_999._881_Boats_to_Save_People;

import java.util.Arrays;

class Solution {
    /*
    I think I can sort those values and then go from the beginning and the end
    I start adding from the end if there is still some space, I try to add a lighter one from the beginning
     */
    public int numRescueBoats(int[] people, int limit) {

        Arrays.parallelSort(people);
        int i = 0;
        int j = people.length - 1;
        int counter = 0;
        int currentlyLoaded = 0;
        while (i < j) {
            // always add the heaviest
            if (currentlyLoaded + people[j] <= limit) {
                currentlyLoaded += people[j];
                j--;
            }
            // then try the lighter one, because I can take 2
            if (currentlyLoaded + people[i] <= limit) {
                i++;
            }
            currentlyLoaded = 0;
            counter++;
        }

        if (i == j) {
            return counter + 1;
        } else {
            return counter;
        }
    }
}



