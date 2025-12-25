package solutions.algorithms._2000_2999._2707_Extra_Characters_in_a_String;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void minExtraChar1() {
        String s = "leetscode";
        String[] dictionary = new String[]{"leet", "code", "leetcode"};
        int answer = solution.minExtraChar(s, dictionary);
        Assertions.assertThat(answer).isEqualTo(1);
    }

    @Test
    void minExtraChar2() {
        String s = "sayhelloworld";
        String[] dictionary = new String[]{"hello", "world"};
        int answer = solution.minExtraChar(s, dictionary);
        Assertions.assertThat(answer).isEqualTo(3);
    }

    @Test
    void minExtraChar3() {
        String s = "dwmodizxvvbosxxw";
        String[] dictionary = new String[]{"ox", "lb", "diz", "gu", "v", "ksv", "o", "nuq", "r", "txhe", "e", "wmo", "cehy", "tskz", "ds", "kzbu"};
        int answer = solution.minExtraChar(s, dictionary);
        Assertions.assertThat(answer).isEqualTo(7);
    }

    @Test
    void minExtraChar4() {
        String s = "qsvwvkzfkuinvbfdpxckolrdesoifkkdwsnykzzwzrmh";
        String[] dictionary = new String[]{"ykz", "c", "s", "x", "m", "yqximu", "mgwls", "jj", "px", "xyije", "axfkp", "dvnty", "invbfd", "qs", "v", "zw", "d", "hlsq", "sltsu", "desoi", "kkdwsn", "ol", "zr", "f", "tpuc"};
        int answer = solution.minExtraChar(s, dictionary);
        Assertions.assertThat(answer).isEqualTo(8);
    }

    @Test
    void minExtraChar5() {
        String s = "nwlztjn";
        String[] dictionary = new String[]{"a", "f", "v", "me", "m", "bv", "g", "ss", "tu", "jm", "z", "kg", "l", "go", "cn", "uj", "kx", "w", "qz", "e", "ut", "tf", "zn", "ha", "ke", "af", "aj", "ls", "r", "no", "pm", "qn", "yw", "cs", "oz", "b"};
        int answer = solution.minExtraChar(s, dictionary);
        Assertions.assertThat(answer).isEqualTo(4);
    }
}