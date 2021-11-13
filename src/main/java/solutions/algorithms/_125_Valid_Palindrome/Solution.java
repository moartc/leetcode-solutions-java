package solutions.algorithms._125_Valid_Palindrome;

class Solution {
    public boolean isPalindrome(String s) {

        int begin = 0;
        int end = s.length() - 1;
        while (begin < end) {
            while (getChar(s.charAt(begin)) == 0 && begin < end) {
                begin++;
            }
            while (getChar(s.charAt(end)) == 0 && begin < end) {
                end--;
            }
            if (getChar(s.charAt(begin)) != getChar(s.charAt(end))) {
                return false;
            }
            begin++;
            end--;
        }
        return true;
    }

    public char getChar(char c) {
        if (c >= 65 && c <= 90) {
            return ((char) (c + 32));
        } else if ((c >= 97 && c <= 122) || (c >= 48 && c <= 57)) {
            return c;
        } else {
            return 0;
        }
    }
}