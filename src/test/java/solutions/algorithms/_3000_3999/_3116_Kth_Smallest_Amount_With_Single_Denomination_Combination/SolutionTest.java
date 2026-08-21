package solutions.algorithms._3000_3999._3116_Kth_Smallest_Amount_With_Single_Denomination_Combination;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void findKthSmallest1() {
        int[] coins = new int[]{3, 6, 9};
        int k = 3;
        long answer = solution.findKthSmallest(coins, k);
        Assertions.assertThat(answer).isEqualTo(9);
    }

    @Test
    void findKthSmallest2() {
        int[] coins = new int[]{5, 2};
        int k = 7;
        long answer = solution.findKthSmallest(coins, k);
        Assertions.assertThat(answer).isEqualTo(12);
    }
}