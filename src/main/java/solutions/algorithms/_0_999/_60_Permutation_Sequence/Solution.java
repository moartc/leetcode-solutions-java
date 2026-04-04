package solutions.algorithms._0_999._60_Permutation_Sequence;

import java.util.HashSet;
import java.util.Set;

class Solution {
    Set<Integer> usedChar;

    public String getPermutation(int n, int k) {
        StringBuilder sb = new StringBuilder();
        k--;
        usedChar = new HashSet<>();
        for (int i = 1; i <= n; i++) {
            int repsPerCol = factorial(n - i);
            int index = k / repsPerCol;
            int rem = k % repsPerCol;
            int charToSet = getFree(index, n);
            usedChar.add(charToSet);
            sb.append(charToSet);
            k = rem;
        }
        return sb.toString();
    }

    int getFree(int x, int n) {
        int idx = -1;
        for (int i = 1; i <= n; i++) {
            if (!usedChar.contains(i)) {
                idx++;
                if (idx == x) {
                    return i;
                }
            }
        }
        return -1;
    }

    int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

}