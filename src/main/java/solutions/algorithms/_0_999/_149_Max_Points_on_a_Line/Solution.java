package solutions.algorithms._0_999._149_Max_Points_on_a_Line;

class Solution {

    public int maxPoints(int[][] points) {
        if (points.length == 1) {
            return 1;
        } else if (points.length == 2) {
            return 2;
        }

        int max = 0;
        for (int i = 0; i < points.length - 1; i++) {
            for (int j = i + 1; j < points.length; j++) {
                int numberOfPointsOnTheSameLine = getNumOfPointsOnTheSameLine(i, j, points) + 2;
                if (numberOfPointsOnTheSameLine > max) {
                    max = numberOfPointsOnTheSameLine;
                }
            }
        }
        return max;
    }

    int getNumOfPointsOnTheSameLine(int p1Index, int p2Index, int[][] allPoints) {
        int counter = 0;
        for (int i = p2Index; i < allPoints.length; i++) {
            if (i == p1Index || i == p2Index) {
                continue;
            }
            int[] p1 = allPoints[p1Index];
            int[] p2 = allPoints[p2Index];
            int[] p3 = allPoints[i];
            int xL = p1[0] - p2[0];
            int yL = p1[1] - p2[1];

            if (yL == 0) {
                if (p1[1] == p3[1]) {
                    counter++;
                }
                continue;
            } else if (xL == 0) {
                if (p1[0] == p3[0]) {
                    counter++;
                }
                continue;
            }
            int xToCheck = p3[0] - p2[0];
            int yToCheck = p3[1] - p2[1];
            if (xToCheck * yL / (double) xL == yToCheck) {
                counter++;
            }
        }
        return counter;
    }
}