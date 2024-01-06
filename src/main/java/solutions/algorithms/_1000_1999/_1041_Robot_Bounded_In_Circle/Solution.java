package solutions.algorithms._1000_1999._1041_Robot_Bounded_In_Circle;


class Solution {

    public boolean isRobotBounded(String instructions) {

        int y = 0;
        int x = 0;
        char currentDir = 'N';

        char[] charArray = instructions.toCharArray();

        for (int i = 0; i < 4; i++) {
            for (char c : charArray) {
                if (c == 'G') {
                    switch (currentDir) {
                        case 'N' -> y--;
                        case 'E' -> x++;
                        case 'S' -> y++;
                        case 'W' -> x--;
                    }
                } else {
                    if (currentDir == 'E') {
                        if (c == 'R') {
                            currentDir = 'S';
                        } else { // L
                            currentDir = 'N';
                        }
                    } else if (currentDir == 'S') {
                        if (c == 'R') {
                            currentDir = 'W';
                        } else { // L
                            currentDir = 'E';
                        }
                    } else if (currentDir == 'W') {
                        if (c == 'R') {
                            currentDir = 'N';
                        } else { // L
                            currentDir = 'S';
                        }
                    } else {    // N
                        if (c == 'R') {
                            currentDir = 'E';
                        } else { // L
                            currentDir = 'W';
                        }
                    }
                }
            }
            if (y == 0 && x == 0 && (i == 0 || i == 1 || i == 3)) {
                return true;
            }
        }
        return false;
    }
}
