package solutions.algorithms._0_999._442_Find_All_Duplicates_in_an_Array;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void findDuplicates1() {
        int[] nums = new int[]{4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> answer = solution.findDuplicates(nums);
        Assertions.assertThat(answer).containsExactly(2, 3);
    }

    @Test
    void findDuplicates2() {
        int[] nums = new int[]{1, 1, 2};
        List<Integer> answer = solution.findDuplicates(nums);
        Assertions.assertThat(answer).containsExactly(1);
    }

    @Test
    void findDuplicates3() {
        int[] nums = new int[]{1};
        List<Integer> answer = solution.findDuplicates(nums);
        Assertions.assertThat(answer).isEmpty();
    }
}