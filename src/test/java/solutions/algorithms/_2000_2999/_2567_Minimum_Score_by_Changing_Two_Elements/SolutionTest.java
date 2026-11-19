package solutions.algorithms._2000_2999._2567_Minimum_Score_by_Changing_Two_Elements;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void minimizeSum1() {
        int[] nums = new int[]{1, 4, 7, 8, 5};
        int answer = solution.minimizeSum(nums);
        Assertions.assertThat(answer).isEqualTo(3);
    }

    @Test
    void minimizeSum2() {
        int[] nums = new int[]{1, 4, 3};
        int answer = solution.minimizeSum(nums);
        Assertions.assertThat(answer).isEqualTo(0);
    }

    @Test
    void minimizeSum3() {
        int[] nums = new int[]{31, 25, 72, 79, 74, 65};
        int answer = solution.minimizeSum(nums);
        Assertions.assertThat(answer).isEqualTo(14);
    }

    @Test
    void minimizeSum4() {
        int[] nums = new int[]{59, 27, 9, 81, 33};
        int answer = solution.minimizeSum(nums);
        Assertions.assertThat(answer).isEqualTo(24);
    }


}