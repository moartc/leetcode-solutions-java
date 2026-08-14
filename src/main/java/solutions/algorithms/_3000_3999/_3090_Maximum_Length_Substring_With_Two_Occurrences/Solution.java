package solutions.algorithms._3000_3999._3090_Maximum_Length_Substring_With_Two_Occurrences;

class Solution {
    public int maximumLengthSubstring(String s) {

        int[] freq = new int[26];
        int i = 0;
        int j = -1;
        char[] cArr = s.toCharArray();
        int maxLength = 0;
        while (j + 1 < cArr.length) {
            j++;
            char c = cArr[j];
            freq[c - 'a']++;
            int currCtr = freq[c - 'a'];
            if (currCtr == 3) {
                // cannot add more
                while (true) {
                    char charToDelete = cArr[i];
                    freq[charToDelete - 'a']--;
                    i++;
                    if (charToDelete == c) {
                        break;
                    }
                }
            } else {
                int length = j - i + 1;
                maxLength = Math.max(length, maxLength);
            }
        }
        return maxLength;
    }
}