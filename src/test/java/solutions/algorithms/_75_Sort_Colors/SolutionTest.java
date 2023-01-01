package solutions.algorithms._75_Sort_Colors;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sortColorsTest1() {

        int[] nums = new int[]{2, 0, 2, 1, 1, 0};
        solution.sortColors(nums);
        int[] expected = new int[]{0, 0, 1, 1, 2, 2};
        assertThat(nums).isEqualTo(expected);
    }

    @Test
    void sortColorsTest2() {

        int[] nums = new int[]{2, 0, 1};
        solution.sortColors(nums);
        int[] expected = new int[]{0, 1, 2};
        assertThat(nums).isEqualTo(expected);
    }
}