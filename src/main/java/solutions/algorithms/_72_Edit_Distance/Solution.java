package solutions.algorithms._72_Edit_Distance;

class Solution {

    public int minDistance(String word1, String word2) {

        if (word1.length() == 0) {
            return word2.length();
        }
        if (word2.length() == 0) {
            return word1.length();
        }
        char[] t1 = word1.toCharArray();
        char[] t2 = word2.toCharArray();
        int[][] arr = new int[t1.length][t2.length];

        arr[0][0] = t1[0] == t2[0] ? 0 : 1;
        boolean used = false;
        int toAdd;
        for (int i = 1; i < t1.length; i++) {
            if (!used && t1[i] == t2[0]) {
                toAdd = 0;
                used = true;
            } else {
                toAdd = 1;
            }
            arr[i][0] = arr[i - 1][0] + toAdd;
        }
        used = false;
        for (int i = 1; i < t2.length; i++) {
            if (!used && t2[i] == t1[0]) {
                toAdd = 0;
                used = true;
            } else {
                toAdd = 1;
            }
            arr[0][i] = arr[0][i - 1] + toAdd;
        }

        for (int i = 1; i < t1.length; i++) {
            used = false;
            for (int j = 1; j < t2.length; j++) {
                int min1 = Math.min(arr[i][j - 1], arr[i - 1][j]);
                int min = Math.min(min1, arr[i - 1][j - 1]);

                if (t1[i] == t2[j]) {
                    arr[i][j] = arr[i - 1][j - 1];
                } else {
                    if (!used && t1[i] == t2[j]) {
                        toAdd = 0;
                        used = true;
                    } else {
                        toAdd = 1;
                    }
                    arr[i][j] = min + toAdd;
                }
            }
        }
        return arr[t1.length - 1][t2.length - 1];
    }
}