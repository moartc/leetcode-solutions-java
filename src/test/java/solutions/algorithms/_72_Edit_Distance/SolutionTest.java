package solutions.algorithms._72_Edit_Distance;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void minDistanceTest1() {
        String word1 = "horse";
        String word2 = "ros";
        int actual = solution.minDistance(word1, word2);
        Assertions.assertThat(actual).isEqualTo(3);
    }

    @Test
    void minDistanceTest2() {
        String word1 = "intention";
        String word2 = "execution";
        int actual = solution.minDistance(word1, word2);
        Assertions.assertThat(actual).isEqualTo(5);
    }

    @Test
    void minDistanceTest3() {
        String word1 = "xabc";
        String word2 = "abcy";
        int actual = solution.minDistance(word1, word2);
        Assertions.assertThat(actual).isEqualTo(2);
    }

    @Test
    void minDistanceTest4() {
        String word1 = "xabc";
        String word2 = "abc";
        int actual = solution.minDistance(word1, word2);
        Assertions.assertThat(actual).isEqualTo(1);
    }

    @Test
    void minDistanceTest5() {
        String word1 = "abc";
        String word2 = "xabc";
        int actual = solution.minDistance(word1, word2);
        Assertions.assertThat(actual).isEqualTo(1);
    }

    @Test
    void minDistanceTest6() {
        String word1 = "abcde";
        String word2 = "xabcde";
        int actual = solution.minDistance(word1, word2);
        Assertions.assertThat(actual).isEqualTo(1);
    }

    @Test
    void minDistanceTest12() {
        String word1 = "intenti";
        String word2 = "executi";
        int actual = solution.minDistance(word1, word2);
        Assertions.assertThat(actual).isEqualTo(5);
    }

    @Test
    void minDistanceTest13() {
        String word1 = "testabc";
        String word2 = "test";
        int actual = solution.minDistance(word1, word2);
        Assertions.assertThat(actual).isEqualTo(3);
    }

    @Test
    void minDistanceTest14() {
        String word1 = "test";
        String word2 = "testabc";
        int actual = solution.minDistance(word1, word2);
        Assertions.assertThat(actual).isEqualTo(3);
    }

    @Test
    void minDistanceTest15() {
        String word1 = "axyz";
        String word2 = "axbyxz";
        int actual = solution.minDistance(word1, word2);
        Assertions.assertThat(actual).isEqualTo(2);
    }

    @Test
    void minDistanceTest16() {
        String word1 = "";
        String word2 = "ab";
        int actual = solution.minDistance(word1, word2);
        Assertions.assertThat(actual).isEqualTo(2);
    }

    @Test
    void minDistanceTest17() {
        String word1 = "ab";
        String word2 = "";
        int actual = solution.minDistance(word1, word2);
        Assertions.assertThat(actual).isEqualTo(2);
    }

    @Test
    void minDistanceTest18() {
        String word1 = "";
        String word2 = "";
        int actual = solution.minDistance(word1, word2);
        Assertions.assertThat(actual).isEqualTo(0);
    }

    @Test
    void minDistanceTest19() {
        String word1 = "zoologicoarchaeologist";
        String word2 = "zoogeologist";
        int actual = solution.minDistance(word1, word2);
        Assertions.assertThat(actual).isEqualTo(10);
    }

    @Test
    void minDistanceTest20() {
        String word1 = "xx";
        String word2 = "xxxxx";
        int actual = solution.minDistance(word1, word2);
        Assertions.assertThat(actual).isEqualTo(2);
    }

}