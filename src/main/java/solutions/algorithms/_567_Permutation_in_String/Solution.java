package solutions.algorithms._567_Permutation_in_String;

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int length1 = s1.length();
        int length2 = s2.length();
        if (length1 > length2) {
            return false;
        }
        char[] array1 = s1.toCharArray();
        char[] array2 = s2.toCharArray();
        int[] frequencies = new int[26];
        for (char ch : array1) {
            frequencies[ch - 97]++;
        }
        int[] frequencies2 = new int[26];
        for (int i = 0; i < length1; i++) {
            frequencies2[array2[i] - 97]++;
        }
        if (arrEq(frequencies, frequencies2)) {
            return true;
        }
        for (int i = length1; i < length2; i++) {
            char key = array2[i - length1];
            frequencies2[key - 97]--;
            frequencies2[array2[i] - 97]++;
            if (arrEq(frequencies, frequencies2)) {
                return true;
            }
        }
        return false;
    }

    private boolean arrEq(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}