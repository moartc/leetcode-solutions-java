package solutions.algorithms._1000_1999._1980_Find_Unique_Binary_String;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void findDifferentBinaryString1() {
        String[] nums = new String[]{"01", "10"};
        String answer = solution.findDifferentBinaryString(nums);
        Assertions.assertThat(answer).isEqualTo("00");
    }

    @Test
    void findDifferentBinaryString2() {
        String[] nums = new String[]{"00", "01"};
        String answer = solution.findDifferentBinaryString(nums);
        Assertions.assertThat(answer).isEqualTo("10");
    }

    @Test
    void findDifferentBinaryString3() {
        String[] nums = new String[]{"111", "011", "000"};
        String answer = solution.findDifferentBinaryString(nums);
        Assertions.assertThat(answer).isEqualTo("001");
    }
}