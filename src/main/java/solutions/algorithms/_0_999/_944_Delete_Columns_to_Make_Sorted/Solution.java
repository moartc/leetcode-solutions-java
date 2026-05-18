package solutions.algorithms._0_999._944_Delete_Columns_to_Make_Sorted;

class Solution {
    public int minDeletionSize(String[] strs) {

        int deleteCtr = 0;
        for (int col = 0; col < strs[0].length(); col++) {

            if (strs.length > 1) {
                char prev = strs[0].charAt(col);
                for (int row = 1; row < strs.length; row++) {
                    if (strs[row].charAt(col) < prev) {
                        deleteCtr++;
                        break;
                    } else {
                        prev = strs[row].charAt(col);
                    }
                }
            } else {
                return 0;
            }
        }
        return deleteCtr;
    }
}