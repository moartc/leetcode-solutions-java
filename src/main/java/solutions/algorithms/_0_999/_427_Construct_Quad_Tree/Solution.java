package solutions.algorithms._0_999._427_Construct_Quad_Tree;

// Definition for a QuadTree node.

class Node {
    public boolean val;
    public boolean isLeaf;
    public Node topLeft;
    public Node topRight;
    public Node bottomLeft;
    public Node bottomRight;


    public Node() {
        this.val = false;
        this.isLeaf = false;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }

    public Node(boolean val, boolean isLeaf) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }

    public Node(boolean val, boolean isLeaf, Node topLeft, Node topRight, Node bottomLeft, Node bottomRight) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = topLeft;
        this.topRight = topRight;
        this.bottomLeft = bottomLeft;
        this.bottomRight = bottomRight;
    }
}

class Solution {

    /*
    I can create a method that I can call recursively.
    Start with the whole grid, create a node with 4 elements inside and for each of these 4 elements create another one using the same
    method by calling it with a different set of params (starting point and size)
     */
    public Node construct(int[][] grid) {

        return create(grid, 0, 0, grid.length);
    }

    private Node create(int[][] grid, int y, int x, int length) {

        if (length == 1) {
            return new Node(grid[y][x] == 1, true);
        } else {

            Node node;
            int firstValue = grid[y][x];
            for (int i = y; i < y + length; i++) {
                for (int j = x; j < x + length; j++) {
                    if (grid[i][j] != firstValue) {
                        // different value so I can split
                        node = new Node(false, false);
                        int lengthHalf = length / 2;
                        node.topLeft = create(grid, y, x, lengthHalf);
                        node.topRight = create(grid, y, x + lengthHalf, lengthHalf);
                        node.bottomLeft = create(grid, y + lengthHalf, x, lengthHalf);
                        node.bottomRight = create(grid, y + lengthHalf, x + lengthHalf, lengthHalf);
                        return node;
                    }

                }
            }
            return new Node(firstValue == 1, true);
        }
    }
}


















































