package solutions.algorithms._0_999._868_Binary_Gap;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int binaryGap(int n) {

        List<Integer> bits = new ArrayList<>();
        while (n != 0) {
            bits.add(n % 2);
            n /= 2;
        }

        if (bits.size() < 2) {
            return 0;
        }

        int f = 0;
        int s = 1;
        int maxFound = 0;
        while (s < bits.size()) {
            if (f >= s) {
                s++;
                continue;
            }
            if (bits.get(f) == 0) {
                f++;
                continue;
            }
            if (bits.get(s) == 0) {
                s++;
                continue;
            }
            int diff = s - f;
            maxFound = Math.max(maxFound, diff);
            f = s;
            s = s + 1;
        }
        return maxFound;
    }
}