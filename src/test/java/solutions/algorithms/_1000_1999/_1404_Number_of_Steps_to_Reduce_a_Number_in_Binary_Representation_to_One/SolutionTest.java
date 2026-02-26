package solutions.algorithms._1000_1999._1404_Number_of_Steps_to_Reduce_a_Number_in_Binary_Representation_to_One;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void numSteps1() {
        String s = "1101";
        int answer = solution.numSteps(s);
        Assertions.assertThat(answer).isEqualTo(6);
    }

    @Test
    void numSteps2() {
        String s = "10";
        int answer = solution.numSteps(s);
        Assertions.assertThat(answer).isEqualTo(1);
    }

    @Test
    void numSteps3() {
        String s = "1";
        int answer = solution.numSteps(s);
        Assertions.assertThat(answer).isEqualTo(0);
    }

    @Test
    void numSteps4() {
        String s = "1110";
        int answer = solution.numSteps(s);
        Assertions.assertThat(answer).isEqualTo(5);
    }
}