package solutions.algorithms._0_999._287_Find_the_Duplicate_Number;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void findDuplicateTest1() {
        int[] nums = new int[]{1, 3, 4, 2, 2};
        int answer = solution.findDuplicate(nums);
        Assertions.assertThat(answer).isEqualTo(2);
    }

    @Test
    void findDuplicateTest2() {
        int[] nums = new int[]{3, 1, 3, 4, 2};
        int answer = solution.findDuplicate(nums);
        Assertions.assertThat(answer).isEqualTo(3);
    }

    @Test
    void findDuplicateTest3() {
        int[] nums = new int[]{3, 3, 3, 3, 3};
        int answer = solution.findDuplicate(nums);
        Assertions.assertThat(answer).isEqualTo(3);
    }

    @Test
    void findDuplicateTest4() {
        int[] nums = new int[]{2, 5, 9, 6, 9, 3, 8, 9, 7, 1};
        int answer = solution.findDuplicate(nums);
        Assertions.assertThat(answer).isEqualTo(9);
    }
}