package solutions.algorithms._583_Delete_Operation_for_Two_Strings;

class Solution {
    public int minDistance(String word1, String word2) {

        char[] t1 = word1.toCharArray();
        char[] t2 = word2.toCharArray();
        int t1l = t1.length;
        int t2l = t2.length;

        int[][] arr = new int[t1l][t2l];
        for (int i = 0; i < t1l; i++) {
            for (int j = 0; j < t2l; j++) {
                boolean eq = t1[i] == t2[j];
                if (i != 0 && j != 0) {
                    if (eq && arr[i][j - 1] == arr[i - 1][j - 1]) {
                        arr[i][j] = arr[i][j - 1] + 1;
                    } else {
                        arr[i][j] = Integer.max(arr[i][j - 1], arr[i - 1][j]);
                    }
                } else if (i == 0 && j == 0) {
                    arr[0][0] = eq ? 1 : 0;
                } else if (i == 0) {
                    arr[i][j] = arr[0][j - 1] > 0 ? arr[0][j - 1] : eq ? 1 : 0;
                } else {
                    arr[i][0] = arr[i - 1][0] > 0 ? arr[i - 1][0] : eq ? 1 : 0;
                }
            }
        }
        return t1l + t2l - 2 * arr[t1l - 1][t2l - 1];
    }
}