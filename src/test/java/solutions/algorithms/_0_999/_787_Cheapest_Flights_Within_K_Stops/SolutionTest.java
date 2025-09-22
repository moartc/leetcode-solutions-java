package solutions.algorithms._0_999._787_Cheapest_Flights_Within_K_Stops;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void findCheapestPrice1() {

        int n = 4;
        int[][] flights = new int[][]{{0, 1, 100}, {1, 2, 100}, {2, 0, 100}, {1, 3, 600}, {2, 3, 200}};
        int src = 0;
        int dst = 3;
        int k = 1;
        int answer = solution.findCheapestPrice(n, flights, src, dst, k);
        Assertions.assertThat(answer).isEqualTo(700);
    }

    @Test
    void findCheapestPrice2() {
        int n = 3;
        int[][] flights = new int[][]{{0, 1, 100}, {1, 2, 100}, {0, 2, 500}};
        int src = 0;
        int dst = 2;
        int k = 1;
        int answer = solution.findCheapestPrice(n, flights, src, dst, k);
        Assertions.assertThat(answer).isEqualTo(200);
    }

    @Test
    void findCheapestPrice3() {
        int n = 3;
        int[][] flights = new int[][]{{0, 1, 100}, {1, 2, 100}, {0, 2, 500}};
        int src = 0;
        int dst = 2;
        int k = 0;
        int answer = solution.findCheapestPrice(n, flights, src, dst, k);
        Assertions.assertThat(answer).isEqualTo(500);
    }

    @Test
    void findCheapestPrice4() {
        int n = 5;
        int[][] flights = new int[][]{{4, 1, 1}, {1, 2, 3}, {0, 3, 2}, {0, 4, 10}, {3, 1, 1}, {1, 4, 3}};
        int src = 2;
        int dst = 1;
        int k = 1;
        int answer = solution.findCheapestPrice(n, flights, src, dst, k);
        Assertions.assertThat(answer).isEqualTo(-1);
    }
}