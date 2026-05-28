package solutions.algorithms._3000_3999._3093_Longest_Common_Suffix_Queries;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void stringIndices1() {
        String[] wordsContainer = new String[]{"abcd", "bcd", "xbcd"};
        String[] wordsQuery = new String[]{"cd", "bcd", "xyz"};
        int[] answer = solution.stringIndices(wordsContainer, wordsQuery);
        Assertions.assertThat(answer).containsExactly(1, 1, 1);
    }

    @Test
    void stringIndices2() {
        String[] wordsContainer = new String[]{"abcdefgh", "poiuygh", "ghghgh"};
        String[] wordsQuery = new String[]{"gh", "acbfgh", "acbfegh"};
        int[] answer = solution.stringIndices(wordsContainer, wordsQuery);
        Assertions.assertThat(answer).containsExactly(2, 0, 2);
    }

    @Test
    void stringIndices3() {
        String[] wordsContainer = new String[]{"a", "b"};
        String[] wordsQuery = new String[]{"a", "b"};
        int[] answer = solution.stringIndices(wordsContainer, wordsQuery);
        Assertions.assertThat(answer).containsExactly(0, 1);
    }

    @Test
    void stringIndices4() {
        String[] wordsContainer = new String[]{"abcde", "abcde"};
        String[] wordsQuery = new String[]{"abcde", "bcde", "cde", "de", "e"};
        int[] answer = solution.stringIndices(wordsContainer, wordsQuery);
        Assertions.assertThat(answer).containsExactly(0, 0, 0, 0, 0);
    }

    @Test
    void stringIndices5() {
        String[] wordsContainer = new String[]{"abc", "bca", "cab", "abb", "bac"};
        String[] wordsQuery = new String[]{"a", "b", "c", "aa", "ab", "ac", "ba", "bb", "bc", "ca", "cb", "cc", "aaa", "aab", "aac", "aba", "abb", "abc", "aca", "acb", "acc", "baa", "bab", "bac", "bba", "bbb", "bbc", "bca", "bcb", "bcc", "caa", "cab", "cac", "cba", "cbb", "cbc", "cca", "ccb", "ccc"};
        int[] answer = solution.stringIndices(wordsContainer, wordsQuery);
        Assertions.assertThat(answer).containsExactly(1, 2, 0, 1, 2, 4, 1, 3, 0, 1, 2, 0, 1, 2, 4, 1, 3, 0, 1, 2, 0, 1, 2, 4, 1, 3, 0, 1, 2,
                0, 1, 2, 4, 1, 3, 0, 1, 2, 0);
    }
}