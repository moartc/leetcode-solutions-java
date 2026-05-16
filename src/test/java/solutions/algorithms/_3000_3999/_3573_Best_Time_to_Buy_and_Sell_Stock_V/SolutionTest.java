package solutions.algorithms._3000_3999._3573_Best_Time_to_Buy_and_Sell_Stock_V;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void maximumProfit1() {
        int[] prices = new int[]{1, 7, 9, 8, 2};
        int k = 2;
        long answer = solution.maximumProfit(prices, k);
        Assertions.assertThat(answer).isEqualTo(14);
    }

    @Test
    void maximumProfit2() {
        int[] prices = new int[]{12, 16, 19, 19, 8, 1, 19, 13, 9};
        int k = 3;
        long answer = solution.maximumProfit(prices, k);
        Assertions.assertThat(answer).isEqualTo(36);
    }

    @Test
    void maximumProfit3() {
        int[] prices = new int[]{1, 5};
        int k = 1;
        long answer = solution.maximumProfit(prices, k);
        Assertions.assertThat(answer).isEqualTo(4);
    }

    @Test
    void maximumProfit4() {
        int[] prices = new int[]{1, 5, 2, 8};
        int k = 2;
        long answer = solution.maximumProfit(prices, k);
        Assertions.assertThat(answer).isEqualTo(10);
    }

    @Test
    void maximumProfit5() {
        int[] prices = new int[]{4, 16, 8, 18, 4};
        int k = 1;
        long answer = solution.maximumProfit(prices, k);
        Assertions.assertThat(answer).isEqualTo(14);
    }

    @Test
    void maximumProfit6() {
        int[] prices = new int[]{439905949, 666304906, 328728050, 996405752, 379313886, 528209791, 88582883, 939135548, 751069794, 109146128, 883868801, 685035870, 872864534, 515610456, 671402135, 299270187, 782796059, 14959721, 863144680, 901085624, 622229387, 536656476, 257303050, 868839354, 117275933, 918430202, 935695732, 478547107, 484151756, 631419928, 39696098, 650941214, 51074234, 941181946, 265314584, 557086091, 786537782, 50596574, 28828693, 157162091, 9857934, 451956750, 695591748, 879988702, 249629554, 539569656, 282083076, 39183395, 66614080, 479066152, 652564309, 907349719, 210005879, 768785742, 537258749, 237393978, 346271286, 392541722, 312074103, 126562356, 400828204, 614474102, 364762040, 8363356, 539354781, 90084496, 319405489, 644955686, 889207045, 798527610, 141688158, 529097227, 598399178, 87898767, 830035760, 49071715, 600386530, 40425784, 322514114, 778707680, 79388396};
        int k = 30;
        long answer = solution.maximumProfit(prices, k);
        Assertions.assertThat(answer).isEqualTo(17891684807L);
    }


}