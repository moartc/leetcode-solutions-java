package solutions.algorithms._1000_1999._1689_Partitioning_Into_Minimum_Number_Of_Deci_Binary_Numbers;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void minPartitions1() {
        String n = "32";
        int answer = solution.minPartitions(n);
        Assertions.assertThat(answer).isEqualTo(3);
    }

    @Test
    void minPartitions2() {
        String n = "82734";
        int answer = solution.minPartitions(n);
        Assertions.assertThat(answer).isEqualTo(8);
    }

    @Test
    void minPartitions3() {
        String n = "27346209830709182346";
        int answer = solution.minPartitions(n);
        Assertions.assertThat(answer).isEqualTo(9);
    }
}