package solutions.algorithms._700_Search_in_a_Binary_Search_Tree;

import commons.TreeNode;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void searchBST_test1() {
        TreeNode root = new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)), new TreeNode(7));
        TreeNode actual = solution.searchBST(root,2);
        assertThat(actual).isNotNull();
        assertThat(actual.val).isEqualTo(2);
    }

    @Test
    void searchBST_test2() {
        TreeNode root = new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)), new TreeNode(7));
        TreeNode actual = solution.searchBST(root,5);
        assertThat(actual).isNull();
    }
}