package solutions.algorithms._2000_2999._2996_Smallest_Missing_Integer_Greater_Than_Sequential_Prefix_Sum;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void missingInteger1() {
        int[] nums = new int[]{1, 2, 3, 2, 5};
        int answer = solution.missingInteger(nums);
        Assertions.assertThat(answer).isEqualTo(6);
    }

    @Test
    void missingInteger2() {
        int[] nums = new int[]{3, 4, 5, 1, 12, 14, 13};
        int answer = solution.missingInteger(nums);
        Assertions.assertThat(answer).isEqualTo(15);
    }

    @Test
    void missingInteger3() {
        int[] nums = new int[]{29, 30, 31, 32, 33, 34, 35, 36, 37};
        int answer = solution.missingInteger(nums);
        Assertions.assertThat(answer).isEqualTo(297);
    }

    @Test
    void missingInteger4() {
        int[] nums = new int[]{46,8,2,4,1,4,10,2,4,10,2,5,7,3,1};
        int answer = solution.missingInteger(nums);
        Assertions.assertThat(answer).isEqualTo(47);
    }

    @Test
    void missingInteger5() {
        int[] nums = new int[]{24,8,9};
        int answer = solution.missingInteger(nums);
        Assertions.assertThat(answer).isEqualTo(25);
    }
}