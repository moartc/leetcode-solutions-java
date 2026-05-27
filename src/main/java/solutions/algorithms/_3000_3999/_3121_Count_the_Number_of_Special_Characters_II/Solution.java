package solutions.algorithms._3000_3999._3121_Count_the_Number_of_Special_Characters_II;

class Solution {
    public int numberOfSpecialChars(String word) {

        /*
        for each char
        1. track if  was lower
        2. track if  was upper
        3. mark when cannot be special <- lower appears after upper or upper before lower
        4. at the end, if not marked as "cannot be special", check if there was lower and upper
         */
        boolean[] wasLower = new boolean[26];
        boolean[] wasUpper = new boolean[26];
        boolean[] cannotBeSpecial = new boolean[26];
        for (char c : word.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                int index = c - 'a';
                if (wasUpper[index]) {
                    cannotBeSpecial[index] = true;
                } else {
                    wasLower[index] = true;
                }
            } else {
                int index = c - 'A';
                if (!wasLower[index]) {
                    cannotBeSpecial[index] = true;
                } else {
                    wasUpper[index] = true;
                }
            }
        }
        int counter = 0;
        for (int i = 0; i < 26; i++) {
            if (!cannotBeSpecial[i] && wasLower[i] && wasUpper[i]) {
                counter++;
            }
        }
        return counter;
    }
}