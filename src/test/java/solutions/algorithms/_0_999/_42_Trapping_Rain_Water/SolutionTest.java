package solutions.algorithms._0_999._42_Trapping_Rain_Water;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void trapTest1() {

        int[] input = new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int actual = solution.trap(input);
        Assertions.assertThat(actual).isEqualTo(6);
    }

    @Test
    void trapTest2() {

        int[] input = new int[]{4, 2, 0, 3, 2, 5};
        int actual = solution.trap(input);
        Assertions.assertThat(actual).isEqualTo(9);
    }

    @Test
    void trapTest3() {

        int[] input = new int[]{6, 4, 2, 0, 3, 2, 0, 3, 1, 4, 5, 3, 2, 7, 5, 3, 0, 1, 2, 1, 3, 4, 6, 8, 1, 3};
        int actual = solution.trap(input);
        Assertions.assertThat(actual).isEqualTo(83);
    }

    @Test
    void trapTest4() {

        int[] input = new int[]{0, 2, 0, 3, 1, 0, 1, 3, 2, 1};
        int actual = solution.trap(input);
        Assertions.assertThat(actual).isEqualTo(9);
    }

}