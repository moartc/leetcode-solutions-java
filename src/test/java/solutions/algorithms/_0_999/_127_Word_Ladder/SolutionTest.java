package solutions.algorithms._0_999._127_Word_Ladder;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void ladderLength1() {
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = List.of("hot", "dot", "dog", "lot", "log", "cog");

        int answer = solution.ladderLength(beginWord, endWord, wordList);

        Assertions.assertThat(answer).isEqualTo(5);
    }

    @Test
    void ladderLength2() {
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = List.of("hot", "dot", "dog", "lot", "log");

        int answer = solution.ladderLength(beginWord, endWord, wordList);

        Assertions.assertThat(answer).isEqualTo(0);
    }

    @Test
    void ladderLength3() {
        String beginWord = "a";
        String endWord = "c";
        List<String> wordList = List.of("a", "b", "c");

        int answer = solution.ladderLength(beginWord, endWord, wordList);

        Assertions.assertThat(answer).isEqualTo(2);
    }

    @Test
    void ladderLength4() {
        String beginWord = "red";
        String endWord = "tax";
        List<String> wordList = List.of("ted", "tex", "red", "tax", "tad", "den", "rex", "pee");

        int answer = solution.ladderLength(beginWord, endWord, wordList);

        // red ted tad tax
        Assertions.assertThat(answer).isEqualTo(4);
    }

    @Test
    void ladderLength5() {
        String beginWord = "hot";
        String endWord = "dog";
        List<String> wordList = List.of("hot", "dog", "dot");

        int answer = solution.ladderLength(beginWord, endWord, wordList);

        Assertions.assertThat(answer).isEqualTo(3);
    }
}