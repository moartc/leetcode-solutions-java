package solutions.algorithms._0_999._115_Distinct_Subsequences;

class Solution {

    /*
    Recursive solution: at each step:
    1. if the current char from s equals the current char from t
       - take the current char and move both pointers, or
       - skip the char and move the pointer in s
    2. if the chars are not equal,  move the pointer in s

    it beats 41%


    another idea, for every char in s, mark when it occurs in t,
    I have an array like this (if I set 1 where characters are equal):
    1 0 1 0 1 0 0
    0 1 0 0 0 1 0
    0 0 0 1 0 0 1

    another example (researchTest):
    abcabc / abc
    1 0 0 1 0 0
    0 1 0 0 1 0
    0 0 1 0 0 1

    Then I can calculate the current number of possible paths:
    1 1 1 2 2 2
    0 1 1 1 3 3
    0 0 1 1 1 4

    So - in the first row I start with 0, and I increase the counter by 1 when both characters are equal.
    If both characters are equals, I set value to the value of [y][x-1] + [y-1][x-1] cell (top - left)

    it beats 96%
     */


    int[][] cache2;

    public int numDistinct(String s, String t) {
        cache2 = new int[t.length()][s.length()];

        char[] tArr = t.toCharArray();
        char[] sArr = s.toCharArray();

        for (int i = 0; i < tArr.length; i++) {
            int currentCtr = 0;
            char ct = t.toCharArray()[i];
            for (int j = i; j < sArr.length; j++) {
                char cs = sArr[j];
                if (ct == cs) {
                    currentCtr++;
                    if (i != 0) {
                        currentCtr = cache2[i][j - 1] + cache2[i - 1][j - 1];
                    }
                }
                cache2[i][j] = currentCtr;
            }
        }
        return cache2[t.length() - 1][s.length() - 1];
    }


    /* Initial recursive idea

    int[][] cache;

    cach initialized then in numDistinct(String s, String t):

    cache = new int[s.length()][t.length()];
    for (int[] ints : cache) {
        Arrays.fill(ints, -1);
    }
    end I call it and return like this:
    return numbOfSub(0, s.toCharArray(), 0, t.toCharArray());

    int numbOfSub(int is, char[] s, int it, char[] t) {

        if (is >= s.length || it >= t.length) {
            return 0;
        }
        if (cache[is][it] != -1) {
            return cache[is][it];
        }
        int numb = 0;

        if (it == t.length - 1 && s[is] == t[it]) {
            numb = 1;
        }
        //
        char cs = s[is];
        char ct = t[it];
        if (cs == ct) {
            numb += numbOfSub(is + 1, s, it + 1, t);
        }
        numb += numbOfSub(is + 1, s, it, t);
        cache[is][it] = numb;
        return numb;
    }
 */
}