package solutions.algorithms._1000_1999._1758_Minimum_Changes_To_Make_Alternating_Binary_String;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void minOperations1() {
        String s = "0100";
        int answer = solution.minOperations(s);
        Assertions.assertThat(answer).isEqualTo(1);
    }

    @Test
    void minOperations2() {
        String s = "10";
        int answer = solution.minOperations(s);
        Assertions.assertThat(answer).isEqualTo(0);
    }

    @Test
    void minOperations3() {
        String s = "1111";
        int answer = solution.minOperations(s);
        Assertions.assertThat(answer).isEqualTo(2);
    }
}