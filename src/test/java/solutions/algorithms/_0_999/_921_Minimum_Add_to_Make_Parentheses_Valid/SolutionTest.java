package solutions.algorithms._0_999._921_Minimum_Add_to_Make_Parentheses_Valid;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void minAddToMakeValid1() {
        String s = "())";
        int answer = solution.minAddToMakeValid(s);
        Assertions.assertThat(answer).isEqualTo(1);
    }

    @Test
    void minAddToMakeValid2() {
        String s = "(((";
        int answer = solution.minAddToMakeValid(s);
        Assertions.assertThat(answer).isEqualTo(3);
    }

    @Test
    void minAddToMakeValid3() {
        String s = "()))((";
        int answer = solution.minAddToMakeValid(s);
        Assertions.assertThat(answer).isEqualTo(4);
    }
}