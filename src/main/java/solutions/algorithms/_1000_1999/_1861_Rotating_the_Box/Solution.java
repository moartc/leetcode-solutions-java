package solutions.algorithms._1000_1999._1861_Rotating_the_Box;

class Solution {
    public char[][] rotateTheBox(char[][] boxGrid) {


        char[][] answer = new char[boxGrid[0].length][boxGrid.length];

        // 0 .. 5
        for (int x = 0; x < boxGrid[0].length; x++) {
            // 2 .. 0
            // 2 -> 0
            // 1 -> 1
            // 0 -> 2
            for (int y = boxGrid.length - 1; y >= 0; y--) {
                int newX = boxGrid.length - y - 1;
                answer[x][newX] = boxGrid[y][x];
            }
        }
        // move stones col by col moving the lowest max down
        for (int x = 0; x < answer[0].length; x++) {
            // skip the lowest
            for (int y = answer.length - 2; y >= 0; y--) {
                if (answer[y][x] == '#') { // if it's a stone
                    int tempY = y;
                    while (tempY + 1 < answer.length && answer[tempY + 1][x] == '.') {
                        answer[tempY + 1][x] = '#';
                        answer[tempY][x] = '.';
                        tempY++;
                    }
                }
            }
        }
        return answer;
    }
}