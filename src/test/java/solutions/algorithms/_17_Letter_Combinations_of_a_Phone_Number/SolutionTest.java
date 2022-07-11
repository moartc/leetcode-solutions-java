package solutions.algorithms._17_Letter_Combinations_of_a_Phone_Number;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void letterCombinationsTest1() {
        String digits = "23";
        List<String> expected = List.of("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf");
        List<String> actual = solution.letterCombinations(digits);
        Assertions.assertThat(actual).containsExactlyInAnyOrderElementsOf(expected);
    }

    @Test
    void letterCombinationsTest2() {
        String digits = "23";
        List<String> expected = List.of("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf");
        List<String> actual = solution.letterCombinations(digits);
        Assertions.assertThat(actual).containsExactlyInAnyOrderElementsOf(expected);
    }

    @Test
    void letterCombinationsTest3() {
        String digits = "2";
        List<String> expected = List.of("a", "b", "c");
        List<String> actual = solution.letterCombinations(digits);
        Assertions.assertThat(actual).containsExactlyInAnyOrderElementsOf(expected);
    }

    @Test
    void letterCombinationsTest4() {
        String digits = "";
        List<String> expected = List.of();
        List<String> actual = solution.letterCombinations(digits);
        Assertions.assertThat(actual).containsExactlyInAnyOrderElementsOf(expected);
    }
}