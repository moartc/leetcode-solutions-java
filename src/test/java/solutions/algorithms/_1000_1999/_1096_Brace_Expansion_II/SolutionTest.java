package solutions.algorithms._1000_1999._1096_Brace_Expansion_II;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {
    private Solution solution = new Solution();


    @Test
    void braceExpansionII1() {
        String expression = "{a,b}{c,{d,e}}";
        List<String> answer = solution.braceExpansionII(expression);
        Assertions.assertThat(answer).containsExactly("ac", "ad", "ae", "bc", "bd", "be");
    }

    @Test
    void braceExpansionII2() {
        String expression = "{{a,z},a{b,c},{ab,z}}";
        List<String> answer = solution.braceExpansionII(expression);
        Assertions.assertThat(answer).containsExactly("a", "ab", "ac", "z");
    }

    @Test
    void braceExpansionII3() {
        String expression = "{{a,z},a}";
        List<String> answer = solution.braceExpansionII(expression);
        Assertions.assertThat(answer).containsExactly("a", "z");
    }

    @Test
    void braceExpansionII4() {
        String expression = "{{a,b}c}";
        List<String> answer = solution.braceExpansionII(expression);
        Assertions.assertThat(answer).containsExactly("ac", "bc");
    }

    @Test
    void braceExpansionII5() {
        String expression = "{a{b,c}}";
        List<String> answer = solution.braceExpansionII(expression);
        Assertions.assertThat(answer).containsExactly("ab", "ac");
    }

    @Test
    void braceExpansionII6() {
        String expression = "{a,b}";
        List<String> answer = solution.braceExpansionII(expression);
        Assertions.assertThat(answer).containsExactly("a", "b");
    }
}