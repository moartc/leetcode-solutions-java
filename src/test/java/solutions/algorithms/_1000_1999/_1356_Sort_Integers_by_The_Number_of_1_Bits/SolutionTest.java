package solutions.algorithms._1000_1999._1356_Sort_Integers_by_The_Number_of_1_Bits;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sortByBits1() {
        int[] arr = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8};
        int[] answer = solution.sortByBits(arr);
        Assertions.assertThat(answer).containsExactly(0, 1, 2, 4, 8, 3, 5, 6, 7);
    }

    @Test
    void sortByBits2() {
        int[] arr = new int[]{1024, 512, 256, 128, 64, 32, 16, 8, 4, 2, 1};
        int[] answer = solution.sortByBits(arr);
        Assertions.assertThat(answer).containsExactly(1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024);
    }
}