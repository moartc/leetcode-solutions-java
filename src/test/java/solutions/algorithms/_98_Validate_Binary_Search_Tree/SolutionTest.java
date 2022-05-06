package solutions.algorithms._98_Validate_Binary_Search_Tree;

import commons.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;


class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void isValidBST_test1() {
        TreeNode root = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        assertThat(solution.isValidBST(root)).isTrue();
    }

    @Test
    void isValidBST_test2() {
        TreeNode root = new TreeNode(5, new TreeNode(1), new TreeNode(4, new TreeNode(3), new TreeNode(6)));
        assertThat(solution.isValidBST(root)).isFalse();
    }

    @Test
    void isValidBST_test3() {
        /*
                5
              /   \
             4     6
                  /  \
                 3    7
         */
        TreeNode root = new TreeNode(5, new TreeNode(4), new TreeNode(6, new TreeNode(3), new TreeNode(7)));
        assertThat(solution.isValidBST(root)).isFalse();
    }

    @Test
    void isValidBST_test4() {
        /*
                8
              /   \
             3     10
            / \      \
           1   6      14
              / \     /
             4   7   13
         */
        TreeNode left = new TreeNode(3, new TreeNode(1), new TreeNode(6, new TreeNode(4), new TreeNode(7)));
        TreeNode right = new TreeNode(10, null, new TreeNode(14, new TreeNode(13), null));
        TreeNode root = new TreeNode(8, left, right);
        assertThat(solution.isValidBST(root)).isTrue();
    }

    @Test
    void isValidBST_test5() {
        /*
                3
              /   \
             1     5
           /  \   /  \
          0    2 4    6
                \
                 3
         */
        TreeNode left = new TreeNode(1, new TreeNode(0), new TreeNode(2, null, new TreeNode(3)));
        TreeNode right = new TreeNode(5, new TreeNode(4), new TreeNode(6));
        TreeNode root = new TreeNode(3, left, right);
        assertThat(solution.isValidBST(root)).isFalse();
    }

    @Test
    void isValidBST_test6() {
        /*
               10
              /   \
             5     15
                  /  \
                MIN   20
         */
        TreeNode right = new TreeNode(15, new TreeNode(Integer.MIN_VALUE), new TreeNode(20));
        TreeNode root = new TreeNode(10, new TreeNode(5), right);
        assertThat(solution.isValidBST(root)).isFalse();
    }

    @Test
    void isValidBST_test7() {
        /*
               MIN
                 \
                  MAX
         */
        TreeNode root = new TreeNode(Integer.MIN_VALUE, null, new TreeNode(Integer.MAX_VALUE));
        assertThat(solution.isValidBST(root)).isTrue();
    }

    // [2147483644,-2147483648,2147483646,null,null,2147483645,2147483647]
    @Test
    void isValidBST_test8() {
        /*
               2147483644
              /           \
        -2147483648     2147483646
                       /          \
                2147483645         2147483647
         */
        TreeNode root = new TreeNode(2147483644, new TreeNode(-2147483648),
                new TreeNode(2147483646, new TreeNode(2147483645), new TreeNode(2147483647)));
        assertThat(solution.isValidBST(root)).isTrue();
    }

}