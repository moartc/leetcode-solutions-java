package solutions.algorithms._0_999._43_Multiply_Strings;

class Solution {

    /*
    I could iterate in reverse order through both strings
    like in regular school multiplication (example below)
    multiply 2 integers (I can get them from characters) and carry over the rest forward (oor rather backward)
    and if anything is left in one of the strings, I can just add it

        123
        456
    -------
        738
       615
      492
   --------
      56088


    update:
    Instead of storing a single row I can add them in the first loop.
    1: (0,0)
    2: (0,1) + (1,0)
    3: (0,2) + (1,1) + (2,0) , so basically i + j, reminder goes to the next index

     */
    public String multiply(String num1, String num2) {

        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        char[] numArr1 = num1.toCharArray();
        char[] numArr2 = num2.toCharArray();
        // the product of two numbers with lengths m and n has at most m + n digits
        int[] res = new int[num1.length() + num2.length()];
        for (int j = numArr2.length - 1; j >= 0; j--) {
            for (int i = numArr1.length - 1; i >= 0; i--) {
                char c1 = numArr1[i];
                char c2 = numArr2[j];
                int i1 = c1 - 48;
                int i2 = c2 - 48;
                // what I already have + current result of multiplication
                int currentSum = res[i + j + 1] + (i1 * i2);
                // for max i and j, to add it at the end of the array I have to add 1
                res[i + j + 1] = currentSum % 10;
                res[i + j] += currentSum / 10;
            }
        }

        StringBuilder sb = new StringBuilder();
        boolean wasAlreadyNonZero = false;
        for (int v : res) {
            if (v == 0) {
                if (wasAlreadyNonZero) { // if false, it means it's the leading zero - skip it
                    sb.append(v);
                }
            } else {
                sb.append(v);
                wasAlreadyNonZero = true;
            }
        }
        return sb.toString();
    }
}