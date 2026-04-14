package solutions.algorithms._1000_1999._1513_Numberof_Substrings_With_Only_1s;

class Solution {
    public int numSub(String s) {

        long total = 0;
        long ctr = 0;
        long div = (int) (Math.pow(10, 9) + 7);
        for (char c : s.toCharArray()) {
            if (c == '0') {
                long current = ctr * (ctr + 1) / 2;
                total += current;
                ctr = 0;
            } else {
                ctr++;
            }
        }
        long current = ctr * ((ctr + 1)) / 2;
        total += current;
        return (int) (total % div);
    }
}