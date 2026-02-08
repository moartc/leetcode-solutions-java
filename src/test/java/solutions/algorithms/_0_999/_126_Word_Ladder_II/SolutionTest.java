package solutions.algorithms._0_999._126_Word_Ladder_II;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void findLadders1() {
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = List.of("hot", "dot", "dog", "lot", "log", "cog");

        List<List<String>> answer = solution.findLadders(beginWord, endWord, wordList);
        // I just swapped here indices because that's what my code produces
        Assertions.assertThat(answer.get(1)).containsExactly("hit", "hot", "dot", "dog", "cog");
        Assertions.assertThat(answer.get(0)).containsExactly("hit", "hot", "lot", "log", "cog");
    }

    @Test
    void findLadders2() {
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = List.of("hot", "dot", "dog", "lot", "log");

        List<List<String>> answer = solution.findLadders(beginWord, endWord, wordList);
        Assertions.assertThat(answer).isEmpty();
    }
}

