package solutions.algorithms._0_999._409_Longest_Palindrome;


class Solution {

    /*
    and all with even ctr + all odd -1
    if there was any odd, add 1
     */
    public int longestPalindrome(String s) {

        int[] ctr = new int[52];
        for (char c : s.toCharArray()) {
            if (c > 'Z') {
                ctr[c - 'a']++;
            } else {
                ctr[26 + c - 'A']++;
            }
        }

        boolean wasOdd = false;
        int answer = 0;
        for (int c : ctr) {
            if (c % 2 == 0) {
                answer += c;
            } else {
                answer += (c - 1);
                wasOdd = true;
            }
        }
        return answer + (wasOdd ? 1 : 0);
    }
}