package solutions.algorithms._1143_Longest_Common_Subsequence;

class Solution {

    public int longestCommonSubsequence(String text1, String text2) {

        char[] t1 = text1.toCharArray();
        char[] t2 = text2.toCharArray();
        int[][] arr = new int[t1.length][t2.length];

        arr[0][0] = t1[0] == t2[0] ? 1 : 0;
        for (int i = 1; i < t2.length; i++) {
            arr[0][i] = arr[0][i - 1] > 0 ? arr[0][i - 1] : t1[0] == t2[i] ? 1 : 0;
        }
        for (int i = 1; i < t1.length; i++) {
            arr[i][0] = arr[i - 1][0] > 0 ? arr[i - 1][0] : t1[i] == t2[0] ? 1 : 0;
        }

        for (int i = 1; i < t1.length; i++) {
            for (int j = 1; j < t2.length; j++) {
                boolean eq = t1[i] == t2[j];
                if (eq && arr[i][j - 1] == arr[i - 1][j - 1]) {
                    arr[i][j] = arr[i][j - 1] + 1;
                } else {
                    arr[i][j] = Integer.max(arr[i][j - 1], arr[i - 1][j]);
                }
            }
        }
        return arr[t1.length - 1][t2.length - 1];
    }
}