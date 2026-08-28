package solutions.algorithms._3000_3999._3734_Lexicographically_Smallest_Palindromic_Permutation_Greater_Than_Target;

class Solution {

    /*
    I'm reusing code from the 3720 problem
     */
    public String lexPalindromicPermutation(String s, String target) {

        char[] targetArr = target.toCharArray();
        char[] sArray = s.toCharArray();

        int[] charCtr = new int[26];
        for (int i = 0; i < sArray.length; i++) {
            int idx = sArray[i] - 'a';
            charCtr[idx]++;
        }

        if (!permutationExists(charCtr, s.length() % 2 == 0)) {
            return "";
        }

        boolean isOdd = s.length() % 2 == 1;
        char midChar = 0;
        for (int i = 0; i < charCtr.length; i++) {
            if (isOdd && charCtr[i] % 2 == 1) {
                midChar = (char) ('a' + i);
            }
            charCtr[i] /= 2;
        }

        String res = build(0, charCtr, targetArr, new StringBuilder(), false, midChar);
        if (res == null) {
            return "";
        } else {
            return res;
        }


    }

    String build(int idx, int[] charCtr, char[] targetArr, StringBuilder sb, boolean wasGreater, char oddChar) {

        if (idx >= targetArr.length / 2) {
            if (wasGreater || isCorrect(sb, targetArr, oddChar)) {
                return sb.toString() + (oddChar != 0 ? oddChar : "") + sb.reverse();
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
                String res = build(idx + 1, charCtr, targetArr, sb, setGreater, oddChar);
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

    boolean isCorrect(StringBuilder sb, char[] targetArr, char oddChar) {

        int midTarget = targetArr.length / 2;
        if (oddChar != 0) {
            if (oddChar < targetArr[midTarget]) {
                return false;
            } else if (oddChar > targetArr[midTarget]) {
                return true;
            }
        }
        for (int i = sb.length() - 1; i >= 0; i--) {
            int f = sb.charAt(i);
            int toAdd = sb.length() - 1 - i;
            int l = targetArr[targetArr.length / 2 + (oddChar == 0 ? 0 : 1) + toAdd];
            if (f < l) {
                return false;
            } else if (f > l) {
                return true;
            }
        }
        return false;
    }

    boolean permutationExists(int[] charCtr, boolean evenLength) {
        if (evenLength) {
            for (int ctr : charCtr) {
                if (ctr % 2 == 1) {
                    return false;
                }
            }
        } else {
            int oddCtr = 0;
            for (int ctr : charCtr) {
                if (ctr % 2 == 1) {
                    oddCtr++;
                }
                if (oddCtr > 1) {
                    return false;
                }
            }
        }
        return true;
    }
}