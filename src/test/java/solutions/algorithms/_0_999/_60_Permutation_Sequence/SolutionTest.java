package solutions.algorithms._0_999._60_Permutation_Sequence;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void getPermutation1() {
        int n = 3;
        int k = 3;
        String answer = solution.getPermutation(n, k);
        Assertions.assertThat(answer).isEqualTo("213");
    }

    @Test
    void getPermutation2() {
        int n = 4;
        int k = 9;
        String answer = solution.getPermutation(n, k);
        Assertions.assertThat(answer).isEqualTo("2314");
    }

    @Test
    void getPermutation3() {
        int n = 3;
        int k = 1;
        String answer = solution.getPermutation(n, k);
        Assertions.assertThat(answer).isEqualTo("123");
    }
}