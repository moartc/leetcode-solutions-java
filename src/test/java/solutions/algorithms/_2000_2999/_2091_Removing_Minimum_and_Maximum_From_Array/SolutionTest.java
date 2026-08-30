package solutions.algorithms._2000_2999._2091_Removing_Minimum_and_Maximum_From_Array;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void minimumDeletions1() {
        int[] nums = new int[]{2, 10, 7, 5, 4, 1, 8, 6};
        int answer = solution.minimumDeletions(nums);
        Assertions.assertThat(answer).isEqualTo(5);
    }

    @Test
    void minimumDeletions2() {
        int[] nums = new int[]{0, -4, 19, 1, 8, -2, -3, 5};
        int answer = solution.minimumDeletions(nums);
        Assertions.assertThat(answer).isEqualTo(3);
    }

    @Test
    void minimumDeletions3() {
        int[] nums = new int[]{101};
        int answer = solution.minimumDeletions(nums);
        Assertions.assertThat(answer).isEqualTo(1);
    }

    @Test
    void minimumDeletions4() {
        int[] nums = new int[]{0, 1, 8, -2, -3, -4, 19, 5};
        int answer = solution.minimumDeletions(nums);
        Assertions.assertThat(answer).isEqualTo(3);
    }

}