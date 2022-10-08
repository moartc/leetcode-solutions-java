package solutions.algorithms._583_Delete_Operation_for_Two_Strings;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void minDistanceTest1() {
        String word1 = "sea";
        String word2 = "eat";
        Assertions.assertThat(solution.minDistance(word1, word2)).isEqualTo(2);
    }

    @Test
    void minDistanceTest2() {
        String word1 = "leetcode";
        String word2 = "etco";
        Assertions.assertThat(solution.minDistance(word1, word2)).isEqualTo(4);
    }

    @Test
    void minDistanceTest3() {
        String word1 = "zxcabqwer";
        String word2 = "yuiatbnm";
        Assertions.assertThat(solution.minDistance(word1, word2)).isEqualTo(13);
    }

}