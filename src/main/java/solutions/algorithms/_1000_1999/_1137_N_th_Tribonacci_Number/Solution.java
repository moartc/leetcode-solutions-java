package solutions.algorithms._1000_1999._1137_N_th_Tribonacci_Number;

class Solution {
    /*
    Like a normal Fibonacci - recursively with caching - beats 1.74%
    so, a loop version - beats 100%
    */
    public int tribonacci(int n) {

        int res = -1;
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 1;
        } else {
            int first = 0;
            int second = 1;
            int third = 1;
            for (int i = 3; i <= n; i++) {
                res = first + second + third;
                first = second;
                second = third;
                third = res;
            }
        }
        return res;
    }
}