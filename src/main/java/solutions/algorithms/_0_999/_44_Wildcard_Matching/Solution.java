package solutions.algorithms._0_999._44_Wildcard_Matching;

class Solution {
    /*
    if I encounter '*' and it's the last char in 'p' I can return true
    I could build a 2d array with s x p
       a b c d e f
    *  t t t t t t
    c  f f t f f f
    ?  t t t t t t
     then I need to find a path starting from 0,0 to the bottom right position.
     I can move either right or diagonal down right (y+1, x+1)
     If I have * 0 - I can continue right
     for any other match, I have to move diag down right

     I see I need additional handling for empty 's'
     --
     I can find this path with DFS (probably with caching)
     update: I should also allow moving down with '*' - an empty can match multiple '*'
     update2: TLE even with caching, I will try dp

    after fighting with dp of size p.length x s.length I am switching to +1 to both sizes
     */
    public boolean isMatch(String s, String p) {

        boolean[][] dp = new boolean[p.length() + 1][s.length() + 1];
        // first is empty
        dp[0][0] = true;
        for (int i = 1; i <= s.length(); i++) {
            dp[0][i] = false; // empty pattern matches nothing except 0,0
        }
        for (int i = 1; i <= p.length(); i++) {
            dp[i][0] = dp[i - 1][0] && p.charAt(i - 1) == '*'; // empty string matches only by '*' or many stars
        }
        for (int y = 1; y < dp.length; y++) {
            char pChar = p.charAt(y - 1);
            for (int x = 1; x < dp[0].length; x++) {
                boolean currentCharMatch = pChar == '*' || pChar == '?' || pChar == s.charAt(x - 1);
                boolean wasPrevMatch;
                if (pChar == '*') {
                    wasPrevMatch = dp[y - 1][x - 1] // both move - single char match
                            || dp[y][x - 1]  // pattern stays string moves - next one matches *
                            || dp[y - 1][x]; // pattern moves, string stays - empty char
                } else {
                    wasPrevMatch = dp[y - 1][x - 1];
                }
                dp[y][x] = wasPrevMatch && currentCharMatch;
            }
        }
        return dp[p.length()][s.length()];
    }

}