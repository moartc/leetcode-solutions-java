package solutions.algorithms._3000_3999._3518_Smallest_Palindromic_Rearrangement_II;


/*
    a b c
    a c b
    b a c
    b c a
    c a b
    c b a
 */
class Solution {

    public String smallestPalindrome(String s, int k) {
        int[] charCtr = new int[26];
        for (char c : s.toCharArray()) {
            int cIdx = c - 'a';
            charCtr[cIdx]++;
        }
        char lastChar = '0';
        for (int i = 0; i < charCtr.length; i++) {
            if (charCtr[i] == 0) {
                continue;
            }
            char c = (char) ('a' + i);
            if (charCtr[i] % 2 == 1) { // this has to be in the middle
                lastChar = c;
                charCtr[i]--;
            }
        }

        int[] charToSet = new int[26];
        int toFill = 0;
        for (int i = 0; i < charCtr.length; i++) {
            charToSet[i] = charCtr[i] / 2;
            toFill += charToSet[i];
        }

        StringBuilder sb = new StringBuilder();
        sb = buildTheFirstPath(charToSet, k, sb, toFill);
        String firstPart = sb.toString();
        String secondPart = sb.reverse().toString();
        if (s.length() / 2 != firstPart.length()) {
            return "";
        }
        if (lastChar != '0') {
            return firstPart + lastChar + secondPart;
        } else {
            return firstPart + secondPart;
        }
    }

    StringBuilder buildTheFirstPath(int[] charToSet, int k, StringBuilder sb, int toFill) {

        if (toFill == 0) {
            return sb;
        }
        sb = getPermutation(toFill, k, charToSet);
        return sb;
    }


    public StringBuilder getPermutation(int n, int k, int[] charToSet) {
        StringBuilder sb = new StringBuilder();
        k--;
        o:
        for (int pos = 0; pos < n; pos++) {
            for (int i = 0; i < 26; i++) {
                if (charToSet[i] == 0) {
                    continue;
                }
                charToSet[i]--;
                int repsPerCol = (int) calcPossibleOrders(charToSet);
                if (k < repsPerCol) {
                    sb.append((char) ('a' + i));
                    continue o;
                } else {
                    charToSet[i]++;
                    k -= repsPerCol;
                }
            }
        }
        return sb;
    }

    long calcPossibleOrders(int[] charToSet) {
        int n = totSum(charToSet);
        long result = 1;
        for (int i : charToSet) {
            if (i > 0) {
                result *= binomial(n, i);
            }
            if (result > 1_000_000) {
                return 1_000_000;
            }
            n -= i;
        }
        return result;
    }

    long binomial(int n, int r) {
        r = Math.min(r, n - r);
        long res = 1;
        for (int i = 0; i < r; i++) {
            res = res * (n - i) / (i + 1);
            if (res > 1_000_000) {
                return 1_000_000;
            }
        }
        return res;
    }

    int totSum(int[] charToSet) {
        int tot = 0;
        for (int i : charToSet) {
            tot += i;
        }
        return tot;
    }
}