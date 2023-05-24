package solutions.algorithms._459_Repeated_Substring_Pattern;

class Solution {
    public boolean repeatedSubstringPattern(String s) {


        out:
        for (int offset = 1; offset <= s.length() / 2; offset++) {
            if (s.length() % offset != 0) {
                continue;
            }
            int fc = 0;
            int sc = offset;
            while (sc < s.length()) {
                if (s.charAt(fc) != s.charAt(sc)) {
                    continue out;
                } else {
                    sc++;
                    fc = (fc + 1) % offset;
                }
            }
            return true;
        }
        return false;
    }
}