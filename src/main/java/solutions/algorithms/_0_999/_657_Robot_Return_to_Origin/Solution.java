package solutions.algorithms._0_999._657_Robot_Return_to_Origin;

class Solution {
    public boolean judgeCircle(String moves) {

        int y = 0;
        int x = 0;
        for (char c : moves.toCharArray()) {
            if (c == 'U') {
                y++;
            } else if (c == 'D') {
                y--;
            } else if (c == 'L') {
                x--;
            } else { // R
                x++;
            }
        }
        return y == 0 && x == 0;
    }
}