package solutions.algorithms._0_999._268_Missing_Number;

class Solution {

    /*
      Few first bin numbers
      0  -> 0000
      1  -> 0001
      2  -> 0010
      3  -> 0011

      4  -> 0100
      5  -> 0101
      6  -> 0110
      7  -> 0111

      8  -> 1000
      9  -> 1001
      10 -> 1010
      11 -> 1011

      It looks like if I xor all numbers in one group (4 consecutive numbers), the result should be zero.
      If any number is missing, then the xor result is equal to the missing number.
      For example: 0 xor 1 xor 2 xor 2 id equal to 3
     */
    public int missingNumber(int[] nums) {

        int numberOfNumbersInLastGroup = (nums.length + 1) % 4;
        int xorOfMissing;
        if (numberOfNumbersInLastGroup != 0) {
            int missingNumbers = 4 - numberOfNumbersInLastGroup;
            xorOfMissing = nums.length + 1;
            for (int i = 0; i < missingNumbers - 1; i++) {
                xorOfMissing ^= ++xorOfMissing;
            }
        } else {
            xorOfMissing = 0;
        }
        for (int num : nums) {
            xorOfMissing ^= num;
        }
        return xorOfMissing;
    }
}