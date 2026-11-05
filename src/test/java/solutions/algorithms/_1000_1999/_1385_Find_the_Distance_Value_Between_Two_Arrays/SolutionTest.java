package solutions.algorithms._1000_1999._1385_Find_the_Distance_Value_Between_Two_Arrays;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void findTheDistanceValue1() {
        int[] arr1 = new int[]{4, 5, 8};
        int[] arr2 = new int[]{10, 9, 1, 8};
        int d = 2;
        int answer = solution.findTheDistanceValue(arr1, arr2, d);
        Assertions.assertThat(answer).isEqualTo(2);
    }

    @Test
    void findTheDistanceValue2() {
        int[] arr1 = new int[]{1, 4, 2, 3};
        int[] arr2 = new int[]{-4, -3, 6, 10, 20, 30};
        int d = 3;
        int answer = solution.findTheDistanceValue(arr1, arr2, d);
        Assertions.assertThat(answer).isEqualTo(2);
    }

    @Test
    void findTheDistanceValue3() {
        int[] arr1 = new int[]{2, 1, 100, 3};
        int[] arr2 = new int[]{-5, -2, 10, -3, 7};
        int d = 6;
        int answer = solution.findTheDistanceValue(arr1, arr2, d);
        Assertions.assertThat(answer).isEqualTo(1);
    }
}