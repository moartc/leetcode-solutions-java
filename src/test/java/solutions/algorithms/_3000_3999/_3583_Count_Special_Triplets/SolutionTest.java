package solutions.algorithms._3000_3999._3583_Count_Special_Triplets;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void specialTriplets1() {
        int[] nums = new int[]{6, 3, 6};
        int answer = solution.specialTriplets(nums);
        Assertions.assertThat(answer).isEqualTo(1);
    }

    @Test
    void specialTriplets2() {
        int[] nums = new int[]{0, 1, 0, 0};
        int answer = solution.specialTriplets(nums);
        Assertions.assertThat(answer).isEqualTo(1);
    }

    @Test
    void specialTriplets3() {
        int[] nums = new int[]{8, 4, 2, 8, 4};
        int answer = solution.specialTriplets(nums);
        Assertions.assertThat(answer).isEqualTo(2);
    }

    @Test
    void specialTriplets4() {
        int[] nums = new int[]{47544, 27352, 13676, 27352, 56764, 47544, 60487, 28382, 56764, 822};
        int answer = solution.specialTriplets(nums);
        Assertions.assertThat(answer).isEqualTo(2);
    }
}