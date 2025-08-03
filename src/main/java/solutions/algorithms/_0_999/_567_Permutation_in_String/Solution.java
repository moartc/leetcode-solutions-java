package solutions.algorithms._0_999._567_Permutation_in_String;

class Solution {
    public boolean checkInclusion(String s1, String s2) {

        char[] s1Array = s1.toCharArray();
        char[] s2Array = s2.toCharArray();

        if (s1Array.length > s2Array.length) {
            return false;
        }

        int[] s1Map = new int[26];
        int[] s2Map = new int[26];

        for (char c : s1Array) {
            int idx = c - 'a';
            s1Map[idx]++;
        }

        // add initial chars to s2Map
        for (int i = 0; i < s1Array.length; i++) {
            int cI = s2Array[i] - 'a';
            s2Map[cI]++;
        }

        // move window
        int i = 0;
        while (i + s1Array.length < s2Array.length) {

            if (areArrEquals(s1Map, s2Map)) {
                return true;
            }
            // move window
            // decrease first char
            int c1Idx = s2Array[i] - 'a';
            s2Map[c1Idx]--;

            // add last char
            int c2Idx = s2Array[i + s1Array.length] - 'a';
            s2Map[c2Idx]++;
            i++;
        }
        // last check
        if (areArrEquals(s1Map, s2Map)) {
            return true;
        }
        return false;
    }

    private boolean areArrEquals(int[] f, int[] s) {

        for (int i = 0; i < 26; i++) {
            if (f[i] != s[i]) {
                return false;
            }
        }
        return true;
    }

}