package solutions.algorithms._1502_Can_Make_Arithmetic_Progression_From_Sequence;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {


    private final Solution solution = new Solution();

    @Test
    void canMakeArithmeticProgressionTest1() {
        int[] arr = new int[]{3, 5, 1};
        boolean actual = solution.canMakeArithmeticProgression(arr);
        Assertions.assertThat(actual).isEqualTo(true);
    }

    @Test
    void canMakeArithmeticProgressionTest2() {
        int[] arr = new int[]{1, 2, 4};
        boolean actual = solution.canMakeArithmeticProgression(arr);
        Assertions.assertThat(actual).isEqualTo(false);
    }
}