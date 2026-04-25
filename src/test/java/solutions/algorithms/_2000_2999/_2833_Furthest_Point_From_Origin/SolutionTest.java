package solutions.algorithms._2000_2999._2833_Furthest_Point_From_Origin;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void furthestDistanceFromOrigin1() {
        String moves = "L_RL__R";
        int answer = solution.furthestDistanceFromOrigin(moves);
        Assertions.assertThat(answer).isEqualTo(3);
    }

    @Test
    void furthestDistanceFromOrigin2() {
        String moves = "_R__LL_";
        int answer = solution.furthestDistanceFromOrigin(moves);
        Assertions.assertThat(answer).isEqualTo(5);
    }

    @Test
    void furthestDistanceFromOrigin3() {
        String moves = "_______";
        int answer = solution.furthestDistanceFromOrigin(moves);
        Assertions.assertThat(answer).isEqualTo(7);
    }
}