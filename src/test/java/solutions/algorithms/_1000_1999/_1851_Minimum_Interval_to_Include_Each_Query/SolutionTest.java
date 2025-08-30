package solutions.algorithms._1000_1999._1851_Minimum_Interval_to_Include_Each_Query;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void minInterval1() {

        int[][] intervals = new int[][]{{1, 4}, {2, 4}, {3, 6}, {4, 4}};
        int[] queries = new int[]{2, 3, 4, 5};
        int[] answer = solution.minInterval(intervals, queries);

        Assertions.assertThat(answer).containsExactly(3, 3, 1, 4);
    }

    @Test
    void minInterval2() {

        int[][] intervals = new int[][]{{2, 3}, {2, 5}, {1, 8}, {20, 25}};
        int[] queries = new int[]{2, 19, 5, 22};
        int[] answer = solution.minInterval(intervals, queries);

        Assertions.assertThat(answer).containsExactly(2, -1, 4, 6);
    }

    @Test
    void minInterval3() {

        int[][] intervals = new int[][]{{6, 6}, {5, 5}, {10, 10}, {3, 6}, {9, 9}, {7, 7}, {2, 10}, {5, 5}, {3, 7}, {10, 10}};
        int[] queries = new int[]{1, 8, 9, 1, 8, 3, 9, 3, 10, 1};
        int[] answer = solution.minInterval(intervals, queries);

        Assertions.assertThat(answer).containsExactly(-1, 9, 1, -1, 9, 4, 1, 4, 1, -1);
    }

    @Test
    void minInterval4() {

        int[][] intervals = new int[][]{{54, 82}, {55, 66}, {81, 89}, {38, 67}, {81, 86}, {47, 47}, {13, 61}, {33, 39}, {61, 66}, {97, 97}, {52, 68}, {96, 98}, {89, 92}, {1, 41}, {81, 89}, {9, 57}, {81, 90}, {41, 73}, {29, 80}, {98, 98}, {61, 95}, {93, 98}, {5, 65}, {91, 96}, {91, 99}, {28, 68}, {55, 71}, {35, 45}, {1, 89}, {48, 48}, {26, 36}, {5, 83}, {20, 83}, {73, 92}, {69, 69}, {77, 89}, {12, 52}, {5, 53}, {33, 53}, {70, 83}, {81, 98}, {69, 69}, {28, 90}, {9, 77}, {40, 53}, {53, 71}, {7, 55}, {7, 28}, {5, 88}, {61, 68}, {25, 93}, {45, 73}, {13, 51}, {27, 70}, {47, 87}, {71, 91}, {93, 98}, {1, 35}, {24, 39}, {86, 90}, {19, 33}, {1, 69}, {21, 100}, {85, 85}, {99, 99}, {25, 25}, {90, 94}, {13, 61}, {69, 85}, {89, 97}, {1, 43}, {11, 35}, {41, 95}, {31, 99}, {86, 94}, {33, 63}, {22, 91}, {61, 75}, {71, 83}, {31, 85}, {28, 83}, {1, 21}, {81, 97}, {5, 29}, {74, 83}, {33, 83}, {13, 24}, {92, 94}, {71, 71}, {59, 79}, {21, 37}, {33, 87}, {97, 97}, {34, 57}, {11, 59}, {57, 62}, {22, 23}, {13, 53}, {84, 85}, {71, 80}};
        int[] queries = new int[]{31, 9, 21, 91, 91, 58, 13, 76, 21, 69, 41, 1, 73, 2, 71, 51, 69, 89, 31, 85, 61, 61, 39, 76, 36, 50, 1, 33, 41, 38, 29, 91, 93, 47, 1, 11, 33, 79, 15, 7, 21, 36, 65, 1, 1, 93, 45, 51, 33, 5, 15, 65, 49, 81, 59, 21, 1, 7, 81, 6, 1, 80, 81, 21, 24, 41, 47, 85, 38, 26, 100, 33, 57, 24, 71, 16, 65, 96, 81, 83, 17, 75, 76, 21, 85, 47, 77, 49, 31, 61, 9, 49, 1, 73, 32, 66, 96, 97, 30, 21};
        int[] answer = solution.minInterval(intervals, queries);

        Assertions.assertThat(answer).containsExactly(11, 21, 12, 4, 4, 6, 12, 10, 12, 1, 11, 21, 10, 21, 1, 14, 1, 4, 11, 1, 6, 6, 7, 10,
                7, 14, 21, 7, 11, 7, 11, 4, 3, 1, 21, 21, 7, 10, 12, 21, 12, 7, 6, 21, 21, 3, 11, 14, 7, 21, 12, 6, 14, 6, 6, 12, 21, 21, 6,
                21, 21, 10, 6, 12, 12, 11, 1, 1, 7, 11, 80, 7, 6, 12, 1, 12, 6, 3, 6, 6, 12, 10, 10, 12, 1, 1, 10, 14, 11, 6, 21, 14, 21,
                10, 11, 6, 3, 1, 11, 12);
    }

    // minimized tricky case
    @Test
    void minInterval5() {

        int[][] intervals = new int[][]{{8, 8}, {2, 10}};
        int[] queries = new int[]{8, 9, 8};
        int[] answer = solution.minInterval(intervals, queries);

        Assertions.assertThat(answer).containsExactly(1, 9, 1);
    }

}