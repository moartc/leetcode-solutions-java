package solutions.algorithms._2000_2999._2948_Make_Lexicographically_Smallest_Array_by_Swapping_Elements;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void lexicographicallySmallestArray1() {
        int[] nums = new int[]{1, 5, 3, 9, 8};
        int limit = 2;
        int[] answer = solution.lexicographicallySmallestArray(nums, limit);
        Assertions.assertThat(answer).containsExactly(1, 3, 5, 8, 9);
    }

    @Test
    void lexicographicallySmallestArray2() {
        int[] nums = new int[]{1, 7, 6, 18, 2, 1};
        int limit = 3;
        int[] answer = solution.lexicographicallySmallestArray(nums, limit);
        Assertions.assertThat(answer).containsExactly(1, 6, 7, 18, 1, 2);
    }

    @Test
    void lexicographicallySmallestArray3() {
        int[] nums = new int[]{1, 7, 28, 19, 10};
        int limit = 3;
        int[] answer = solution.lexicographicallySmallestArray(nums, limit);
        Assertions.assertThat(answer).containsExactly(1, 7, 28, 19, 10);
    }
}