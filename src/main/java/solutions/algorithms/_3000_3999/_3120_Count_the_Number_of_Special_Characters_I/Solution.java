package solutions.algorithms._3000_3999._3120_Count_the_Number_of_Special_Characters_I;

class Solution {

    public int numberOfSpecialChars(String word) {

        boolean[] foundLower = new boolean[26];
        boolean[] foundUpper = new boolean[26];

        for (char c : word.toCharArray()) {
            int int0Base;
            if (c >= 'a' && c <= 'z') {
                int0Base = c - 'a';
                foundLower[int0Base] = true;
            } else {
                int0Base = c - 'A';
                foundUpper[int0Base] = true;
            }
        }

        int ctr = 0;
        for (int i = 0; i < 26; i++) {
            if (foundLower[i] && foundUpper[i]) {
                ctr++;
            }
        }
        return ctr;

    }
}