package solutions.algorithms._3000_3999._3731_Find_Missing_Elements;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void findMissingElements1() {
        int[] nums = new int[]{1, 4, 2, 5};
        List<Integer> answer = solution.findMissingElements(nums);
        Assertions.assertThat(answer).containsExactly(3);
    }

    @Test
    void findMissingElements2() {
        int[] nums = new int[]{7, 8, 6, 9};
        List<Integer> answer = solution.findMissingElements(nums);
        Assertions.assertThat(answer).containsExactly();
    }

    @Test
    void findMissingElements3() {
        int[] nums = new int[]{5, 1};
        List<Integer> answer = solution.findMissingElements(nums);
        Assertions.assertThat(answer).containsExactly(2, 3, 4);
    }

}