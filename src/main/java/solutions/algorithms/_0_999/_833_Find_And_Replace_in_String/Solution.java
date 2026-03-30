package solutions.algorithms._0_999._833_Find_And_Replace_in_String;

import java.util.Arrays;

// todo refactor in the future
class Solution {
    public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {

        if (indices.length == 0) {
            return s;
        }
        int[][] sorted = new int[indices.length][2];
        for (int i = 0; i < sorted.length; i++) {
            sorted[i][0] = indices[i];
            sorted[i][1] = i;
        }
        Arrays.sort(sorted, (o1, o2) -> o1[0] - o2[0]);
        char[] cA = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        int arrIdx = 0;
        int currentIdx = sorted[0][0];
        int i = 0;

        while (i < cA.length) {
            if (arrIdx != -1 && i == currentIdx) {
                int originalIndex = sorted[arrIdx][1];
                String source = sources[originalIndex];
                if (s.startsWith(source, i)) {
                    String target = targets[originalIndex];
                    sb.append(target);
                    i += source.length();
                    if (arrIdx < sorted.length - 1) {
                        arrIdx++;
                        currentIdx = sorted[arrIdx][0];
                    } else {
                        arrIdx = -1;
                    }
                } else {
                    if (arrIdx < sorted.length - 1) {
                        arrIdx++;
                        currentIdx = sorted[arrIdx][0];
                        if (currentIdx == i) {
                            // the sam eidx, check again
                        } else {
                            sb.append(cA[i]);
                            i++;
                        }
                    } else {
                        arrIdx = -1;
                    }
                }
            } else {
                sb.append(cA[i]);
                i++;
            }
        }
        return sb.toString();
    }
}