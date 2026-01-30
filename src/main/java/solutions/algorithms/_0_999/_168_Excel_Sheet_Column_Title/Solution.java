package solutions.algorithms._0_999._168_Excel_Sheet_Column_Title;

class Solution {

    /*
    So basically it works like a base-26 number
    ... 26^3 + 26^2 + 26^1 + 26^00
    I can call mod 26 while the number > 26 and then assign to the result of division this number by 26
     */
    public String convertToTitle(int columnNumber) {

        StringBuilder sb = new StringBuilder();
        while (columnNumber != 0) {
            int div = (columnNumber - 1) % 26;
            sb.append((char) ('A' + div));
            columnNumber = (columnNumber - 1) / 26;
        }
        return sb.reverse().toString();
    }
}