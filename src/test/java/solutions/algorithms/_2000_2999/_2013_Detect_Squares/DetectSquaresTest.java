package solutions.algorithms._2000_2999._2013_Detect_Squares;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class DetectSquaresTest {


    @Test
    void test1() {

        DetectSquares ds = new DetectSquares();
        ds.add(new int[]{3, 10});
        ds.add(new int[]{11, 2});
        ds.add(new int[]{3, 2});
        int count1 = ds.count(new int[]{11, 10});
        int count2 = ds.count(new int[]{14, 8});
        ds.add(new int[]{11, 2});
        int count3 = ds.count(new int[]{11, 10});

        Assertions.assertThat(count1).isEqualTo(1);
        Assertions.assertThat(count2).isEqualTo(0);
        Assertions.assertThat(count3).isEqualTo(2);
    }

    @Test
    void test2() {

        DetectSquares ds = new DetectSquares();

        ds.add(new int[]{5, 10});
        ds.add(new int[]{10, 5});
        ds.add(new int[]{10, 10});
        int c1 = ds.count(new int[]{5, 5});
        ds.add(new int[]{3, 0});
        ds.add(new int[]{8, 0});
        ds.add(new int[]{8, 5});
        int c2 = ds.count(new int[]{3, 5});
        ds.add(new int[]{9, 0});
        ds.add(new int[]{9, 8});
        ds.add(new int[]{1, 8});
        int c3 = ds.count(new int[]{1, 0});
        ds.add(new int[]{0, 0});
        ds.add(new int[]{8, 0});
        ds.add(new int[]{8, 8});
        int c4 = ds.count(new int[]{0, 8});

        Assertions.assertThat(c1).isEqualTo(1);
        Assertions.assertThat(c2).isEqualTo(1);
        Assertions.assertThat(c3).isEqualTo(1);
        Assertions.assertThat(c4).isEqualTo(2);
    }

    // 08 00 98 90

}