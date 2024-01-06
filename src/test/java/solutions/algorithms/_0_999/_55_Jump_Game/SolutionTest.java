package solutions.algorithms._0_999._55_Jump_Game;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import solutions.algorithms._0_999._55_Jump_Game.Solution;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void canJumpTest1() {
        int[] nums = new int[]{2, 3, 1, 1, 4};
        boolean actual = solution.canJump(nums);
        Assertions.assertThat(actual).isTrue();
    }

    @Test
    void canJumpTest2() {
        int[] nums = new int[]{3, 2, 1, 0, 4};
        boolean actual = solution.canJump(nums);
        Assertions.assertThat(actual).isFalse();
    }

    @Test
    void canJumpTest3() {
        int[] nums = new int[]{3};
        boolean actual = solution.canJump(nums);
        Assertions.assertThat(actual).isTrue();
    }

    @Test
    void canJumpTest4() {
        int[] nums = new int[]{0,1};
        boolean actual = solution.canJump(nums);
        Assertions.assertThat(actual).isFalse();
    }

    @Test
    void canJumpTest5() {
        int[] nums = new int[]{1,2,3};
        boolean actual = solution.canJump(nums);
        Assertions.assertThat(actual).isTrue();
    }
}