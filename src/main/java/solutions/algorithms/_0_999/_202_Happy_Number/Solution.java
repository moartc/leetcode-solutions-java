package solutions.algorithms._0_999._202_Happy_Number;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean isHappy(int n) {

        Set<Integer> results = new HashSet<>();
        int counterOfRepeats = 0;
        int newN = n;
        while (true) {
            int newNumber = 0;
            while (newN != 0) {
                int t = newN % 10;
                newN = newN / 10;
                newNumber += t * t;
            }
            newN = newNumber;

            if (newN == 1) {
                return true;
            } else {
                if (results.contains(newN)) {
                    // counter of consecutive repeats
                    counterOfRepeats++;
                    if (counterOfRepeats > 1) {
                        return false;
                    }
                } else {
                    results.add(newN);
                    counterOfRepeats = 0;
                }
            }
        }
    }
}