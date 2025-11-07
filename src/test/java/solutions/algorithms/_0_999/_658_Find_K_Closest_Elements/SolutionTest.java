package solutions.algorithms._0_999._658_Find_K_Closest_Elements;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void findClosestElements1() {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int k = 4;
        int x = 3;
        List<Integer> answer = solution.findClosestElements(arr, k, x);

        Assertions.assertThat(answer).containsExactly(1, 2, 3, 4);
    }

    @Test
    void findClosestElements2() {
        int[] arr = new int[]{1, 1, 2, 3, 4, 5};
        int k = 4;
        int x = -1;
        List<Integer> answer = solution.findClosestElements(arr, k, x);

        Assertions.assertThat(answer).containsExactly(1, 1, 2, 3);
    }

    @Test
    void findClosestElements3() {
        int[] arr = new int[]{1, 2};
        int k = 1;
        int x = 1;
        List<Integer> answer = solution.findClosestElements(arr, k, x);

        Assertions.assertThat(answer).containsExactly(1);
    }

    @Test
    void findClosestElements4() {
        int[] arr = new int[]{1, 1, 1, 10, 10, 10};
        int k = 1;
        int x = 9;
        List<Integer> answer = solution.findClosestElements(arr, k, x);

        Assertions.assertThat(answer).containsExactly(10);
    }

    @Test
    void findClosestElements5() {
        int[] arr = new int[]{0, 0, 1, 2, 3, 3, 4, 7, 7, 8};
        int k = 3;
        int x = 5;
        List<Integer> answer = solution.findClosestElements(arr, k, x);

        Assertions.assertThat(answer).containsExactly(3, 3, 4);
    }

    @Test
    void findClosestElements6() {
        int[] arr = new int[]{0,0,0,1,3,5,6,7,8,8};
        int k = 2;
        int x = 2;
        List<Integer> answer = solution.findClosestElements(arr, k, x);

        Assertions.assertThat(answer).containsExactly(1, 3);
    }



}