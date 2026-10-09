package solutions.algorithms._1000_1999._1541_Minimum_Insertions_to_Balance_a_Parentheses_String;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void minInsertions1() {
        String s = "(()))";
        int answer = solution.minInsertions(s);
        Assertions.assertThat(answer).isEqualTo(1);
    }

    @Test
    void minInsertions2() {
        String s = "())";
        int answer = solution.minInsertions(s);
        Assertions.assertThat(answer).isEqualTo(0);
    }

    @Test
    void minInsertions3() {
        String s = "))())(";
        int answer = solution.minInsertions(s);
        Assertions.assertThat(answer).isEqualTo(3);
    }

    @Test
    void minInsertions4() { // mixed case
        String s = ")";
        int answer = solution.minInsertions(s);
        Assertions.assertThat(answer).isEqualTo(2);
    }

    @Test
    void minInsertions5() {
        String s = "(()))(()))()())))";
        int answer = solution.minInsertions(s);
        Assertions.assertThat(answer).isEqualTo(4);
    }

    @Test
    void minInsertions6() {
        String s = "())";
        int answer = solution.minInsertions(s);
        Assertions.assertThat(answer).isEqualTo(0);
    }
    @Test
    void minInsertions7() {
        String s = "())(())))";
        int answer = solution.minInsertions(s);
        Assertions.assertThat(answer).isEqualTo(0);
    }
    @Test
    void minInsertions8() {
        String s = "(())())))";
        int answer = solution.minInsertions(s);
        Assertions.assertThat(answer).isEqualTo(0);
    }

}