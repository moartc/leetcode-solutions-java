package solutions.algorithms._3000_3999._3498_Reverse_Degree_of_a_String;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void reverseDegree1() {
        String s = "abc";
        int answer = solution.reverseDegree(s);
        Assertions.assertThat(answer).isEqualTo(148);
    }

    @Test
    void reverseDegree2() {
        String s = "zaza";
        int answer = solution.reverseDegree(s);
        Assertions.assertThat(answer).isEqualTo(160);
    }
}