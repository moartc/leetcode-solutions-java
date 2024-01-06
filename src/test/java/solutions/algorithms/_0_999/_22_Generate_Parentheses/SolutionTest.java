package solutions.algorithms._0_999._22_Generate_Parentheses;

import org.junit.jupiter.api.Test;
import solutions.algorithms._0_999._22_Generate_Parentheses.Solution;

import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

class SolutionTest {

    private Solution solution = new Solution();

    @Test
    void generateParenthesisTest1() {
        List<String> expected = List.of("((()))", "(()())", "(())()", "()(())", "()()()");
        List<String> actual = solution.generateParenthesis(3);
        assertThat(actual).containsExactlyInAnyOrderElementsOf(expected);
    }

    @Test
    void generateParenthesisTest2() {
        List<String> expected = List.of("()");
        List<String> actual = solution.generateParenthesis(1);
        assertThat(actual).containsExactlyInAnyOrderElementsOf(expected);
    }
}