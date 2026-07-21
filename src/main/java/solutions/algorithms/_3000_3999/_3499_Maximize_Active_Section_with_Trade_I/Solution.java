package solutions.algorithms._3000_3999._3499_Maximize_Active_Section_with_Trade_I;

import java.util.ArrayList;
import java.util.List;

class Solution {

    // after reading hint 1 - split into segments
    public int maxActiveSectionsAfterTrade(String s) {

        char[] charArray = s.toCharArray();
        boolean startWith0 = charArray[0] == '0';
        List<Integer> lengthOfSegment = new ArrayList<>();

        int total1s = -0;
        int ctr = 0;
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (c == '1') {
                total1s++;
            }
            if (ctr != 0 && c != charArray[i - 1]) {
                lengthOfSegment.add(ctr);
                ctr = 0;
            }
            ctr++;
        }
        lengthOfSegment.add(ctr);

        if (lengthOfSegment.size() <= 2) {
            return total1s;
        }

        // if it starts with '0' I can start with length at index 1, otherwise 2
        int currentIdx = startWith0 ? 1 : 2;
        int maxFound = total1s;

        while (currentIdx < lengthOfSegment.size() - 1) {
            int leftZero = currentIdx - 1 >= 0 ? lengthOfSegment.get(currentIdx - 1) : 0;
            int rightZero = currentIdx + 1 < lengthOfSegment.size() ? lengthOfSegment.get(currentIdx + 1) : 0;
            int max = leftZero + total1s + rightZero;
            maxFound = Math.max(max, maxFound);
            currentIdx += 2;
        }
        return maxFound;
    }
}