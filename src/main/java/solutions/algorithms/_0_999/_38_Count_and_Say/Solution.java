package solutions.algorithms._0_999._38_Count_and_Say;

class Solution {
    public String countAndSay(int n) {

        StringBuilder s = new StringBuilder("1");
        for (int i = 0; i < n - 1; i++) {
            StringBuilder next = new StringBuilder();
            int j = 1;
            int charCtr = 1;
            while (j < s.length()) {
                if (s.charAt(j - 1) == s.charAt(j)) {
                    j++;
                    charCtr++;
                } else {
                    next.append(charCtr);
                    next.append(s.charAt(j - 1));
                    charCtr = 1;
                    j++;
                }
            }
            next.append(charCtr);
            next.append(s.charAt(j - 1));
            s = next;
        }
        return s.toString();
    }
}