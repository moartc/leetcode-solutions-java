package solutions.algorithms._3000_3999._3713_Longest_Balanced_Substring_I;

class Solution {
    public int longestBalanced(String s) {
        char[] cArr = s.toCharArray();
        int longestFound = -1;
        for (int i = 0; i < cArr.length; i++) {
            int[] freq = new int[26];
            for (int j = i; j < cArr.length; j++) {
                char c = cArr[j];
                freq[(int) c - 'a']++;
                if (isBalanced(freq)) {
                    int size = j - i + 1;
                    longestFound = Math.max(longestFound, size);
                }
            }
        }
        return longestFound;
    }

    boolean isBalanced(int[] freq) {
        int firstNonZero = -1;
        for (int num : freq) {
            if (num != 0) {
                if (firstNonZero == -1) {
                    firstNonZero = num;
                } else {
                    if (firstNonZero != num) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

}