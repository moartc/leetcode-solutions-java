package solutions.algorithms._3000_3999._3863_Minimum_Operations_to_Sort_a_String;

class Solution {

    /*
    If I can do it at all, I should be able to do it in max 2 moves
    0. if there are only 2 chars -> unsorted -> -1
    1. if the biggest char is at the beginning or the lowest at the end I always have to make 3 changes
    2. if the string is already sorted -> 0
    3. if the lowest is at the beginning or the greatest at the end I need only 1 change -> sort the remaining part
    4. otherwise 2 moves
     */
    public int minOperations(String s) {

        char[] array = s.toCharArray();
        if (array.length < 2) {
            // nothing to do
            return 0;
        } else if (array.length == 2) {
            if (array[0] <= array[1]) {
                return 0;
            } else {
                // unsolvable case
                return -1;
            }
        } else { // length > 2
            // iterate once and collect data
            char first = array[0];
            char last = array[array.length - 1];
            boolean firstTheLowest = true;
            boolean lastTheLowest = true;
            boolean firstTheBiggest = true;
            boolean lastTheBiggest = true;

            boolean isSorted = true;

            for (int i = 0; i < array.length; i++) {
                char curr = array[i];

                if (i > 0 && array[i - 1] > array[i]) {
                    isSorted = false;
                }
                if (i > 0 && curr < first) {
                    firstTheLowest = false;
                }
                if (i > 0 && curr >= first) {
                    firstTheBiggest = false;
                }
                if (i != array.length - 1 && curr <= last) {
                    lastTheLowest = false;
                }
                if (i != array.length - 1 && curr > last) {
                    lastTheBiggest = false;
                }
            }

            if (isSorted) {
                return 0;
            }
            if (firstTheLowest || lastTheBiggest) {
                return 1;
            }
            if (firstTheBiggest && lastTheLowest) {
                return 3;
            } else {
                return 2;
            }
        }
    }
}