package solutions.algorithms._3000_3999._3693_Climbing_Stairs_II;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void climbStairs1() {
        int n = 4;
        int[] cost = new int[]{1, 2, 3, 4};
        int answer = solution.climbStairs(n, cost);
        Assertions.assertThat(answer).isEqualTo(13);
    }

    @Test
    void climbStairs2() {
        int n = 4;
        int[] cost = new int[]{5, 1, 6, 2};
        int answer = solution.climbStairs(n, cost);
        Assertions.assertThat(answer).isEqualTo(11);
    }

    @Test
    void climbStairs3() {
        int n = 3;
        int[] cost = new int[]{9, 8, 3};
        int answer = solution.climbStairs(n, cost);
        Assertions.assertThat(answer).isEqualTo(12);
    }

    @Test
    void climbStairs4() {
        int n = 29;
        int[] cost = new int[]{3, 26, 12, 8, 2, 24, 32, 3, 21, 13, 11, 11, 14, 27, 23, 12, 15, 24, 4, 30, 4, 3, 22, 28, 34, 30, 7, 31, 21};
        int answer = solution.climbStairs(n, cost);
        Assertions.assertThat(answer).isEqualTo(193);
    }
}