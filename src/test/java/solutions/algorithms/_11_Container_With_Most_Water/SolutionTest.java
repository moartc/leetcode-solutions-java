package solutions.algorithms._11_Container_With_Most_Water;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void maxAreaTest1() {
        int[] height = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        int result = solution.maxArea(height);
        Assertions.assertThat(result).isEqualTo(49);
    }

    @Test
    void maxAreaTest2() {
        int[] height = new int[]{1, 1};
        int result = solution.maxArea(height);
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    void maxAreaTest3() {
        int[] height = new int[]{1, 1, 1, 1, 9, 9, 1, 1};
        int result = solution.maxArea(height);
        Assertions.assertThat(result).isEqualTo(9);
    }

    @Test
    void maxAreaTest4() {
        int[] height = new int[]{1, 2, 1};
        int result = solution.maxArea(height);
        Assertions.assertThat(result).isEqualTo(2);
    }

    @Test
    void maxAreaTest5() {
        int[] height = new int[]{1, 8, 6, 2, 100, 100, 4, 8, 3, 7};
        int result = solution.maxArea(height);
        Assertions.assertThat(result).isEqualTo(100);
    }
}