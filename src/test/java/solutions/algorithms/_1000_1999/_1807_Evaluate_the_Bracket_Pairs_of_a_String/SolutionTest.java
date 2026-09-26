package solutions.algorithms._1000_1999._1807_Evaluate_the_Bracket_Pairs_of_a_String;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void evaluate1() {
        String s = "(name)is(age)yearsold";
        List<List<String>> knowledge = List.of(
                List.of("name", "bob"),
                List.of("age", "two")
        );
        String answer = solution.evaluate(s, knowledge);
        Assertions.assertThat(answer).isEqualTo("bobistwoyearsold");
    }

    @Test
    void evaluate2() {
        String s = "hi(name)";
        List<List<String>> knowledge = List.of(
                List.of("a", "b")
        );
        String answer = solution.evaluate(s, knowledge);
        Assertions.assertThat(answer).isEqualTo("hi?");
    }

    @Test
    void evaluate3() {
        String s = "(a)(a)(a)aaa";
        List<List<String>> knowledge = List.of(
                List.of("a", "yes")
        );
        String answer = solution.evaluate(s, knowledge);
        Assertions.assertThat(answer).isEqualTo("yesyesyesaaa");
    }

}