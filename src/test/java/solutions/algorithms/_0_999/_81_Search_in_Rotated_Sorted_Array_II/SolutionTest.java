package solutions.algorithms._0_999._81_Search_in_Rotated_Sorted_Array_II;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();


    @Test
    void search1() {
        int[] nums = new int[]{2, 5, 6, 0, 0, 1, 2};
        int target = 0;
        boolean answer = solution.search(nums, target);
        Assertions.assertThat(answer).isTrue();
    }

    @Test
    void search2() {
        int[] nums = new int[]{2, 5, 6, 0, 0, 1, 2};
        int target = 3;
        boolean answer = solution.search(nums, target);
        Assertions.assertThat(answer).isFalse();
    }

    @Test
    void search3() {
        int[] nums = new int[]{1,0,1,1,1};
        int target = 0;
        boolean answer = solution.search(nums, target);
        Assertions.assertThat(answer).isTrue();
    }

    @Test
    void search4() {
        int[] nums = new int[]{1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1};
        int target = 2;
        boolean answer = solution.search(nums, target);
        Assertions.assertThat(answer).isTrue();
    }

    @Test
    void search5() {
        int[] nums = new int[]{3,1,1};
        int target = 3;
        boolean answer = solution.search(nums, target);
        Assertions.assertThat(answer).isTrue();
    }
}