package solutions.algorithms._3000_3999._3789_Minimum_Cost_to_Acquire_Required_Items;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void minimumCost1() {
        int cost1 = 3;
        int cost2 = 2;
        int costBoth = 1;
        int need1 = 3;
        int need2 = 2;
        long answer = solution.minimumCost(cost1, cost2, costBoth, need1, need2);
        Assertions.assertThat(answer).isEqualTo(3);
    }

    @Test
    void minimumCost2() {
        int cost1 = 5;
        int cost2 = 4;
        int costBoth = 15;
        int need1 = 2;
        int need2 = 3;
        long answer = solution.minimumCost(cost1, cost2, costBoth, need1, need2);
        Assertions.assertThat(answer).isEqualTo(22);
    }

    @Test
    void minimumCost3() {
        int cost1 = 5;
        int cost2 = 4;
        int costBoth = 15;
        int need1 = 0;
        int need2 = 0;
        long answer = solution.minimumCost(cost1, cost2, costBoth, need1, need2);
        Assertions.assertThat(answer).isEqualTo(0);
    }

    @Test
    void minimumCost4() { // forgot about long
        int cost1 = 388168;
        int cost2 = 988887;
        int costBoth = 336014;
        int need1 = 50411;
        int need2 = 252237;
        long answer = solution.minimumCost(cost1, cost2, costBoth, need1, need2);
        Assertions.assertThat(answer).isEqualTo(84755163318L);
    }
}