package solutions.algorithms._0_999._140_Word_Break_II;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

    private final Solution solution = new Solution();


    @Test
    void wordBreak1() {

        String s = "catsanddog";
        List<String> wordDict = List.of("cat", "cats", "and", "sand", "dog");

        List<String> answer = solution.wordBreak(s, wordDict);
        Assertions.assertThat(answer).containsExactlyInAnyOrder("cats and dog", "cat sand dog");
    }

    @Test
    void wordBreak2() {

        String s = "pineapplepenapple";
        List<String> wordDict = List.of("apple", "pen", "applepen", "pine", "pineapple");

        List<String> answer = solution.wordBreak(s, wordDict);
        Assertions.assertThat(answer).containsExactlyInAnyOrder("pine apple pen apple", "pineapple pen apple", "pine applepen apple");
    }

    @Test
    void wordBreak3() {

        String s = "catsandog";
        List<String> wordDict = List.of("cats", "dog", "sand", "and", "cat");

        List<String> answer = solution.wordBreak(s, wordDict);
        Assertions.assertThat(answer).isEmpty();
    }
}