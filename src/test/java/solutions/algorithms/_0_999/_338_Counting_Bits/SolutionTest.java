package solutions.algorithms._0_999._338_Counting_Bits;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import solutions.algorithms._0_999._338_Counting_Bits.Solution;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void countBitsTest1() {
        int[] expected = new int[]{0, 1, 1};
        int[] actual = solution.countBits(2);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void countBitsTest2() {
        int[] expected = new int[]{0, 1, 1, 2, 1, 2};
        int[] actual = solution.countBits(5);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}