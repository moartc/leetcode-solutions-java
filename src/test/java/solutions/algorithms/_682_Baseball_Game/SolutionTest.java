package solutions.algorithms._682_Baseball_Game;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void calPointsTest1() {
        String[] operations = new String[]{"5", "2", "C", "D", "+"};
        int result = solution.calPoints(operations);
        Assertions.assertThat(result).isEqualTo(30);
    }

    @Test
    void calPointsTest2() {
        String[] operations = new String[]{"5", "-2", "4", "C", "D", "9", "+", "+"};
        int result = solution.calPoints(operations);
        Assertions.assertThat(result).isEqualTo(27);
    }

    @Test
    void calPointsTest3() {
        String[] operations = new String[]{"1", "C"};
        int result = solution.calPoints(operations);
        Assertions.assertThat(result).isEqualTo(0);
    }
}