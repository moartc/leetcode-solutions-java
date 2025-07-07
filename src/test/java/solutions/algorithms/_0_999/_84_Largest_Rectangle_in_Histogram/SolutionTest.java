package solutions.algorithms._0_999._84_Largest_Rectangle_in_Histogram;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void largestRectangleAreaTest1() {
        int[] heights = new int[]{2, 1, 5, 6, 2, 3};
        int result = solution.largestRectangleArea(heights);
        Assertions.assertThat(result).isEqualTo(10);
    }

    @Test
    void largestRectangleAreaTest2() {
        int[] heights = new int[]{2, 4};
        int result = solution.largestRectangleArea(heights);
        Assertions.assertThat(result).isEqualTo(4);
    }

    @Test
    void largestRectangleAreaTest3() {
        int[] heights = new int[]{4, 2};
        int result = solution.largestRectangleArea(heights);
        Assertions.assertThat(result).isEqualTo(4);
    }

    @Test
    void largestRectangleAreaTest4() {
        int[] heights = new int[]{2, 1, 2};
        int result = solution.largestRectangleArea(heights);
        Assertions.assertThat(result).isEqualTo(3);
    }

    @Test
    void largestRectangleAreaTest5() {
        int[] heights = new int[]{5, 4, 1, 2};
        int result = solution.largestRectangleArea(heights);
        Assertions.assertThat(result).isEqualTo(8);
    }

    @Test
    void largestRectangleAreaTest6() {
        int[] heights = new int[]{4, 2, 0, 3, 2, 5};
        int result = solution.largestRectangleArea(heights);
        Assertions.assertThat(result).isEqualTo(6);
    }

    @Test
    void largestRectangleAreaTest7() {
        int[] heights = new int[]{3, 6, 5, 7, 4, 8, 1, 0};
        int result = solution.largestRectangleArea(heights);
        Assertions.assertThat(result).isEqualTo(20);
    }

    @Test
    void largestRectangleAreaTest8() {
        int[] heights = new int[]{5, 4, 4, 6, 3, 2, 9, 5, 4, 8, 1, 0, 0, 4, 7, 2};
        int result = solution.largestRectangleArea(heights);
        Assertions.assertThat(result).isEqualTo(20);
    }
}