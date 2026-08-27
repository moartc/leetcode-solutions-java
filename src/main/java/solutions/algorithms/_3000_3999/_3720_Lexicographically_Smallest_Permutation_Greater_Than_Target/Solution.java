package solutions.algorithms._3000_3999._3720_Lexicographically_Smallest_Permutation_Greater_Than_Target;

class Solution {
    public String lexGreaterPermutation(String s, String target) {


        char[] targetArr = target.toCharArray();
        char[] sArray = s.toCharArray();

        int[] charCtr = new int[26];
        for (int i = 0; i < sArray.length; i++) {
            int idx = sArray[i] - 'a';
            charCtr[idx]++;
        }

        String res = build(0, charCtr, targetArr, new StringBuilder(), false);
        if (res == null) {
            return "";
        } else {
            return res;
        }

    }

    String build(int idx, int[] charCtr, char[] targetArr, StringBuilder sb, boolean wasGreater) {

        if (idx >= targetArr.length) {
            if (wasGreater) {
                return sb.toString();

            } else {
                return null;
            }
        }
        char currTarget = targetArr[idx];
        for (char c = wasGreater ? 'a' : currTarget; c <= 'z'; c++) {
            int cIdx = c - 'a';
            if (charCtr[cIdx] > 0) {
                charCtr[cIdx]--;
                sb.append(c);
                boolean setGreater = wasGreater || c > currTarget;
                String res = build(idx + 1, charCtr, targetArr, sb, setGreater);
                if (res != null) {
                    return res;
                } else {
                    // couldn't build, revert changes
                    sb.deleteCharAt(sb.length() - 1);
                    charCtr[cIdx]++;
                }
            }
        }
        return null;
    }
}