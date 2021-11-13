package solutions.algorithms._58_Length_of_Last_Word;

class Solution {
    public int lengthOfLastWord(String s) {
        char[] charArray = s.toCharArray();
        int counter = 0;
        for (int i = charArray.length - 1; i >= 0; i--) {
            if (charArray[i] != 32) {
                while (i >= 0 && charArray[i] != 32) {
                    i--;
                    counter++;
                }
                return counter;
            }
        }
        return counter;
    }
}