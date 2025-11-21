package solutions.algorithms._1000_1999._1095_Find_in_Mountain_Array;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void findInMountainArray1() {
        int[] arr = new int[]{1, 2, 3, 4, 5, 3, 1};
        int target = 3;
        MountainArray ma = new MountainArray(arr);
        int answer = solution.findInMountainArray(target, ma);
        Assertions.assertThat(answer).isEqualTo(2);
    }

    @Test
    void findInMountainArray2() {
        int[] arr = new int[]{0, 1, 2, 4, 2, 1};
        int target = 3;
        MountainArray ma = new MountainArray(arr);
        int answer = solution.findInMountainArray(target, ma);
        Assertions.assertThat(answer).isEqualTo(-1);
    }

    @Test
    void findInMountainArray3() {
        int[] arr = new int[]{1, 2, 3, 4, 5, 3, 1};
        int target = 2;
        MountainArray ma = new MountainArray(arr);
        int answer = solution.findInMountainArray(target, ma);
        Assertions.assertThat(answer).isEqualTo(1);
    }

    @Test
    void findInMountainArray4() {
        int[] arr = new int[]{1, 5, 2};
        int target = 5;
        MountainArray ma = new MountainArray(arr);
        int answer = solution.findInMountainArray(target, ma);
        Assertions.assertThat(answer).isEqualTo(1);
    }

    @Test
    void findInMountainArray5() {
        int[] arr = new int[]{0, 5, 3, 1};
        int target = 1;
        MountainArray ma = new MountainArray(arr);
        int answer = solution.findInMountainArray(target, ma);
        Assertions.assertThat(answer).isEqualTo(3);
    }
}