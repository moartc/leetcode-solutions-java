package solutions.algorithms._1000_1999._1621_Number_of_Sets_of_K_Non_Overlapping_Line_Segments;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void numberOfSets1() {
        int n = 4;
        int k = 2;
        int answer = solution.numberOfSets(n, k);
        Assertions.assertThat(answer).isEqualTo(5);
    }

    @Test
    void numberOfSets2() {
        int n = 3;
        int k = 1;
        int answer = solution.numberOfSets(n, k);
        Assertions.assertThat(answer).isEqualTo(3);
    }

    @Test
    void numberOfSets3() {
        int n = 30;
        int k = 7;
        int answer = solution.numberOfSets(n, k);
        Assertions.assertThat(answer).isEqualTo(796297179);
    }

    @Test
    void numberOfSets4() {
        int n = 1000;
        int k = 999;
        int answer = solution.numberOfSets(n, k);
        Assertions.assertThat(answer).isEqualTo(1);
    }
}