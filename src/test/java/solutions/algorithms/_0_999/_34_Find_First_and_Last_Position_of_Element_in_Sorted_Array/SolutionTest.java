package solutions.algorithms._0_999._34_Find_First_and_Last_Position_of_Element_in_Sorted_Array;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import solutions.algorithms._0_999._34_Find_First_and_Last_Position_of_Element_in_Sorted_Array.Solution;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void searchRangeTest1() {
        int[] nums = new int[]{5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] actual = solution.searchRange(nums, target);
        Assertions.assertThat(actual).isEqualTo(new int[]{3, 4});
    }

    @Test
    void searchRangeTest2() {
        int[] nums = new int[]{5, 7, 7, 8, 8, 10};
        int target = 6;
        int[] actual = solution.searchRange(nums, target);
        Assertions.assertThat(actual).isEqualTo(new int[]{-1, -1});
    }

    @Test
    void searchRangeTest3() {
        int[] nums = new int[]{};
        int target = 0;
        int[] actual = solution.searchRange(nums, target);
        Assertions.assertThat(actual).isEqualTo(new int[]{-1, -1});
    }

    @Test
    void searchRangeTest4() {
        int[] nums = new int[]{5};
        int target = 3;
        int[] actual = solution.searchRange(nums, target);
        Assertions.assertThat(actual).isEqualTo(new int[]{-1, -1});
    }

    @Test
    void searchRangeTest5() {
        int[] nums = new int[]{5};
        int target = 5;
        int[] actual = solution.searchRange(nums, target);
        Assertions.assertThat(actual).isEqualTo(new int[]{0, 0});
    }

    @Test
    void searchRangeTest6() {
        int[] nums = new int[]{5, 7, 7, 8, 8, 10};
        int target = 10;
        int[] actual = solution.searchRange(nums, target);
        Assertions.assertThat(actual).isEqualTo(new int[]{5, 5});
    }

    @Test
    void searchRangeTest7() {
        int[] nums = new int[]{8,8,8, 8, 8};
        int target = 8;
        int[] actual = solution.searchRange(nums, target);
        Assertions.assertThat(actual).isEqualTo(new int[]{0, 4});
    }
}