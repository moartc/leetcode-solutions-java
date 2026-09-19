package solutions.algorithms._1000_1999._1401_Circle_and_Rectangle_Overlapping;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void checkOverlap1() {
        int radius = 1;
        int xCenter = 0;
        int yCenter = 0;
        int x1 = 1;
        int y1 = -1;
        int x2 = 3;
        int y2 = 1;
        boolean answer = solution.checkOverlap(radius, xCenter, yCenter, x1, y1, x2, y2);
        Assertions.assertThat(answer).isTrue();
    }

    @Test
    void checkOverlap2() {
        int radius = 1;
        int xCenter = 1;
        int yCenter = 1;
        int x1 = 1;
        int y1 = -3;
        int x2 = 2;
        int y2 = -1;
        boolean answer = solution.checkOverlap(radius, xCenter, yCenter, x1, y1, x2, y2);
        Assertions.assertThat(answer).isFalse();
    }

    @Test
    void checkOverlap3() {
        int radius = 1;
        int xCenter = 0;
        int yCenter = 0;
        int x1 = -1;
        int y1 = 0;
        int x2 = 0;
        int y2 = 1;
        boolean answer = solution.checkOverlap(radius, xCenter, yCenter, x1, y1, x2, y2);
        Assertions.assertThat(answer).isTrue();
    }
}