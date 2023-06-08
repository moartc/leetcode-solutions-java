package solutions.algorithms._389_Find_the_Difference;

import java.util.Arrays;

class Solution {
    public char findTheDifference(String s, String t) {
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);
        for(int i = 0; i < s.length(); i++) {
            if(sArray[i] != tArray[i]) {
                return tArray[i];
            }
        }
        return tArray[tArray.length-1];
    }
}