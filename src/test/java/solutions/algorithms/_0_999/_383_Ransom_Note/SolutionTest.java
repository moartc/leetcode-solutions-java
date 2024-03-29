package solutions.algorithms._0_999._383_Ransom_Note;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void canConstructTest1() {
        String ransomNote = "a", magazine = "b";
        Assertions.assertThat(solution.canConstruct(ransomNote,magazine)).isFalse();
    }

    @Test
    void canConstructTest2() {
        String ransomNote = "aa", magazine = "ab";
        Assertions.assertThat(solution.canConstruct(ransomNote,magazine)).isFalse();
    }

    @Test
    void canConstructTest3() {
        String ransomNote = "aa", magazine = "aab";
        Assertions.assertThat(solution.canConstruct(ransomNote,magazine)).isTrue();
    }
}