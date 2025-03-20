package solutions.algorithms._0_999._347_Top_K_Frequent_Elements;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void topKFrequentTest1() {

        int[] nums = new int[]{1, 1, 1, 2, 2, 3};
        int k = 2;

        int[] actual = solution.topKFrequent(nums, k);

        int[] expected = new int[]{1, 2};
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void topKFrequentTest2() {

        int[] nums = new int[]{1};
        int k = 1;

        int[] actual = solution.topKFrequent(nums, k);

        int[] expected = new int[]{1};
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void topKFrequentTest3() {

        int[] nums = new int[]{-1, -1};
        int k = 1;

        int[] actual = solution.topKFrequent(nums, k);

        int[] expected = new int[]{-1};
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}