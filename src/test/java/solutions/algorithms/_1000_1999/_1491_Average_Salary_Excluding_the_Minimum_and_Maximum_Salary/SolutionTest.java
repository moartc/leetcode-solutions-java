package solutions.algorithms._1000_1999._1491_Average_Salary_Excluding_the_Minimum_and_Maximum_Salary;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void averageTest1() {
        int[] input = new int[]{4000, 3000, 1000, 2000};
        double expected = 2500.00000;
        Assertions.assertThat(solution.average(input)).isEqualTo(expected);
    }

    @Test
    void averageTest2() {
        int[] input = new int[]{1000, 2000, 3000};
        double expected = 2000.00000;
        Assertions.assertThat(solution.average(input)).isEqualTo(expected);
    }
}