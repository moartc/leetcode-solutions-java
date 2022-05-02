package solutions.algorithms._387_First_Unique_Character_in_a_String;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void firstUniqCharTest1() {
        String s = "leetcodes";
        assertThat(solution.firstUniqChar(s)).isEqualTo(0);
    }

    @Test
    void firstUniqCharTest2() {
        String s = "loveleetcode";
        assertThat(solution.firstUniqChar(s)).isEqualTo(2);
    }

    @Test
    void firstUniqCharTest3() {
        String s = "aabb";
        assertThat(solution.firstUniqChar(s)).isEqualTo(-1);
    }

    @Test
    void firstUniqCharTest4() {
        String s = "bd";
        assertThat(solution.firstUniqChar(s)).isEqualTo(0);
    }

    @Test
    void firstUniqCharTest5() {
        String s = "dddccdbba";
        assertThat(solution.firstUniqChar(s)).isEqualTo(8);
    }
}