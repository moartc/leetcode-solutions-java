package solutions.algorithms._1000_1999._1143_Longest_Common_Subsequence;

class Solution {

    /*
    Apparently I should use dp. So I could build an array like this:

      a b c d e
    a x
    c     x
    e         x

    another case:
    t1: a b g c d
    t2  a b c d e f g
    answer: abcd

      a b c d e f g a
    a x             x
    b   x
    g             x
    c     x
    d       x

    Now I have to find all 'x' where the next one has 'y' and 'x' (positions) greater than the previous one

    I can then iterate again with the array of ints and a counter.
    I check the boolean value for the current cell,
    - if it's false:
    I check the left counter (in the second array) and the top and take the higher one,
    - if it's true:
    I set the left top value increased by 1,

    example for the case above:
      a b c d e f g a
    a 1 1 1 1 1 1 1 1
    b 1 2 2 2 2 2 2 2
    g 1 2 2 2 2 2 3 3
    c 1 2 3 3 3 3 3 3
    d 1 2 3 4 4 4 4 4


    update: instead of 2 iterations I moved counterArr to the main loop
     */

    public int longestCommonSubsequence(String text1, String text2) {

        int[][] counterArr = new int[text2.length()][text1.length()];

        for (int y = 0; y < text2.length(); y++) {
            char c1 = text2.charAt(y);
            for (int x = 0; x < text1.length(); x++) {
                char c2 = text1.charAt(x);
                if (c1 == c2) {
                    if (y == 0 || x == 0) {
                        counterArr[y][x] = 1;
                    } else {
                        counterArr[y][x] = counterArr[y - 1][x - 1] + 1;
                    }
                } else {
                    if (y == 0 && x == 0) {
                        counterArr[y][x] = 0;
                    } else if (y == 0) {
                        counterArr[y][x] = counterArr[y][x - 1];
                    } else if (x == 0) {
                        counterArr[y][x] = counterArr[y - 1][x];
                    } else {
                        counterArr[y][x] = Math.max(counterArr[y - 1][x], counterArr[y][x - 1]);
                    }
                }
            }
        }
        return counterArr[text2.length() - 1][text1.length() - 1];
    }
}