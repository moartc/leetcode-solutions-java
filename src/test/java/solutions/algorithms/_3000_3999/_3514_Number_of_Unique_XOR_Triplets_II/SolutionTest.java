package solutions.algorithms._3000_3999._3514_Number_of_Unique_XOR_Triplets_II;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void uniqueXorTriplets1() {
        int[] nums = new int[]{1, 3};
        int answer = solution.uniqueXorTriplets(nums);
        Assertions.assertThat(answer).isEqualTo(2);
    }

    @Test
    void uniqueXorTriplets2() {
        int[] nums = new int[]{6, 7, 8, 9};
        int answer = solution.uniqueXorTriplets(nums);
        Assertions.assertThat(answer).isEqualTo(4);
    }
}