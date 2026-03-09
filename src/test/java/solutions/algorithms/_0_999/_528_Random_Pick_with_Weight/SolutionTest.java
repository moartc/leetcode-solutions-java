package solutions.algorithms._0_999._528_Random_Pick_with_Weight;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void pickIndex1() {
        int[] w = new int[]{1};
        Solution solution = new Solution(w);
        int i = solution.pickIndex();
        Assertions.assertThat(i).isEqualTo(0);
    }
    // another test skipped, because the output in this problem might be random
}