package solutions.algorithms._0_999._777_Swap_Adjacent_in_LR_String;

import java.util.ArrayList;
import java.util.List;

class Solution {
    /*
    XL -> LX
    RX -> XR

    I can move L back (if there are only Xs) as much as I want
    I can iterate to the first 'L' in result and find the first 'L' in start, then go forward
    Similar case with RX but here, I can move R to the right
    I could iterate it twice: the first time left to right for L, and then right to left for R

    additional check:
    I cannot have R L in the start list and L R in the result list. If there is such a case - return false
    todo refactoring
     */
    public boolean canTransform(String start, String result) {

        if (start.length() != result.length()) {
            return false;
        }

        List<Boolean> l1 = new ArrayList<>();
        List<Boolean> l2 = new ArrayList<>();
        for (int i = 0; i < start.length(); i++) {
            if (start.charAt(i) == 'L') {
                l1.add(true);
            } else if (start.charAt(i) == 'R') {
                l1.add(false);
            }
            if (result.charAt(i) == 'L') {
                l2.add(true);
            } else if (result.charAt(i) == 'R') {
                l2.add(false);
            }
        }
        if (l1.size() != l2.size()) {
            return false;
        }
        for (int i = 0; i < l1.size(); i++) {
            if (l1.get(i) != l2.get(i)) {
                return false;
            }
        }

        int i1 = 0;
        int i2 = 0;

        int foundL1 = -1;
        int foundL2 = -1;
        while (i1 < start.length() && i2 < result.length()) {
            char c1 = start.charAt(i1);
            char c2 = result.charAt(i2);

            if (c1 == 'L') {
                foundL1 = i1;
            } else {
                i1++;
            }
            if (c2 == 'L') {
                foundL2 = i2;
            } else {
                i2++;
            }
            if (foundL1 != -1 && foundL2 != -1) {
                if (foundL1 < foundL2) {
                    return false;
                } else {
                    foundL1 = -1;
                    foundL2 = -1;
                    i1++;
                    i2++;
                }
            }
        }
        if (foundL1 != -1 || foundL2 != -1) {
            return false;
        }

        i1 = start.length() - 1;
        i2 = result.length() - 1;
        int foundR1 = -1;
        int foundR2 = -1;
        while (i1 >= 0 && i2 >= 0) {
            char c1 = start.charAt(i1);
            char c2 = result.charAt(i2);

            if (c1 == 'R') {
                foundR1 = i1;
            } else {
                i1--;
            }
            if (c2 == 'R') {
                foundR2 = i2;
            } else {
                i2--;
            }
            if (foundR1 != -1 && foundR2 != -1) {
                if (foundR1 > foundR2) {
                    return false;
                } else {
                    foundR1 = -1;
                    foundR2 = -1;
                    i1--;
                    i2--;
                }
            }
        }
        return foundR1 == -1 && foundR2 == -1;
    }

}

