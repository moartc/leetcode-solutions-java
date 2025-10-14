package solutions.algorithms._2000_2999._2013_Detect_Squares;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class DetectSquares {

    /*
    1st approach
    Track each point in a map (use the point as the key) and store its occurrence count as the value.

    for 'count' method
    find all points where y matches
    find all points where x matches
    for these which can create a square, combine all yx and check if that point exists - if so I have a square

    update:
    actually it's enough to find all y points where y matches and then check if remaining 2 pointes exists
    it's like,
    PG - point given as a parameter
    P2 = point with the same y
    X3-----X4
    |       |
    |       |
    PG-----P2
    |       |
    |       |
    X1-----X2

    I mixed up y with x, but consistently, so it's not a problem.
    */

    Map<Point, Integer> map;

    public DetectSquares() {
        map = new HashMap<>();
    }

    public void add(int[] point) {
        Point p = new Point(point[0], point[1]);
        Integer currentCounter = map.getOrDefault(p, 0);
        map.put(p, currentCounter + 1);
    }

    public int count(int[] point) {

        int toRet = 0;
        for (Map.Entry<Point, Integer> entry : map.entrySet()) {
            Point pFromMap = entry.getKey();
            Integer counter = entry.getValue();
            if (pFromMap.y == point[0]) {
                int edgeLength = Math.abs(pFromMap.x - point[1]);
                if (edgeLength == 0) {
                    continue;
                }

                Point pX1 = new Point(point[0] - edgeLength, point[1]);
                Integer i1 = map.getOrDefault(pX1, 0);
                if (i1 != 0) {
                    Point pX2 = new Point(point[0] - edgeLength, pFromMap.x);
                    Integer i2 = map.getOrDefault(pX2, 0);
                    if (i2 != 0) {
                        toRet += (i1 * i2 * counter);
                    }
                }
                Point pX3 = new Point(point[0] + edgeLength, point[1]);
                Integer i3 = map.getOrDefault(pX3, 0);
                if (i3 != 0) {
                    Point pX4 = new Point(point[0] + edgeLength, pFromMap.x);
                    Integer i4 = map.getOrDefault(pX4, 0);
                    if (i4 != 0) {
                        toRet += (i3 * i4 * counter);
                    }
                }
            }
        }
        return toRet;
    }

    static class Point {
        int y;
        int x;

        public Point(int y, int x) {
            this.y = y;
            this.x = x;
        }

        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;
            Point point = (Point) o;
            return y == point.y && x == point.x;
        }

        @Override
        public int hashCode() {
            return Objects.hash(y, x);
        }
    }
}

/**
 * Your DetectSquares object will be instantiated and called as such:
 * DetectSquares obj = new DetectSquares();
 * obj.add(point);
 * int param_2 = obj.count(point);
 */