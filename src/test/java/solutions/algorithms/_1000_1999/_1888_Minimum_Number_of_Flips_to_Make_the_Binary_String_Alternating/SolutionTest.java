package solutions.algorithms._1000_1999._1888_Minimum_Number_of_Flips_to_Make_the_Binary_String_Alternating;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void minFlips1() {
        String s = "111000";
        int answer = solution.minFlips(s);
        Assertions.assertThat(answer).isEqualTo(2);
    }

    @Test
    void minFlips2() {
        String s = "010";
        int answer = solution.minFlips(s);
        Assertions.assertThat(answer).isEqualTo(0);
    }

    @Test
    void minFlips3() {
        String s = "1110";
        int answer = solution.minFlips(s);
        Assertions.assertThat(answer).isEqualTo(1);
    }

    @Test
    void minFlips4() {
        String s = "01001001101";
        int answer = solution.minFlips(s);
        Assertions.assertThat(answer).isEqualTo(2);
    }
}