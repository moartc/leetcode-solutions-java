package solutions.algorithms._0_999._9_Palindrome_Number;

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int tempNum = x;
        long reverse = 0;
        while (tempNum > 0) {
            reverse = reverse * 10 + tempNum % 10;
            tempNum = tempNum / 10;
        }
        return x == reverse;
    }
}