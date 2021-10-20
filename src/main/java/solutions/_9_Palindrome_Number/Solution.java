package solutions._9_Palindrome_Number;

class Solution {
    public boolean isPalindrome(int x) {
        String stringInt = String.valueOf(x);
        return new StringBuilder(stringInt).reverse().toString().equals(stringInt);
    }
}