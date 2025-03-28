package solutions.algorithms._0_999._128_Longest_Consecutive_Sequence;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void longestConsecutiveTest1() {

        int[] nums = new int[]{100, 4, 200, 1, 3, 2};

        int actual = solution.longestConsecutive(nums);

        Assertions.assertThat(actual).isEqualTo(4);

    }

    @Test
    void longestConsecutiveTest2() {

        int[] nums = new int[]{0, 3, 7, 2, 5, 8, 4, 6, 0, 1};

        int actual = solution.longestConsecutive(nums);

        Assertions.assertThat(actual).isEqualTo(9);

    }

    @Test
    void longestConsecutiveTest3() {

        int[] nums = new int[]{1, 0, 1, 2};

        int actual = solution.longestConsecutive(nums);

        Assertions.assertThat(actual).isEqualTo(3);

    }
}