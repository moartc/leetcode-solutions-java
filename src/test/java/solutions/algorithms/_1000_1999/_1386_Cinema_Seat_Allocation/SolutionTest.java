package solutions.algorithms._1000_1999._1386_Cinema_Seat_Allocation;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void maxNumberOfFamilies1() {
        int n = 3;
        int[][] reservedSeats = new int[][]{{1, 2}, {1, 3}, {1, 8}, {2, 6}, {3, 1}, {3, 10}};
        int answer = solution.maxNumberOfFamilies(n, reservedSeats);
        Assertions.assertThat(answer).isEqualTo(4);
    }

    @Test
    void maxNumberOfFamilies2() {
        int n = 2;
        int[][] reservedSeats = new int[][]{{2, 1}, {1, 8}, {2, 6}};
        int answer = solution.maxNumberOfFamilies(n, reservedSeats);
        Assertions.assertThat(answer).isEqualTo(2);
    }

    @Test
    void maxNumberOfFamilies3() {
        int n = 4;
        int[][] reservedSeats = new int[][]{{4, 3}, {1, 4}, {4, 6}, {1, 7}};
        int answer = solution.maxNumberOfFamilies(n, reservedSeats);
        Assertions.assertThat(answer).isEqualTo(4);
    }
}