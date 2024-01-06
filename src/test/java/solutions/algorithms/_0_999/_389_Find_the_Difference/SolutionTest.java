package solutions.algorithms._0_999._389_Find_the_Difference;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import solutions.algorithms._0_999._389_Find_the_Difference.Solution;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void findTheDifferenceTest1() {
        String  s = "abcd";
        String t = "abcde";
        char expected =  'e';
        char actual = solution.findTheDifference(s, t);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void findTheDifferenceTest2() {
        String  s = "";
        String t = "y";
        char expected =  'y';
        char actual = solution.findTheDifference(s, t);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void findTheDifferenceTest3() {
        String  s = "abcd";
        String t = "dceba";
        char expected =  'e';
        char actual = solution.findTheDifference(s, t);
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void findTheDifferenceTest4() {
        String  s = "ae";
        String t = "aea";
        char expected =  'a';
        char actual = solution.findTheDifference(s, t);
        Assertions.assertThat(actual).isEqualTo(expected);
    }
}