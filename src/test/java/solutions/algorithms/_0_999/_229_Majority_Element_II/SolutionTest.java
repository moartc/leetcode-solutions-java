package solutions.algorithms._0_999._229_Majority_Element_II;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void majorityElement1() {
        int[] nums = new int[]{3, 2, 3};
        List<Integer> answer = solution.majorityElement(nums);
        Assertions.assertThat(answer).containsExactly(3);
    }

    @Test
    void majorityElement2() {
        int[] nums = new int[]{1};
        List<Integer> answer = solution.majorityElement(nums);
        Assertions.assertThat(answer).containsExactly(1);
    }

    @Test
    void majorityElement3() {
        int[] nums = new int[]{1, 2};
        List<Integer> answer = solution.majorityElement(nums);
        Assertions.assertThat(answer).containsExactly(1, 2);
    }

    @Test
    void majorityElement4() {
        int[] nums = new int[]{3, 3, 4};
        List<Integer> answer = solution.majorityElement(nums);
        Assertions.assertThat(answer).containsExactly(3);
    }

    @Test
    void majorityElement5() {
        int[] nums = new int[]{6, 5, 5};
        List<Integer> answer = solution.majorityElement(nums);
        Assertions.assertThat(answer).containsExactly(5);
    }

    @Test
    void majorityElement6() {
        int[] nums = new int[]{0, 3, 4, 0};
        List<Integer> answer = solution.majorityElement(nums);
        Assertions.assertThat(answer).containsExactly(0);
    }

    @Test
    void majorityElement7() {
        int[] nums = new int[]{3, 0, 4, 0};
        List<Integer> answer = solution.majorityElement(nums);
        Assertions.assertThat(answer).containsExactly(0);
    }
}