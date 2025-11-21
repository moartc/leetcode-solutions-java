package solutions.algorithms._0_999._410_Split_Array_Largest_Sum;

class Solution {


    /*
    Since it's a binary search problem, I can search between 2 numbers (Still need to figure out
    what the best initial boundaries would be)
    I need a method that checks whether a candidate value is possible. To do it, I can start from the left,
    keep adding values and whenever the sum exceeds the limit I start a new split and increase the counter

    update: with low 0 and max Integer.MAX_VALUE it beats 100%, so I am leaving it like that
     */
    public int splitArray(int[] nums, int k) {

        return binSearch(nums, k, 0, Integer.MAX_VALUE);
    }

    int binSearch(int[] nums, int k, int low, int high) {
        int mid = low + (high - low) / 2;

        if (low == high) {
            return high;
        }
        if (isValuePossible(nums, mid, k)) {
            return binSearch(nums, k, low, mid);
        } else {
            // should be higher
            return binSearch(nums, k, mid + 1, high);
        }

    }

    boolean isValuePossible(int[] prefix, int val, int k) {

        int currentCounter = 1;
        int currentSum = 0;
        for (int i : prefix) {
            if (i > val) {
                return false;
            }
            if (currentSum + i > val) {
                currentCounter++;
                if (currentCounter > k) {
                    return false;
                }
                // i goes to the next array
                currentSum = i;
            } else {
                currentSum += i;
            }
        }
        // I can ignore my counter, unless it's lover or equal 'k', it's fine
        return true;
    }
}