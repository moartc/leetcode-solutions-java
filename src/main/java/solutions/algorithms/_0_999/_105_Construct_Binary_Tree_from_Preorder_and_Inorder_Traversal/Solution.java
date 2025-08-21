package solutions.algorithms._0_999._105_Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal;

import commons.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    // I keep it for the initial solution
    private final static int[] NOT_FOUND = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};

    /*
     Some notes after checking that the best solution is to use recursion:
     1. The first Preorder is always root
     2. On the left side of the root in inorder I have the left branch of root

     Algorithm (based on my main example):
     1. select root -> A
     2. split Inorder into 2 arrays, for left and right branch:
     H D I B E | F C J G
     3. For the left, get all without branch (A): B D H I E C F G J
     and repeat:
     B -> is my root, in inorder I still have is: H D I B E
     so for the left branch I have HDI and for the right I have E -> it's a single value, so I could create a node for the right branch

     for the left part:
     pre: D H I E C F G J and HDI
     D is my root and split is H | I
     I create D with the left and the right child H and I respectively

     */

    // 2nd approach
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        // if the size is > 1
        if (preorder.length == 1) {
            return new TreeNode(preorder[0]);
        }

        Map<Integer, Integer> indexLookup = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            indexLookup.put(inorder[i], i);
        }
        int rootValue = preorder[0];
        TreeNode rootNode = new TreeNode(rootValue);
        int lastIndex = inorder.length - 1;
        int indexOfRoot = indexLookup.get(rootValue);


        rootNode.left = buildSubTree(inorder, 0, indexOfRoot - 1, preorder, 1, indexLookup);
        rootNode.right = buildSubTree(inorder, indexOfRoot + 1, lastIndex, preorder, indexOfRoot + 1, indexLookup);


        return rootNode;
    }

    TreeNode buildSubTree(int[] inorder, int inorderF, int inorderL, int[] preorder, int preorderF, Map<Integer, Integer> lookup) {

        if (preorderF == -1) {
            System.out.println("x");
        }
        if (inorderF == inorderL) {
            int valueToCreate = inorder[inorderF];
            // there is only one value - create that node
            return new TreeNode(valueToCreate);
        } else if (inorderF > inorderL) {
            return null;
        }
        // otherwise get next preorder which I return after building
        int preorderValue = preorder[preorderF];

        TreeNode nextPreorderValue = new TreeNode(preorderValue);
        // get from lookup
        int indexOfRootInInorder = lookup.get(preorderValue);
        int leftSize = indexOfRootInInorder - inorderF;

        // for the first index of preorder I need preorderF + leftArraySize + 1
        nextPreorderValue.left = buildSubTree(inorder, inorderF, indexOfRootInInorder - 1, preorder, preorderF + 1, lookup);
        nextPreorderValue.right = buildSubTree(inorder, indexOfRootInInorder + 1, inorderL, preorder, preorderF + leftSize + 1, lookup);
        return nextPreorderValue;
    }







    /*
    Initial idea and solution which finishes with beats 5.19%
    Better example
                A
              /   \
             B      C
            / \    /  \
          D    E  F    G
         / \          /
        H   I        J

     Preorder: A B D H I E C F G J
     Inorder:  H D I B E A F C J G

     Without H child:
     Preorder: A B D I E C F G J
     Inorder:  D I B E A F C J G

     Some notes (based on the example above):
     If I can find 2 the same chars next to each other in both pre and in order then I can build a branch
     for pre CF and inorder FC - F is the left child of C
     for pre DI and inorder DI - I is the right child of D

     -----
     Algorithm (for the case from the example test case):
     3, 9, 20, 15, 7
     9, 3, 15, 20, 7

     I get 3,9 and 9,3 -> 9 is the left child of 3 -> I create this branch and keep 9 in both lists (or rather remove 3 from both of them)
     current lists:
     3, 20, 15, 7
     3, 15, 20, 7
     I have 20, 15 and 15, 20 which means 15 is the left child of 20 -> I create this branch and keep 15 in the lists
     current lists:
     3, 20, 7
     3, 20, 7
     I have 20 7 and 20 7 which means 7 is the right child of 20 -> I add 7 as the right child of 20
     -> probably I need to store already created nodes in a map
     current lists (after merging 20 and 7 - to the parent one (20))
     3, 20
     3, 20
     I have 3 20 and 3 20 which means that 20 is the right child of 3 -> get 3 from map and add 20 as the right child

     the only remaining node is 3 -> return it

     ----
     update:
     it turned out that I have to process lists backward

     */


    /*
    Terrible solution if it comes to performance and memory
     */
    public TreeNode buildTree_v1(int[] preorder, int[] inorder) {

        if (preorder.length == 1) {
            return new TreeNode(preorder[0]);
        }

        List<Integer> preOrder = new ArrayList<>(preorder.length);
        for (int i : preorder) {
            preOrder.add(i);
        }

        List<Integer> inOrder = new ArrayList<>(inorder.length);
        for (int i : inorder) {
            inOrder.add(i);
        }

        Map<Integer, TreeNode> valToNode = new HashMap<>();

        // until there are more than 1 Node
        while (preOrder.size() != 1) {
            for (int i = preOrder.size() - 2; i >= 0; i--) {
                int v1 = preOrder.get(i);
                int v2 = preOrder.get(i + 1);
                int[] found = getIndex(inOrder, v1, v2);
                if (found[0] != Integer.MAX_VALUE) {
                    // really found
                    if (v1 == found[0]) {
                        // regular order
                        var n1 = valToNode.getOrDefault(v1, new TreeNode(v1));
                        var n2 = valToNode.getOrDefault(v2, new TreeNode(v2));
                        n1.right = n2;
                        valToNode.put(v1, n1);
                        valToNode.put(v2, n2);
                    } else {
                        // reversed order
                        var n1 = valToNode.getOrDefault(v1, new TreeNode(v1));
                        var n2 = valToNode.getOrDefault(v2, new TreeNode(v2));
                        n1.left = n2;
                        valToNode.put(v1, n1);
                        valToNode.put(v2, n2);
                    }
                    // and delete from the list before next iteration
                    preOrder.remove(Integer.valueOf(v2));
                    inOrder.remove(Integer.valueOf(v2));
                    break;
                } else {
                    // if not found continue the loop
                }
            }
        }

        // get node for the only value
        return valToNode.get(preOrder.get(0));

    }

    // returns indices where values have been found in inOrder list
    int[] getIndex(List<Integer> inOrder, int v1, int v2) {

        boolean firstSeen = false;
        boolean secondSeen = false;

        for (int i = inOrder.size() - 2; i >= 0; i--) {

            int x1 = inOrder.get(i);
            int x2 = inOrder.get(i + 1);

            if (x1 == v1 || x1 == v2) {
                firstSeen = true;
            }
            if (x2 == v1 || x2 == v2) {
                secondSeen = true;
            }

            // 2 cases because order might be reversed
            if ((v1 == x1 && v2 == x2) || (v1 == x2 && v2 == x1)) {
                return new int[]{x1, x2};
            }

            if (firstSeen && secondSeen) {
                return NOT_FOUND;
            }
        }
        // if not found
        return NOT_FOUND;
    }
}