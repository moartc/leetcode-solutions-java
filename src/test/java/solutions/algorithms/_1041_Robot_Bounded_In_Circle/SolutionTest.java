package solutions.algorithms._1041_Robot_Bounded_In_Circle;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void isRobotBoundedTest1() {
        boolean actual = solution.isRobotBounded("GGLLGG");
        Assertions.assertThat(actual).isTrue();
    }

    @Test
    void isRobotBoundedTest2() {
        boolean actual = solution.isRobotBounded("GG");
        Assertions.assertThat(actual).isFalse();
    }

    @Test
    void isRobotBoundedTest3() {
        boolean actual = solution.isRobotBounded("GL");
        Assertions.assertThat(actual).isTrue();
    }
}