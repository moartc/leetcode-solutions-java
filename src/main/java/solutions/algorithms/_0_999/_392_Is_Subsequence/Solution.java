package solutions.algorithms._0_999._392_Is_Subsequence;

class Solution {
    public boolean isSubsequence(String s, String t) {

        int i = 0;
        int j = 0;
        char[] arr1  = s.toCharArray();
        char[] arr2  = t.toCharArray();
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                i++;
            }
            j++;
        }
        return i == s.length();
    }
}