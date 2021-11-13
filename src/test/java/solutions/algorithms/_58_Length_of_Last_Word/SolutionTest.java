package solutions.algorithms._58_Length_of_Last_Word;

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
    void lengthOfLastWordTest1() {

        String input = "Hello World";
        Assertions.assertEquals(5, solution.lengthOfLastWord(input));
    }

    @Test
    void lengthOfLastWordTest2() {

        String input = "   fly me   to   the moon  ";
        Assertions.assertEquals(4, solution.lengthOfLastWord(input));
    }

    @Test
    void lengthOfLastWordTest3() {

        String input = "luffy is still joyboy";
        Assertions.assertEquals(6, solution.lengthOfLastWord(input));
    }

    @Test
    void lengthOfLastWordTest4() {

        String input = "a";
        Assertions.assertEquals(1, solution.lengthOfLastWord(input));
    }
}