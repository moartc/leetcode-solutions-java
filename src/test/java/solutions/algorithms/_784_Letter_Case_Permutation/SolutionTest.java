package solutions.algorithms._784_Letter_Case_Permutation;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void letterCasePermutationTest1() {
        String s = "a1b2";
        List<String> expected = List.of("a1b2", "a1B2", "A1b2", "A1B2");
        Assertions.assertThat(solution.letterCasePermutation(s)).hasSameElementsAs(expected);
    }

    @Test
    void letterCasePermutationTest2() {
        String s = "3z4";
        List<String> expected = List.of("3z4", "3Z4");
        Assertions.assertThat(solution.letterCasePermutation(s)).hasSameElementsAs(expected);
    }

    @Test
    void letterCasePermutationTest3() {
        String s = "3";
        List<String> expected = List.of("3");
        Assertions.assertThat(solution.letterCasePermutation(s)).hasSameElementsAs(expected);
    }

    @Test
    void letterCasePermutationTest4() {
        String s = "34";
        List<String> expected = List.of("34");
        Assertions.assertThat(solution.letterCasePermutation(s)).hasSameElementsAs(expected);
    }

    @Test
    void letterCasePermutationTest5() {
        String s = "a";
        List<String> expected = List.of("a", "A");
        Assertions.assertThat(solution.letterCasePermutation(s)).hasSameElementsAs(expected);
    }

    @Test
    void letterCasePermutationTest6() {
        String s = "ab";
        List<String> expected = List.of("ab","Ab","aB","AB");
        Assertions.assertThat(solution.letterCasePermutation(s)).hasSameElementsAs(expected);
    }
}