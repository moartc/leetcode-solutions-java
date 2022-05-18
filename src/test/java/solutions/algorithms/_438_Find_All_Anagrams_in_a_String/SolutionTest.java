package solutions.algorithms._438_Find_All_Anagrams_in_a_String;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void findAnagramsTest1() {
        String s = "cbaebabacd", p = "abc";
        List<Integer> expected = List.of(0, 6);
        Assertions.assertThat(solution.findAnagrams(s, p)).isEqualTo(expected);
    }

    @Test
    void findAnagramsTest2() {
        String s = "abab", p = "ab";
        List<Integer> expected = List.of(0, 1, 2);
        Assertions.assertThat(solution.findAnagrams(s, p)).isEqualTo(expected);
    }

    @Test
    void findAnagramsTest3() {
        String s = "abcaavvccqwe", p = "aa";
        List<Integer> expected = List.of(3);
        Assertions.assertThat(solution.findAnagrams(s, p)).isEqualTo(expected);
    }

    @Test
    void findAnagramsTest4() {
        String s = "abcaavvccqwe", p = "za";
        List<Integer> expected = List.of();
        Assertions.assertThat(solution.findAnagrams(s, p)).isEqualTo(expected);
    }
}