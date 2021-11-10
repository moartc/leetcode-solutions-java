package solutions._168_Excel_Sheet_Column_Title;

class Solution {
    public String convertToTitle(int columnNumber) {

        int integer = columnNumber;
        int rest = columnNumber;
        StringBuilder sb = new StringBuilder();
        while (integer != 0) {
            rest = (integer - 1) % 26;
            integer = (integer - 1) / 26;
            if (integer != 0) {
                sb.append(getChar(rest + 1));
            }
        }
        sb.append(getChar(rest + 1));
        return sb.reverse().toString();
    }

    private char getChar(int value) {
        return (char) (value + 64);
    }
}