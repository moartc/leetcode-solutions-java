package solutions.algorithms._0_999._41_First_Missing_Positive;

class Solution {

    /*
    for n numbers the highest possible answer is n+1, in the case when I have [1,2,3...n] in the array

    hint 1 - how would I solve it in non-constant space?
    I would track the number of occurrences of all relevant numbers [1 .. n]
    I could probably use the ith position to mark the number i
    I need a recursive call for that because the index might already be taken and to mark them I will use Integer.MAX

    update:
    recursive swapping doesn't make sense in that case - just swap it and then stay at the same index (without incrementing i)
     */
    public int firstMissingPositive(int[] nums) {

        int i = 0;
        while (i < nums.length) {
            int curr = nums[i];
            if (curr >= 1 && curr <= nums.length) {
                int elementAtDestinationIndex = nums[curr - 1];
                if (elementAtDestinationIndex == curr) {
                    // nothing to do
                    i++;
                } else if (elementAtDestinationIndex >= 1 && elementAtDestinationIndex <= nums.length) {
                    // also valid, swap but stay
                    swap(curr - 1, i, nums);
                } else {
                    // safe swap
                    swap(i, curr - 1, nums);
                    i++;
                }
            } else {
                // do nothing
                i++;
            }
        }

        int exp = 1;
        for (int num : nums) {
            if (num != exp) {
                return exp;
            }
            exp++;
        }

        return exp;

        // below non O(1) space solution
//        int []arr = new int [nums.length+1];
//
//        for (int num : nums) {
//            if(num >=1 && num <arr.length) {
//                arr[num]++;
//            }
//        }
//
//        for (int i = 1; i < arr.length; i++) {
//            if(arr[i] == 0) {
//                return i;
//            }
//        }
//        return nums.length+1;
    }

    void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}