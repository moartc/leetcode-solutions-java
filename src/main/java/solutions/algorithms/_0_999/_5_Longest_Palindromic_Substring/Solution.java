package solutions.algorithms._0_999._5_Longest_Palindromic_Substring;


class Solution {

    /*
    I can go outside
    1. starting from a single character
    2. starting from 2 the same character
    */

    public String longestPalindrome(String s) {

        int maxSize = -1;
        String bestFound = "";
        char[] charArray = s.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            int answer = isPalindrome(i, i, s);
            if (answer != -1) {
                int finalSize1 = 1 + (2 * answer);
                if (finalSize1 > maxSize) {
                    maxSize = finalSize1;
                    bestFound = s.substring(i - answer, i + answer + 1);
                }
            }
            if (i < charArray.length - 1) {
                // second check for 2 chars
                int answer2 = isPalindrome(i, i + 1, s);
                if (answer2 != -1) {
                    int finalSize2 = 2 + (2 * answer2);
                    if (finalSize2 > maxSize) {
                        maxSize = finalSize2;
                        bestFound = s.substring(i - answer2, i + 1 + answer2 + 1);
                    }
                }
            }
        }
        return bestFound;
    }

    private int isPalindrome(int i, int j, String s) {

        int moves = -1;
        while (i >= 0 && j < s.length()) {
            if (i == j) {
                // I might start from the same char - do nothing
            }
            char sc = s.charAt(i);
            char ec = s.charAt(j);
            if (sc != ec) {
                return moves;
            }
            moves++;
            i--;
            j++;
        }
        return moves;
    }

}