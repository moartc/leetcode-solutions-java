package solutions.algorithms._1000_1999._1979_Greatest_Common_Divisor_of_Array;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void findGCD1() {
        int[] nums = new int[]{2, 5, 6, 9, 10};
        int answer = solution.findGCD(nums);
        Assertions.assertThat(answer).isEqualTo(2);
    }

    @Test
    void findGCD2() {
        int[] nums = new int[]{7, 5, 6, 8, 3};
        int answer = solution.findGCD(nums);
        Assertions.assertThat(answer).isEqualTo(1);
    }

    @Test
    void findGCD3() {
        int[] nums = new int[]{3, 3};
        int answer = solution.findGCD(nums);
        Assertions.assertThat(answer).isEqualTo(3);
    }
}