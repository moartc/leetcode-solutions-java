package solutions.algorithms._0_999._125_Valid_Palindrome;

class Solution {
    private static boolean isAlphaNumeric(char c) {
        // 97 - 122 - lower case
        // 65 - 90 - upper case
        // 48 - 57 - numbers
        return (c >= 97 && c <= 122) || (c >= 65 && c <= 90) || (c >= 48 && c <= 57);
    }

    private static char toLower(char c) {
        if (c >= 97 && c <= 122) {
            return c;
        } else if (c >= 65 && c <= 90) {
            return (char) (c + 32);
        } else {
            return c;
        }
    }

    public boolean isPalindrome(String s) {

        char[] charArray = s.toCharArray();

        int first = 0;
        int second = charArray.length - 1;

        while (first < second) {
            char c1 = charArray[first];
            char c2 = charArray[second];

            if (!isAlphaNumeric(c1)) {
                first++;
                continue;
            }

            if (!isAlphaNumeric(c2)) {
                second--;
                continue;
            }

            char c1Lc = toLower(c1);
            char c2Lc = toLower(c2);
            if (c1Lc != c2Lc) {
                return false;
            }
            first++;
            second--;

        }
        return true;
    }

}