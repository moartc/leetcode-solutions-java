package solutions.algorithms._1000_1999._1461_Check_If_a_String_Contains_All_Binary_Codes_of_Size_K;

import java.util.HashSet;
import java.util.Set;

class Solution {

    /*
    I can iterate through s with a window of size k and store all possible binary substrings as integers in a set
    then in the range 0...2(^k)-1 check if any value is missing

    value generation: when I move the window backwards at each step I subtract 0 or 1 (the last bit), then divide the remaining
    value by 2 (bits move right) and I add the next bit as 2^(k-1)
     */
    public boolean hasAllCodes(String s, int k) {

        if (s.length() < k) {
            return false;
        }
        char[] charArray = s.toCharArray();
        int n = charArray.length;
        Set<Integer> allFound = new HashSet<>();
        int multiply = 1;
        int initValue = 0;
        for (int i = 0; i < k; i++) {
            char c = charArray[n - 1 - i];
            initValue += ((c - '0') * multiply);
            multiply *= 2;
        }
        allFound.add(initValue);

        int current = initValue;
        for (int i = charArray.length - k - 1; i >= 0; i--) {
            int behind = charArray[i + k] - '0';
            int newDecreased = current - behind;
            int newDivided = newDecreased / 2;
            int nextBit = charArray[i] - '0';
            int newOnTheLeft = nextBit * (1 << k - 1);
            int newValue = newOnTheLeft + newDivided;
            allFound.add(newValue);
            current = newValue;
        }

        for (int i = 0; i <= (1 << k) - 1; i++) {
            if (!allFound.contains(i)) {
                return false;
            }
        }
        return true;
    }
}