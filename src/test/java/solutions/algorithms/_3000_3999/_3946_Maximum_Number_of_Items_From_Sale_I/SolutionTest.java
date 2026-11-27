package solutions.algorithms._3000_3999._3946_Maximum_Number_of_Items_From_Sale_I;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void maximumSaleItems1() {
        int[][] items = new int[][]{{6, 2}, {2, 6}, {3, 4}};
        int budget = 9;
        int answer = solution.maximumSaleItems(items, budget);
        Assertions.assertThat(answer).isEqualTo(4);
    }

    @Test
    void maximumSaleItems2() {
        int[][] items = new int[][]{{2, 4}, {3, 2}, {4, 1}, {6, 4}, {12, 4}};
        int budget = 8;
        int answer = solution.maximumSaleItems(items, budget);
        Assertions.assertThat(answer).isEqualTo(10);
    }

    @Test
    void maximumSaleItems3() {
        int[][] items = new int[][]{{44, 25}, {58, 14}, {68, 19}, {68, 19}, {52, 13}, {67, 24}};
        int budget = 32;
        int answer = solution.maximumSaleItems(items, budget);
        Assertions.assertThat(answer).isEqualTo(3);
    }
}