package solutions.algorithms._3000_3999._3756_Concatenate_Non_Zero_Digits_and_Multiply_by_Sum_II;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void sumAndMultiply1() {
        String s = "10203004";
        int[][] queries = new int[][]{{0, 7}, {1, 3}, {4, 6}};
        int[] answer = solution.sumAndMultiply(s, queries);
        Assertions.assertThat(answer).containsExactly(12340, 4, 9);
    }

    @Test
    void sumAndMultiply2() {
        String s = "1000";
        int[][] queries = new int[][]{{0, 3}, {1, 1}};
        int[] answer = solution.sumAndMultiply(s, queries);
        Assertions.assertThat(answer).containsExactly(1, 0);
    }

    @Test
    void sumAndMultiply3() {
        String s = "9876543210";
        int[][] queries = new int[][]{{0, 9}};
        int[] answer = solution.sumAndMultiply(s, queries);
        Assertions.assertThat(answer).containsExactly(444444137);
    }

    @Test
    void sumAndMultiply4() {
        String s = "58578833985";
        int[][] queries = new int[][]{{0, 0}, {0, 1}, {0, 2}, {0, 3}, {0, 5}, {0, 7}, {0, 8}, {0, 9}, {0, 10}, {1, 1}, {1, 2}, {1, 3}, {1, 5}, {1, 6}, {1, 8}, {1, 9}, {1, 10}, {2, 2}, {2, 3}, {2, 4}, {2, 6}, {2, 7}, {2, 8}, {2, 9}, {2, 10}, {3, 5}, {3, 6}, {3, 7}, {3, 8}, {3, 9}, {4, 4}, {4, 5}, {4, 6}, {4, 7}, {4, 9}, {4, 10}, {5, 6}, {5, 7}, {5, 8}, {5, 9}, {5, 10}, {6, 6}, {6, 7}, {6, 8}, {6, 9}, {7, 7}, {7, 9}, {7, 10}, {8, 8}, {8, 9}, {8, 10}, {9, 9}, {9, 10}, {10, 10}};
        int[] answer = solution.sumAndMultiply(s, queries);
        Assertions.assertThat(answer).containsExactly(25, 754, 10530, 146425, 24017308, 753205137, 804146760, 904534854, 939516678, 64,
                1105, 17140, 3088368, 33457437, 375205261, 615120132, 45371197, 25, 684, 11560, 1794373, 19680322, 248898577, 952053284,
                414702936, 18124, 204958, 2286157, 29956882, 362636308, 64, 1408, 16777, 194326, 34452522, 388695340, 913, 11662, 191797,
                2585338, 30023460, 9, 198, 5085, 78154, 9, 7960, 99625, 81, 1666, 21670, 64, 1105, 25);
    }
}