package solutions.algorithms._0_999._901_Online_Stock_Span;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class StockSpannerTest {


    @Test
    void test1() {

        StockSpanner stockSpanner = new StockSpanner();
        int v1 = stockSpanner.next(100); // return 1
        int v2 = stockSpanner.next(80);  // return 1
        int v3 = stockSpanner.next(60);  // return 1
        int v4 = stockSpanner.next(70);  // return 2
        int v5 = stockSpanner.next(60);  // return 1
        int v6 = stockSpanner.next(75);  // return 4, because the last
        // 4 prices (including today's price of 75) were less than or equal to today's price.
        int v7 = stockSpanner.next(85);  // return 6

        Assertions.assertThat(v1).isEqualTo(1);
        Assertions.assertThat(v2).isEqualTo(1);
        Assertions.assertThat(v3).isEqualTo(1);
        Assertions.assertThat(v4).isEqualTo(2);
        Assertions.assertThat(v5).isEqualTo(1);
        Assertions.assertThat(v6).isEqualTo(4);
        Assertions.assertThat(v7).isEqualTo(6);
    }

    @Test
    void test2() {

        StockSpanner stockSpanner = new StockSpanner();
        int v1 = stockSpanner.next(31);
        int v2 = stockSpanner.next(41);
        int v3 = stockSpanner.next(48);
        int v4 = stockSpanner.next(59);
        int v5 = stockSpanner.next(79);

        Assertions.assertThat(v1).isEqualTo(1);
        Assertions.assertThat(v2).isEqualTo(2);
        Assertions.assertThat(v3).isEqualTo(3);
        Assertions.assertThat(v4).isEqualTo(4);
        Assertions.assertThat(v5).isEqualTo(5);
    }

    @Test
    void test3() {

        StockSpanner stockSpanner = new StockSpanner();
        int v1 = stockSpanner.next(29);
        int v2 = stockSpanner.next(91);
        int v3 = stockSpanner.next(62);
        int v4 = stockSpanner.next(76);
        int v5 = stockSpanner.next(51);

        Assertions.assertThat(v1).isEqualTo(1);
        Assertions.assertThat(v2).isEqualTo(2);
        Assertions.assertThat(v3).isEqualTo(1);
        Assertions.assertThat(v4).isEqualTo(2);
        Assertions.assertThat(v5).isEqualTo(1);
    }
}