package solutions.algorithms._0_999._71_Simplify_Path;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void simplifyPath1() {
        String path = "/home/";
        String answer = solution.simplifyPath(path);
        Assertions.assertThat(answer).isEqualTo("/home");
    }

    @Test
    void simplifyPath2() {
        String path = "/home//foo/";
        String answer = solution.simplifyPath(path);
        Assertions.assertThat(answer).isEqualTo("/home/foo");
    }

    @Test
    void simplifyPath3() {
        String path = "/home/user/Documents/../Pictures";
        String answer = solution.simplifyPath(path);
        Assertions.assertThat(answer).isEqualTo("/home/user/Pictures");
    }

    @Test
    void simplifyPath4() {
        String path = "/../";
        String answer = solution.simplifyPath(path);
        Assertions.assertThat(answer).isEqualTo("/");
    }

    @Test
    void simplifyPath5() {
        String path = "/.../a/../b/c/../d/./";
        String answer = solution.simplifyPath(path);
        Assertions.assertThat(answer).isEqualTo("/.../b/d");
    }

    @Test
    void simplifyPath6() {
        String path = "/a//b////c/d//././/..";
        String answer = solution.simplifyPath(path);
        Assertions.assertThat(answer).isEqualTo("/a/b/c");
    }

}