package solutions.algorithms._10000_10999._10034_Count_the_Number_of_Powerful_Integers;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void test1() {
        int start = 1;
        int finish = 6000;
        int limit = 4;
        String s = "124";
        long result = solution.numberOfPowerfulInt(start, finish, limit, s);

        Assertions.assertThat(result).isEqualTo(5);
    }

    @Test
    void test2() {
        int start = 15;
        int finish = 215;
        int limit = 6;
        String s = "10";
        long result = solution.numberOfPowerfulInt(start, finish, limit, s);

        Assertions.assertThat(result).isEqualTo(2);
    }

    @Test
    void test3() {
        int start = 1000;
        int finish = 2000;
        int limit = 4;
        String s = "3000";
        long result = solution.numberOfPowerfulInt(start, finish, limit, s);

        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    void test4() {
        int start = 141;
        int finish = 148;
        int limit = 9;
        String s = "9";
        long result = solution.numberOfPowerfulInt(start, finish, limit, s);

        Assertions.assertThat(result).isEqualTo(0);
    }

    @Test
    void test5() {
        int start = 1;
        int finish = 971;
        int limit = 9;
        String s = "17";
        long result = solution.numberOfPowerfulInt(start, finish, limit, s);

        Assertions.assertThat(result).isEqualTo(10);
    }

    @Test
    void test6() {
        int start = 697662853;
        long finish = 11109609599885L;
        int limit = 6;
        String s = "5";
        long result = solution.numberOfPowerfulInt(start, finish, limit, s);

        Assertions.assertThat(result).isEqualTo(16135677999L);
    }

    @Test
    void test7() {
        int start = 1;
        long finish = 100;
        int limit = 1;
        String s = "1";
        long result = solution.numberOfPowerfulInt(start, finish, limit, s);

        Assertions.assertThat(result).isEqualTo(2);
    }

    @Test
    void test8() {
        int start = 2;
        long finish = 100;
        int limit = 1;
        String s = "1";
        long result = solution.numberOfPowerfulInt(start, finish, limit, s);
        // only 011
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    void test9() {
        // 11
        // 21
        int start = 10;
        long finish = 100;
        int limit = 2;
        String s = "1";
        long result = solution.numberOfPowerfulInt(start, finish, limit, s);
        Assertions.assertThat(result).isEqualTo(2);
    }

    @Test
    void test10() {
        long start = 8385922281L;
        long finish = 56724293041189L;
        int limit = 6;
        String s = "51662";
        long result = solution.numberOfPowerfulInt(start, finish, limit, s);
        Assertions.assertThat(result).isEqualTo(34571999);
    }
}
