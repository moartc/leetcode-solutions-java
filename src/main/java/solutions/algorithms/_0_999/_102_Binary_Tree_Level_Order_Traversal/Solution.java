package solutions.algorithms._0_999._102_Binary_Tree_Level_Order_Traversal;

import commons.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {

        if (root == null) {
            return List.of();
        }

        /*
        I can keep the list of results and put it as a parameter to my method. Return it at the end
        I can track the level of the visited node, and when I enter the new one
        I can get the list from the index corresponding to the current level (or add a new list if it's not added yet)
        then add a new element to this list
        Because I first visit left node, the order in all sublists should be correct.
         */
        List<List<Integer>> results = new ArrayList<>();
        add(root, 0, results);
        return results;
    }

    void add(TreeNode node, int level, List<List<Integer>> list) {

        if (node == null) {
            return;
        }
        // for level 2 I need a size at least level+1
        if (list.size() < level + 1) {
            List<Integer> newList = new ArrayList<>();
            list.add(newList);
        }
        // add this node to the list
        List<Integer> listForLevel = list.get(level);
        listForLevel.add(node.val);
        // visit first left
        add(node.left, level + 1, list);
        // amd then right
        add(node.right, level + 1, list);
    }


    /*
    -------------------------------------------------------------------------------------------------------------
    here starts some old code -  in the main method I called it this way:
    return solutionTwo(root);
     */

    List<List<Integer>> solutionTwo(TreeNode root) {
        if (root == null) {
            return List.of();
        } else {
            List<List<Integer>> result = new ArrayList<>();
            result.add(List.of(root.val));
            addValues(root, result, 1);
            return result;
        }
    }

    void addValues(TreeNode node, List<List<Integer>> listOfList, int level) {
        if (node.left != null) {
            if (level > listOfList.size() - 1) {
                listOfList.add(new ArrayList<>());
            }
            listOfList.get(level).add(node.left.val);
            addValues(node.left, listOfList, level + 1);
        }
        if (node.right != null) {
            if (level > listOfList.size() - 1) {
                listOfList.add(new ArrayList<>());
            }
            listOfList.get(level).add(node.right.val);
            addValues(node.right, listOfList, level + 1);
        }
    }

    List<List<Integer>> solutionOne(TreeNode root) {
        if (root == null) {
            return List.of();
        } else {
            int levelToCollect = 0;
            boolean isDeeper = true;
            List<List<Integer>> result = new LinkedList<>();
            result.add(List.of(root.val));
            while (isDeeper) {
                List<Integer> levelValues = new LinkedList<>();
                isDeeper = collectValuesOnLevelAndCheckIfDeeperExists(root, levelToCollect + 1, 0, levelValues);
                if (!levelValues.isEmpty()) {
                    result.add(levelValues);
                }
                levelToCollect++;
            }
            return result;
        }
    }

    boolean collectValuesOnLevelAndCheckIfDeeperExists(TreeNode node, int levelToCollect, int currentLevel, List<Integer> values) {
        currentLevel++;
        if (currentLevel == levelToCollect) {
            boolean isDeeper = false;
            if (node.left != null) {
                values.add(node.left.val);
                if (node.left.left != null || node.left.right != null) {
                    isDeeper = true;
                }
            }
            if (node.right != null) {
                values.add(node.right.val);
                if (!isDeeper && (node.right.left != null || node.right.right != null)) {
                    isDeeper = true;
                }
            }
            return isDeeper;
        } else {
            boolean left = false;
            boolean right = false;
            if (node.left != null) {
                left = collectValuesOnLevelAndCheckIfDeeperExists(node.left, levelToCollect, currentLevel, values);
            }
            if (node.right != null) {
                right = collectValuesOnLevelAndCheckIfDeeperExists(node.right, levelToCollect, currentLevel, values);
            }
            return left || right;
        }
    }

}