package solutions.algorithms._3000_3999._3069_Distribute_Elements_Into_Two_Arrays_I;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void resultArray1() {
        int[] nums = new int[]{2, 1, 3};
        int[] answer = solution.resultArray(nums);
        Assertions.assertThat(answer).containsExactly(2, 3, 1);
    }

    @Test
    void resultArray2() {
        int[] nums = new int[]{5, 4, 3, 8};
        int[] answer = solution.resultArray(nums);
        Assertions.assertThat(answer).containsExactly(5, 3, 4, 8);
    }
}