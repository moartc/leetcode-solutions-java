package solutions.algorithms._2000_2999._2914_Minimum_Number_of_Changes_to_Make_Binary_String_Beautiful;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void minChanges1() {
        String s = "1001";
        int answer = solution.minChanges(s);
        Assertions.assertThat(answer).isEqualTo(2);
    }

    @Test
    void minChanges2() {
        String s = "10";
        int answer = solution.minChanges(s);
        Assertions.assertThat(answer).isEqualTo(1);
    }

    @Test
    void minChanges3() {
        String s = "0000";
        int answer = solution.minChanges(s);
        Assertions.assertThat(answer).isEqualTo(0);
    }

    @Test
    void minChanges4() {
        String s = "11000111";
        int answer = solution.minChanges(s);
        Assertions.assertThat(answer).isEqualTo(1);
    }
}