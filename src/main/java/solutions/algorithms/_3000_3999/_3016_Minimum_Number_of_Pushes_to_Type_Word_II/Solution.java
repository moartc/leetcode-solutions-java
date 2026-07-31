package solutions.algorithms._3000_3999._3016_Minimum_Number_of_Pushes_to_Type_Word_II;

import java.util.Arrays;

class Solution {
    public int minimumPushes(String word) {

        char[] charArray = word.toCharArray();
        int[] freqMap = new int[26];
        for (int i = 0; i < charArray.length; i++) {
            int cIdx = charArray[i] - 'a';
            freqMap[cIdx]++;
        }

        Arrays.sort(freqMap);

        int sum = 0;
        int charCtr = 0;
        for (int i = freqMap.length - 1; i >= 0; i--) {
            int pressNumb = (charCtr / 8) + 1;
            sum += (pressNumb * freqMap[i]);
            charCtr++;
        }
        return sum;
    }
}