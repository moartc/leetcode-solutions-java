package solutions.algorithms._3000_3999._3020_Find_the_Maximum_Number_of_Elements_in_Subset;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void maximumLength1() {
        int[] nums = new int[]{5, 4, 1, 2, 2};
        int answer = solution.maximumLength(nums);
        Assertions.assertThat(answer).isEqualTo(3);
    }

    @Test
    void maximumLength2() {
        int[] nums = new int[]{1, 3, 2, 4};
        int answer = solution.maximumLength(nums);
        Assertions.assertThat(answer).isEqualTo(1);
    }

    @Test
    void maximumLength3() {
        int[] nums = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};
        int answer = solution.maximumLength(nums);
        Assertions.assertThat(answer).isEqualTo(9);
    }

    @Test
    void maximumLength4() {
        int[] nums = new int[]{1, 1, 1, 1, 2, 2, 4, 4, 16, 16, 256, 3, 3, 9, 81};
        int answer = solution.maximumLength(nums);
        Assertions.assertThat(answer).isEqualTo(7);
    }

    @Test
    void maximumLength5() {
        int[] nums = new int[]{1, 1, 1, 2, 2, 4, 4, 16, 16, 256, 256, 65536, 3, 3, 9, 9, 81, 81, 6561};
        int answer = solution.maximumLength(nums);
        Assertions.assertThat(answer).isEqualTo(9);
    }

}