package solutions.algorithms._0_999._486_Predict_the_Winner;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void predictTheWinner1() {
        int[] nums = new int[]{1, 5, 2};
        boolean answer = solution.predictTheWinner(nums);
        Assertions.assertThat(answer).isFalse();
    }

    @Test
    void predictTheWinner2() {
        int[] nums = new int[]{1, 5, 233, 7};
        boolean answer = solution.predictTheWinner(nums);
        Assertions.assertThat(answer).isTrue();
    }
}