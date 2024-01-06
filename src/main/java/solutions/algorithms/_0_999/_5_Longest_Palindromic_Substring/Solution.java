package solutions.algorithms._0_999._5_Longest_Palindromic_Substring;

class Solution {
    public String longestPalindrome(String s) {
        char[] chars = s.toCharArray();
        int longestFound = Integer.MIN_VALUE;
        int left = -1;
        for (int i = 0; i < chars.length; i++) {
            int[] longestFromIndex = findLongestFromIndex(i, chars);
            if (longestFromIndex[0] > longestFound) {
                longestFound = longestFromIndex[0];
                left = longestFromIndex[1];
            }
        }
        return s.substring(left, left + longestFound);
    }

    int[] findLongestFromIndex(int index, char[] chars) {
        int length = 1;
        int left = index;
        int right = index;

        // extend starting index with the same characters
        while (left > 0 || right < chars.length - 1) {
            if (left > 0 && chars[left - 1] == chars[index]) {
                left--;
                length++;
            } else if (right < chars.length - 1 && chars[right + 1] == chars[index]) {
                right++;
                length++;
            } else {
                break;
            }
        }
        while (left > 0 && right < chars.length - 1) {
            if (chars[right + 1] == chars[left - 1]) {
                length += 2;
                left--;
                right++;
            } else {
                return new int[]{length, left};
            }
        }
        return new int[]{length, left};
    }
}