package solutions.algorithms._0_999._853_Car_Fleet;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void carFleetTest1() {

        int target = 12;
        int[] position = new int[]{10, 8, 0, 5, 3};
        int[] speed = new int[]{2, 4, 1, 1, 3};
        int output = solution.carFleet(target, position, speed);
        Assertions.assertThat(output).isEqualTo(3);
    }

    @Test
    void carFleetTest2() {

        int target = 10;
        int[] position = new int[]{3};
        int[] speed = new int[]{3};
        int output = solution.carFleet(target, position, speed);
        Assertions.assertThat(output).isEqualTo(1);
    }

    @Test
    void carFleetTest3() {

        int target = 100;
        int[] position = new int[]{0, 2, 4};
        int[] speed = new int[]{4, 2, 1};
        int output = solution.carFleet(target, position, speed);
        Assertions.assertThat(output).isEqualTo(1);
    }

    @Test
    void carFleetTest4() {

        int target = 10;
        int[] position = new int[]{0, 4, 2};
        int[] speed = new int[]{2, 1, 3};
        int output = solution.carFleet(target, position, speed);
        Assertions.assertThat(output).isEqualTo(1);
    }
}