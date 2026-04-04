package solutions.algorithms._0_999._448_Find_All_Numbers_Disappeared_in_an_Array;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void findDisappearedNumbers1() {
        int[] nums = new int[]{4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> answer = solution.findDisappearedNumbers(nums);
        Assertions.assertThat(answer).containsExactly(5, 6);
    }

    @Test
    void findDisappearedNumbers2() {
        int[] nums = new int[]{1, 1};
        List<Integer> answer = solution.findDisappearedNumbers(nums);
        Assertions.assertThat(answer).containsExactly(2);
    }

    @Test
    void findDisappearedNumbers3() {
        int[] nums = new int[]{4, 4, 4, 4};
        List<Integer> answer = solution.findDisappearedNumbers(nums);
        Assertions.assertThat(answer).containsExactly(1, 2, 3);
    }
}