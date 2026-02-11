package solutions.algorithms._0_999._315_Count_of_Smaller_Numbers_After_Self;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void countSmaller1() {
        int[] nums = new int[]{5, 2, 6, 1};
        List<Integer> answer = solution.countSmaller(nums);
        Assertions.assertThat(answer).containsExactly(2, 1, 1, 0);
    }

    @Test
    void countSmaller2() {
        int[] nums = new int[]{-1};
        List<Integer> answer = solution.countSmaller(nums);
        Assertions.assertThat(answer).containsExactly(0);
    }

    @Test
    void countSmaller3() {
        int[] nums = new int[]{-1, 1};
        List<Integer> answer = solution.countSmaller(nums);
        Assertions.assertThat(answer).containsExactly(0, 0);
    }

    @Test
    void countSmaller4() {
        int[] nums = new int[]{5, 2, 1, 6};
        List<Integer> answer = solution.countSmaller(nums);
        Assertions.assertThat(answer).containsExactly(2, 1, 0, 0);
    }
}