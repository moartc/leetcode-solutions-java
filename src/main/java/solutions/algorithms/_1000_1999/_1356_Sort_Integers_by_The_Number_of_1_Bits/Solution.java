package solutions.algorithms._1000_1999._1356_Sort_Integers_by_The_Number_of_1_Bits;

import java.util.Arrays;

class Solution {

    /*
    I can sort the integers using a comparator that during the comparison, checks the number of bits
     */
    public int[] sortByBits(int[] arr) {

        Integer[] boxedArray = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(boxedArray, (a, b) -> {
            int aBits = Integer.bitCount(a);
            int bBits = Integer.bitCount(b);
            if (aBits != bBits) {
                return aBits - bBits;
            } else {
                return a - b;
            }
        });
        for (int i = 0; i < boxedArray.length; i++) {
            arr[i] = boxedArray[i];
        }
        return arr;
    }
}