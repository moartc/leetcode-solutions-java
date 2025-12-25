package solutions.algorithms._0_999._698_Partition_to_K_Equal_Sum_Subsets;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void canPartitionKSubsets1() {

        int[] nums = new int[]{4, 3, 2, 3, 5, 2, 1};
        int k = 4;
        boolean answer = solution.canPartitionKSubsets(nums, k);
        Assertions.assertThat(answer).isTrue();
    }

    @Test
    void canPartitionKSubsets2() {

        int[] nums = new int[]{1, 2, 3, 4};
        int k = 3;
        boolean answer = solution.canPartitionKSubsets(nums, k);
        Assertions.assertThat(answer).isFalse();
    }

    @Test
    void canPartitionKSubsets3() {

        int[] nums = new int[]{10, 1, 10, 9, 6, 1, 9, 5, 9, 10, 7, 8, 5, 2, 10, 8};
        int k = 11;
        boolean answer = solution.canPartitionKSubsets(nums, k);
        Assertions.assertThat(answer).isFalse();
    }

    @Test
    void canPartitionKSubsets4() {

        int[] nums = new int[]{4, 5, 9, 3, 10, 2, 10, 7, 10, 8, 5, 9, 4, 6, 4, 9};
        int k = 5;
        boolean answer = solution.canPartitionKSubsets(nums, k);
        Assertions.assertThat(answer).isTrue();
    }

}