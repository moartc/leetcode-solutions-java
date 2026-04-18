package solutions.algorithms._3000_3999._3783_Mirror_Distance_of_an_Integer;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void mirrorDistance1() {
        int n = 25;
        int answer = solution.mirrorDistance(n);
        Assertions.assertThat(answer).isEqualTo(27);
    }

    @Test
    void mirrorDistance2() {
        int n = 10;
        int answer = solution.mirrorDistance(n);
        Assertions.assertThat(answer).isEqualTo(9);
    }

    @Test
    void mirrorDistance3() {
        int n = 7;
        int answer = solution.mirrorDistance(n);
        Assertions.assertThat(answer).isEqualTo(0);
    }
}