package solutions.algorithms._242_Valid_Anagram;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void isAnagramTest1() {
        String s = "anagram";
        String t = "nagaram";
        Assertions.assertThat(solution.isAnagram(s,t)).isTrue();
    }

    @Test
    void isAnagramTest2() {
        String s = "rat";
        String t = "car";
        Assertions.assertThat(solution.isAnagram(s,t)).isFalse();
    }
}