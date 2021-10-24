package solutions._119_Pascals_Triangle_II;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void getRowTest1() {
        int rowIndex = 3;
        List<Integer> expected = List.of(1, 3, 3, 1);
        List<Integer> actual = solution.getRow(rowIndex);
        Assertions.assertIterableEquals(expected, actual);
    }

    @Test
    void getRowTest2() {
        int rowIndex = 0;
        List<Integer> expected = List.of(1);
        List<Integer> actual = solution.getRow(rowIndex);
        Assertions.assertIterableEquals(expected, actual);
    }

    @Test
    void getRowTest3() {
        int rowIndex = 1;
        List<Integer> expected = List.of(1, 1);
        List<Integer> actual = solution.getRow(rowIndex);
        Assertions.assertIterableEquals(expected, actual);
    }

    @Test
    void getRowTest4() {
        int rowIndex = 30;
        List<Integer> expected = List.of(1,30,435,4060,27405,142506,593775,2035800,5852925,14307150,30045015,54627300,86493225,119759850,145422675,155117520,145422675,119759850,86493225,54627300,30045015,14307150,5852925,2035800,593775,142506,27405,4060,435,30,1);
        List<Integer> actual = solution.getRow(rowIndex);
        Assertions.assertIterableEquals(expected, actual);
    }
}