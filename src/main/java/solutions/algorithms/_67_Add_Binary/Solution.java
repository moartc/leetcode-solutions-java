package solutions.algorithms._67_Add_Binary;

class Solution {

    public String addBinary(String a, String b) {

        String longer;
        String shorter;
        if (a.length() >= b.length()) {
            longer = a;
            shorter = b;
        } else {
            longer = b;
            shorter = a;
        }
        int longerLength = longer.length();
        int shorterLength = shorter.length();
        StringBuilder result = new StringBuilder();
        boolean moved = false;
        int i = 1;
        while (i <= shorterLength) {
            int longerIndex = longerLength - i;
            int shorterIndex = shorterLength - i;
            char longerChar = longer.charAt(longerIndex);
            char shorterChar = shorter.charAt(shorterIndex);
            if (longerChar != shorterChar) {
                result.append(moved ? 0 : 1);
            } else {
                if (longerChar == '1') {
                    result.append(moved ? 1 : 0);
                    moved = true;
                } else {
                    result.append(moved ? 1 : 0);
                    moved = false;
                }
            }
            i++;
        }
        while (i <= longerLength) {
            if (longer.charAt(longerLength - i) == '1') {
                result.append(moved ? 0 : 1);
            } else {
                result.append(moved ? 1 : 0);
                result.reverse().insert(0, longer.substring(0, longerLength - i));
                return result.toString();
            }
            i++;
        }
        if (moved) {
            result.append(1);
        }
        return result.reverse().toString();
    }
}