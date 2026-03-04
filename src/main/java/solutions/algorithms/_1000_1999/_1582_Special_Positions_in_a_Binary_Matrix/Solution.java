package solutions.algorithms._1000_1999._1582_Special_Positions_in_a_Binary_Matrix;

class Solution {

    /*
    First: count number of ones per column, then iterate again and if I encounter '1' and this is the only '1' in this column -  mark it
    and check the current row until the end
     */
    public int numSpecial(int[][] mat) {

        int[] colCtr = new int[mat[0].length];
        for (int[] ints : mat) {
            for (int x = 0; x < mat[0].length; x++) {
                if (ints[x] == 1) {
                    colCtr[x]++;
                }
            }
        }
        int ctr = 0;
        nextY:
        for (int[] ints : mat) {
            int rowCtr = 0;
            boolean increaseCtr = false;
            for (int x = 0; x < mat[0].length; x++) {

                if (ints[x] == 1) {
                    if (colCtr[x] != 1) {
                        continue nextY;
                    }
                    if (rowCtr == 0) {
                        // the first one
                        increaseCtr = true;
                        rowCtr++;
                    } else {
                        continue nextY;
                    }
                }
            }
            if (increaseCtr) {
                ctr++;
            }
        }
        return ctr;
    }
}

/*
0,0,0,1
1,0,0,0
0,1,1,0
0,0,0,0
 */