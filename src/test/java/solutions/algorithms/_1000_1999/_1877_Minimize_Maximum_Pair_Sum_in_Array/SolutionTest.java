package solutions.algorithms._1000_1999._1877_Minimize_Maximum_Pair_Sum_in_Array;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void minPairSum1() {
        int nums[] = new int[]{3, 5, 2, 3};
        int answer = solution.minPairSum(nums);
        Assertions.assertThat(answer).isEqualTo(7);
    }

    @Test
    void minPairSum2() {
        int nums[] = new int[]{3, 5, 4, 2, 4, 6};
        int answer = solution.minPairSum(nums);
        Assertions.assertThat(answer).isEqualTo(8);
    }

    @Test
    void minPairSum3() {
        int nums[] = new int[]{4, 1, 5, 1, 2, 5, 1, 5, 5, 4};
        int answer = solution.minPairSum(nums);
        Assertions.assertThat(answer).isEqualTo(8);
    }
}