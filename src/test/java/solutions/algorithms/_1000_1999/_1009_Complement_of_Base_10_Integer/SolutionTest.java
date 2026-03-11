package solutions.algorithms._1000_1999._1009_Complement_of_Base_10_Integer;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void bitwiseComplement1() {
        int n = 5;
        int answer = solution.bitwiseComplement(n);
        Assertions.assertThat(answer).isEqualTo(2);
    }

    @Test
    void bitwiseComplement2() {
        int n = 7;
        int answer = solution.bitwiseComplement(n);
        Assertions.assertThat(answer).isEqualTo(0);
    }

    @Test
    void bitwiseComplement3() {
        int n = 10;
        int answer = solution.bitwiseComplement(n);
        Assertions.assertThat(answer).isEqualTo(5);
    }

}