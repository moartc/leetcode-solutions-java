package solutions.algorithms._0_999._836_Rectangle_Overlap;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void isRectangleOverlap1() {
        int[] rec1 = new int[]{0, 0, 2, 2};
        int[] rec2 = new int[]{1, 1, 3, 3};
        boolean answer = solution.isRectangleOverlap(rec1, rec2);
        Assertions.assertThat(answer).isTrue();
    }

    @Test
    void isRectangleOverlap2() {
        int[] rec1 = new int[]{0, 0, 1, 1};
        int[] rec2 = new int[]{1, 0, 2, 1};
        boolean answer = solution.isRectangleOverlap(rec1, rec2);
        Assertions.assertThat(answer).isFalse();
    }

    @Test
    void isRectangleOverlap3() {
        int[] rec1 = new int[]{0, 0, 1, 1};
        int[] rec2 = new int[]{2, 2, 3, 3};
        boolean answer = solution.isRectangleOverlap(rec1, rec2);
        Assertions.assertThat(answer).isFalse();
    }

    @Test
    void isRectangleOverlap4() {
        int[] rec1 = new int[]{7, 8, 13, 15};
        int[] rec2 = new int[]{10, 8, 12, 20};
        boolean answer = solution.isRectangleOverlap(rec1, rec2);
        Assertions.assertThat(answer).isTrue();
    }
}