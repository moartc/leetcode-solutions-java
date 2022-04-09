package solutions.algorithms._733_Flood_Fill;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void floodFillTest1() {

        int[][] image = new int[][]{{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        int sr = 1;
        int sc = 1;
        int newColor = 2;
        int[][] expected = new int[][]{{2, 2, 2}, {2, 2, 0}, {2, 0, 1}};
        int[][] actual = solution.floodFill(image, sr, sc, newColor);

        Assertions.assertEquals(expected.length, actual.length);
        for (int i = 0; i < expected.length; i++) {
            Assertions.assertArrayEquals(expected[i], actual[i]);
        }
    }

    @Test
    void floodFillTest2() {

        int[][] image = new int[][]{{0, 0, 0}, {0, 0, 0}};
        int sr = 0;
        int sc = 0;
        int newColor = 2;
        int[][] expected = new int[][]{{2, 2, 2}, {2, 2, 2}};
        int[][] actual = solution.floodFill(image, sr, sc, newColor);

        Assertions.assertEquals(expected.length, actual.length);
        for (int i = 0; i < expected.length; i++) {
            Assertions.assertArrayEquals(expected[i], actual[i]);
        }
    }

    @Test
    void floodFillTest3() {
        int[][] image = new int[][]{{0, 0, 0}, {0, 1, 0}};
        int sr = 1;
        int sc = 1;
        int newColor = 2;
        int[][] expected = new int[][]{{0, 0, 0}, {0, 2, 0}};
        int[][] actual = solution.floodFill(image, sr, sc, newColor);

        Assertions.assertEquals(expected.length, actual.length);
        for (int i = 0; i < expected.length; i++) {
            Assertions.assertArrayEquals(expected[i], actual[i]);
        }
    }

    @Test
    void floodFillTest4() {
        int[][] image = new int[][]{{0, 0, 0}, {0, 1, 1}};
        int sr = 1;
        int sc = 1;
        int newColor = 1;
        int[][] expected = new int[][]{{0, 0, 0}, {0, 1, 1}};
        int[][] actual = solution.floodFill(image, sr, sc, newColor);

        Assertions.assertEquals(expected.length, actual.length);
        for (int i = 0; i < expected.length; i++) {
            Assertions.assertArrayEquals(expected[i], actual[i]);
        }
    }
}
