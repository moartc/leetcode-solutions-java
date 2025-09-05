package solutions.algorithms._0_999._647_Palindromic_Substrings;

class Solution {

    /*
    I can add all single characters and then count 2 cases
    1. starting with single char and 2 outside
    2. starting with 2 characters
     */
    public int countSubstrings(String s) {

        char[] charArray = s.toCharArray();

        int answer = 0;
        // for single characters
        answer += charArray.length;

        for (int i = 0; i < charArray.length - 1; i++) {
            if (i != 0) {
                // single char with 2 outside
                answer += isPalindrome(i - 1, i + 1, charArray);
                // 2 chars
            }
            answer += isPalindrome(i, i + 1, charArray);
        }
        return answer;
    }

    private int isPalindrome(int i, int j, char[] charArray) {
        int moves = 0;
        while (i >= 0 && j < charArray.length) {
            char sc = charArray[i];
            char ec = charArray[j];
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