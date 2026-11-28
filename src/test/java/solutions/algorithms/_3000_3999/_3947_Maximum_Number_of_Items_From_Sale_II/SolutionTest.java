package solutions.algorithms._3000_3999._3947_Maximum_Number_of_Items_From_Sale_II;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {


    private final Solution solution = new Solution();

    @Test
    void maximumSaleItems() {
        int[][] items = new int[][]{{1, 6}, {2, 4}, {3, 5}};
        int budget = 19;
        int answer = solution.maximumSaleItems(items, budget);
        Assertions.assertThat(answer).isEqualTo(5);
    }

    @Test
    void maximumSaleItem2() {
        int[][] items = new int[][]{{2, 8}, {1, 10}, {6, 6}, {4, 12}, {5, 20}, {5, 17}};
        int budget = 35;
        int answer = solution.maximumSaleItems(items, budget);
        Assertions.assertThat(answer).isEqualTo(7);
    }

    @Test
    void maximumSaleItem3() {
        int[][] items = new int[][]{{2, 10}, {2, 35}, {4, 19}, {4, 13}, {4, 19}, {4, 41}, {4, 10}};
        int budget = 71;
        int answer = solution.maximumSaleItems(items, budget);
        Assertions.assertThat(answer).isEqualTo(14);
    }

    @Test
    void maximumSaleItem4() {
        int[][] items = new int[][]{{2, 6}, {4, 12}, {4, 9}, {4, 15}, {4, 9}, {4, 9}, {4, 13}};
        int budget = 51;
        int answer = solution.maximumSaleItems(items, budget);
        Assertions.assertThat(answer).isEqualTo(15);
    }
}