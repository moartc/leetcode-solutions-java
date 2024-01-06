package solutions.algorithms._0_999._701_Insert_into_a_Binary_Search_Tree;

import commons.TreeNode;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import solutions.algorithms._0_999._701_Insert_into_a_Binary_Search_Tree.Solution;
import solutions.utils.TreeNodeUtils;

import java.util.Arrays;
import java.util.List;

class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    void insertIntoBST_test1() {
        TreeNode root = new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)), new TreeNode(7));
        TreeNode actual = solution.insertIntoBST(root, 5);
        List<Integer> actualList = TreeNodeUtils.treeNodeAsList(actual);

        List<Integer> firstPossibleAnswer = List.of(4, 2, 7, 1, 3, 5);
        List<Integer> secondPossibleAnswer = List.of(5, 2, 7, 1, 3, 5);
        boolean firstEq = actualList.equals(firstPossibleAnswer);
        boolean secondEq = actualList.equals(secondPossibleAnswer);
        Assertions.assertThat(firstEq || secondEq).isTrue();
    }

    @Test
    void insertIntoBST_test2() {
        /*
                40
              /    \
             20     60
            /  \   /  \
          10   30 50   70
         */
        TreeNode left = new TreeNode(20, new TreeNode(10), new TreeNode(30));
        TreeNode right = new TreeNode(60, new TreeNode(50), new TreeNode(70));
        TreeNode root = new TreeNode(40, left, right);

        TreeNode actual = solution.insertIntoBST(root, 25);
        List<Integer> actualList = TreeNodeUtils.treeNodeAsList(actual);

        List<Integer> firstPossibleAnswer = Arrays.asList(40, 20, 60, 10, 30, 50, 70, null, null, 25);
        Assertions.assertThat(actualList).isEqualTo(firstPossibleAnswer);
    }

    @Test
    void insertIntoBST_test3() {
        /*
                4
              /   \
            2       7
          /   \    /  \
         1     3  n     n
        / \   / \
       n   n  n  n
         */
        TreeNode left = new TreeNode(2, new TreeNode(1), new TreeNode(3));
        TreeNode right = new TreeNode(7);
        TreeNode root = new TreeNode(4, left, right);
        TreeNode actual = solution.insertIntoBST(root, 5);
        List<Integer> actualList = TreeNodeUtils.treeNodeAsList(actual);

        List<Integer> expected = List.of(4, 2, 7, 1, 3, 5);
        Assertions.assertThat(actualList).isEqualTo(expected);
    }

    @Test
    void insertIntoBST_test4() {

        TreeNode root = null;
        TreeNode actual = solution.insertIntoBST(root, 5);
        List<Integer> actualList = TreeNodeUtils.treeNodeAsList(actual);
        List<Integer> expected = List.of(5);
        Assertions.assertThat(actualList).isEqualTo(expected);
    }
}