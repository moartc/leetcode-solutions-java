package solutions.algorithms._0_999._278_First_Bad_Version;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import solutions.algorithms._0_999._278_First_Bad_Version.Solution;

class SolutionTest {

    @Test
    void firstBadVersionTest1() {
        int n = 5;
        int bad = 4;
        int expected = 4;
        Solution solution = new Solution(bad);
        int actual = solution.firstBadVersion(n);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void firstBadVersionTest2() {
        int n = 1;
        int bad = 1;
        int expected = 1;
        Solution solution = new Solution(bad);
        int actual = solution.firstBadVersion(n);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void firstBadVersionTest3() {
        int n = 2;
        int bad = 1;
        int expected = 1;
        Solution solution = new Solution(bad);
        int actual = solution.firstBadVersion(n);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void firstBadVersionTest4() {
        int n = 3;
        int bad = 1;
        int expected = 1;
        Solution solution = new Solution(bad);
        int actual = solution.firstBadVersion(n);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void firstBadVersionTest5() {
        int n = 2126753390;
        int bad = 1702766719;
        int expected = 1702766719;
        Solution solution = new Solution(bad);
        int actual = solution.firstBadVersion(n);
        Assertions.assertEquals(expected, actual);
    }
}