package solutions.algorithms._0_999._540_Single_Element_in_a_SortedArray;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void singleNonDuplicate1() {
        int[] nums = new int[]{1, 1, 2, 3, 3, 4, 4, 8, 8};
        int answer = solution.singleNonDuplicate(nums);
        Assertions.assertThat(answer).isEqualTo(2);
    }

    @Test
    void singleNonDuplicate2() {
        int[] nums = new int[]{3, 3, 7, 7, 10, 11, 11};
        int answer = solution.singleNonDuplicate(nums);
        Assertions.assertThat(answer).isEqualTo(10);
    }

    @Test
    void singleNonDuplicate3() {
        int[] nums = new int[]{1, 1, 2, 3, 3};
        int answer = solution.singleNonDuplicate(nums);
        Assertions.assertThat(answer).isEqualTo(2);
    }
}