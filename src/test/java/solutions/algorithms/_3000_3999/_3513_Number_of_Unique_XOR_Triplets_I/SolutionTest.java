package solutions.algorithms._3000_3999._3513_Number_of_Unique_XOR_Triplets_I;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void uniqueXorTriplets1() {
        int[] nums = new int[]{1, 2};
        int answer = solution.uniqueXorTriplets(nums);
        Assertions.assertThat(answer).isEqualTo(2);
    }

    @Test
    void uniqueXorTriplets2() {
        int[] nums = new int[]{3, 1, 2};
        int answer = solution.uniqueXorTriplets(nums);
        Assertions.assertThat(answer).isEqualTo(4);
    }

    @Test
    void uniqueXorTriplets3() {
        int[] nums = new int[]{3, 1, 2,4};
        int answer = solution.uniqueXorTriplets(nums);
        Assertions.assertThat(answer).isEqualTo(8);
    }
}