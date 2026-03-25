package solutions.algorithms._0_999._6_Zigzag_Conversion;

class Solution {
    public String convert(String s, int numRows) {

        if (numRows == 1) {
            return s;
        }
        StringBuilder[] sbForRow = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            sbForRow[i] = new StringBuilder();
        }
        char[] charArr = s.toCharArray();
        int listIndex = 0;
        boolean up = true;
        for (char c : charArr) {
            StringBuilder sb = sbForRow[listIndex];
            sb.append(c);
            if (up) {
                listIndex--;
            } else {
                listIndex++;
            }
            if (listIndex < 0) {
                listIndex = 1;
                up = false;
            } else if (listIndex == numRows) {
                listIndex = numRows - 2;
                up = true;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (StringBuilder rowSb : sbForRow) {
            sb.append(rowSb.toString());
        }
        return sb.toString();
    }

}