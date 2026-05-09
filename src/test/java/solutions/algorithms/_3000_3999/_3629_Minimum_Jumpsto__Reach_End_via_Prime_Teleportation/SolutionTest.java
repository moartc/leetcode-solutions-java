package solutions.algorithms._3000_3999._3629_Minimum_Jumpsto__Reach_End_via_Prime_Teleportation;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void minJumps1() {
        int[] nums = new int[]{1, 2, 4, 6};
        int answer = solution.minJumps(nums);
        Assertions.assertThat(answer).isEqualTo(2);
    }

    @Test
    void minJumps2() {
        int[] nums = new int[]{2, 3, 4, 7, 9};
        int answer = solution.minJumps(nums);
        Assertions.assertThat(answer).isEqualTo(2);
    }

    @Test
    void minJumps3() {
        int[] nums = new int[]{4, 6, 5, 8};
        int answer = solution.minJumps(nums);
        Assertions.assertThat(answer).isEqualTo(3);
    }

}