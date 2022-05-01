package solutions.algorithms._120_Triangle;

import java.util.List;

class Solution {
    int[][] mem;
    int globalMin;

    public int minimumTotal(List<List<Integer>> triangle) {

        mem = new int[triangle.size()][triangle.size()];
        for (int y = 0; y < triangle.size(); y++) {
            for (int x = 0; x < y + 1; x++) {
                mem[y][x] = Integer.MAX_VALUE;
            }
        }
        mem[0][0] = triangle.get(0).get(0);
        globalMin = Integer.MAX_VALUE;

        return iterativeVersion(triangle);
//        return recursiveVersion(triangle);
    }


    int iterativeVersion(List<List<Integer>> triangle) {
        for (int y = 1; y < triangle.size(); y++) {
            addNextLine(y, triangle);
        }
        for (int i = 0; i < triangle.size(); i++) {
            if (mem[triangle.size() - 1][i] < globalMin) {
                globalMin = mem[triangle.size() - 1][i];
            }
        }
        return globalMin;
    }

    void addNextLine(int y, List<List<Integer>> triangle) {
        for (int i = 0; i < y + 1; i++) {
            var current = triangle.get(y).get(i);
            if (i == 0) {
                mem[y][i] = mem[y - 1][i] + current;
            } else if (i == y) {
                mem[y][i] = mem[y - 1][i - 1] + current;
            } else {
                mem[y][i] = Math.min(mem[y - 1][i - 1], mem[y - 1][i]) + current;
            }
        }
    }

    // below starts recursive version
    int recursiveVersion(List<List<Integer>> triangle) {
        var first = triangle.get(0).get(0);
        if (triangle.size() > 1) {
            visitNext(1, 0, first + triangle.get(1).get(0), triangle);
            visitNext(1, 1, first + triangle.get(1).get(1), triangle);
        } else {
            return first;
        }
        return globalMin;
    }

    void visitNext(int y, int x, int currentSum, List<List<Integer>> triangle) {
        if (currentSum < mem[y][x]) {
            mem[y][x] = currentSum;
        }
        if (y == triangle.size() - 1 && currentSum < globalMin) {
            globalMin = currentSum;
        } else if (y < triangle.size() - 1) {
            var nextFirst = currentSum + triangle.get(y + 1).get(x);
            if (mem[y + 1][x] > nextFirst) {
                visitNext(y + 1, x, nextFirst, triangle);
            }
            var nextSecond = currentSum + triangle.get(y + 1).get(x + 1);
            if (mem[y + 1][x + 1] > nextSecond) {
                visitNext(y + 1, x + 1, nextSecond, triangle);
            }
        }
    }
}