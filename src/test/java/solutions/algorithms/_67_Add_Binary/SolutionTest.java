package solutions.algorithms._67_Add_Binary;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void addBinaryTest1() {

        String a = "11";
        String b = "1";
        String actual = solution.addBinary(a, b);
        String expected = "100";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void addBinaryTest2() {

        String a = "1010";
        String b = "1011";
        String actual = solution.addBinary(a, b);
        String expected = "10101";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void addBinaryTest3() {

        String a = "1111";
        String b = "1";
        String actual = solution.addBinary(a, b);
        String expected = "10000";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void addBinaryTest4() {

        String a = "1111";
        String b = "10";
        String actual = solution.addBinary(a, b);
        String expected = "10001";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void addBinaryTest5() {

        String a = "101111";
        String b = "10";
        String actual = solution.addBinary(a, b);
        String expected = "110001";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void addBinaryTest6() {

        String a = "110010";
        String b = "10111";

        String actual = solution.addBinary(a, b);
        String expected = "1001001";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void addBinaryTest7() {

        String a = "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101";
        String b = "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011";

        String actual = solution.addBinary(a, b);
        String expected = "110111101100010011000101110110100000011101000101011001000011011000001100011110011010010011000000000";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void addBinaryTest8() {

        String a = "10";
        String b = "110010";

        String actual = solution.addBinary(a, b);
        String expected = "110100";
        Assertions.assertEquals(expected, actual);
    }
}