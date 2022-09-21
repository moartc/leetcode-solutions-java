package solutions.algorithms._139_Word_Break;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void wordBreakTest1() {
        String s = "leetcode";
        List<String> wordDict = List.of("leet", "code");
        Assertions.assertThat(solution.wordBreak(s, wordDict)).isTrue();
    }

    @Test
    void wordBreakTest2() {
        String s = "applepenapple";
        List<String> wordDict = List.of("apple", "pen");
        Assertions.assertThat(solution.wordBreak(s, wordDict)).isTrue();
    }

    @Test
    void wordBreakTest3() {
        String s = "catsandog";
        List<String> wordDict = List.of("cats", "dog", "sand", "and", "cat");
        Assertions.assertThat(solution.wordBreak(s, wordDict)).isFalse();
    }

    @Test
    void wordBreakTest4() {
        String s = "abcxyz";
        List<String> wordDict = List.of("abc", "q", "abcxyz");
        Assertions.assertThat(solution.wordBreak(s, wordDict)).isTrue();
    }

    @Test
    void wordBreakTest5() {
        String s = "ccbb";
        List<String> wordDict = List.of("bc", "cb");
        Assertions.assertThat(solution.wordBreak(s, wordDict)).isFalse();
    }
}