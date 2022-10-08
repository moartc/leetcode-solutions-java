package solutions.algorithms._72_Edit_Distance;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void minDistanceTest1() {
        String word1 = "horse";
        String word2 = "ros";
        int actual= solution.minDistance(word1, word2);
        Assertions.assertThat(actual).isEqualTo(3);
    }

    @Test
    void minDistanceTest2() {
        String word1 = "intention";
        String word2 = "execution";
        int actual= solution.minDistance(word1, word2);
        Assertions.assertThat(actual).isEqualTo(5);
    }
}