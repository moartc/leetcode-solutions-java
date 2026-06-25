package solutions.algorithms._3000_3999._3737_Count_Subarrays_With_Majority_Element_I;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void countMajoritySubarrays1() {
        int[] nums = new int[]{1, 2, 2, 3};
        int target = 2;
        int answer = solution.countMajoritySubarrays(nums, target);
        Assertions.assertThat(answer).isEqualTo(5);
    }

    @Test
    void countMajoritySubarrays2() {
        int[] nums = new int[]{1, 1, 1, 1};
        int target = 1;
        int answer = solution.countMajoritySubarrays(nums, target);
        Assertions.assertThat(answer).isEqualTo(10);
    }

    @Test
    void countMajoritySubarrays3() {
        int[] nums = new int[]{1, 2, 3};
        int target = 4;
        int answer = solution.countMajoritySubarrays(nums, target);
        Assertions.assertThat(answer).isEqualTo(0);
    }
}