package solutions.algorithms._5_Longest_Palindromic_Substring;

class Solution {
    public String longestPalindrome(String s) {
        char[] chars = s.toCharArray();
        for (int l = chars.length; l > 1; l--) {
            for (int i = 0; i <= chars.length - l; i++) {
                if (isPalindrome(i, i + l - 1, chars)) {
                    return s.substring(i, i + l);
                }
            }
        }
        return s.substring(0, 1);
    }

    boolean isPalindrome(int start, int end, char[] chars) {
        while (start < end) {
            if (chars[start] != chars[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
