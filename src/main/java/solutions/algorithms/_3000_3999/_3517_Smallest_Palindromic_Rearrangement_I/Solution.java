package solutions.algorithms._3000_3999._3517_Smallest_Palindromic_Rearrangement_I;

class Solution {
    public String smallestPalindrome(String s) {

        int[] charCtr = new int[26];
        for (char c : s.toCharArray()) {
            int cIdx = c - 'a';
            charCtr[cIdx]++;
        }
        StringBuilder sb = new StringBuilder();

        char lastChar = '0';
        for (int i = 0; i < charCtr.length; i++) {
            if (charCtr[i] == 0) {
                continue;
            }
            char c = (char) ('a' + i);
            int occ;
            if (charCtr[i] % 2 == 1) { // this has to be in the middle
                lastChar = c;
                occ = (charCtr[i] - 1) / 2;
            } else {
                occ = (charCtr[i]) / 2;
            }
            for (int occCtr = 0; occCtr < occ; occCtr++) {
                sb.append(c);
            }
        }
        if (lastChar != '0') {
            sb.append(lastChar);
        }
        String firstPart = sb.toString();
        if (s.length() % 2 == 1) { // odd number of chars
            StringBuilder reversed = sb.reverse();
            String partToAppend = reversed.substring(1, reversed.length());
            return firstPart + partToAppend;
        } else { // even
            String secondPart = sb.reverse().toString();
            return firstPart + secondPart;
        }
    }
}