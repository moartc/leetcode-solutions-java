package solutions.algorithms._1143_Longest_Common_Subsequence;

class Solution {

    public int longestCommonSubsequence(String text1, String text2) {

        char[] t1 = text1.toCharArray();
        char[] t2 = text2.toCharArray();
        int[][] arr = new int[t1.length][t2.length];
        for (int i = 0; i < t1.length; i++) {
            for (int j = 0; j < t2.length; j++) {
                boolean eq = t1[i] == t2[j];
                int toAssign = eq ? 1 : 0;
                if (i == 0 && j == 0) {
                    arr[i][j] = toAssign;
                } else if (i == 0) {
                    arr[i][j] = arr[i][j - 1] > 0 ? arr[i][j - 1] : toAssign;
                } else if (j == 0) {
                    arr[i][j] = arr[i - 1][j] > 0 ? arr[i - 1][j] : toAssign;
                } else {
                    if (eq && arr[i][j - 1] == arr[i - 1][j - 1]) {
                        arr[i][j] = arr[i][j - 1] + 1;
                    } else {
                        arr[i][j] = Integer.max(arr[i][j - 1], arr[i - 1][j]);
                    }
                }
            }
        }
        return arr[t1.length - 1][t2.length - 1];
    }
}