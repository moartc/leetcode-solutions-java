package solutions.algorithms._0_999._680_Valid_Palindrome_II;

class Solution {
    /*
    I start from the beginning and the end
    I move toward the middle and check if the characters are equal - if they are, I move both pointers
    otherwise, I check if moving the left one makes the characters equal -> if so, I continue
    if not, I try moving the right one -> if that makes them equal, I continue
    otherwise -> return false
    I also keep track of whether I've skipped a character
     */
    public boolean validPalindrome(String s) {

        char[] charArray = s.toCharArray();
        int i = 0;
        int j = charArray.length - 1;
        boolean skipped = false;
        boolean canRepeat = true;
        int skipIndexI = -1;
        int skipIndexJ = -1;
        while (i < j) {
            char a = charArray[i];
            char b = charArray[j];
            if (a == b) {
                i++;
                j--;
            } else if (!skipped && charArray[i + 1] == b) {
                skipIndexI = i;
                skipIndexJ = j;
                i++;
                skipped = true;
            } else if (!skipped) {
                if (charArray[j - 1] == charArray[i]) {
                    j--;
                } else {
                    return false;
                }
                skipped = true;
                canRepeat = false;
            } else if (canRepeat) {
                // I can try to skip the 2nd character
                i = skipIndexI;
                j = skipIndexJ;
                if (charArray[j - 1] == charArray[i]) {
                    j--;
                } else {
                    return false;
                }
                canRepeat = false;
            } else {
                return false;
            }
        }
        return true;
    }
}