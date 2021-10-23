package solutions._108_Convert_Sorted_Array_to_Binary_Search_Tree;

import commons.TreeNode;

class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {

        TreeNode treeNode = new TreeNode();
        appendChild(0, nums.length - 1, nums, treeNode);
        return treeNode;
    }

    private void appendChild(int start, int end, int[] nums, TreeNode treeNode) {

        int middle = (start + end + 1) / 2;
        treeNode.val = nums[middle];
        if (start != middle) {
            treeNode.left = new TreeNode();
            appendChild(start, middle - 1, nums, treeNode.left);
        }
        if (middle != end) {
            treeNode.right = new TreeNode();
            appendChild(middle + 1, end, nums, treeNode.right);
        }
    }
}