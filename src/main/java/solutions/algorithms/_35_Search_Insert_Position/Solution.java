package solutions.algorithms._35_Search_Insert_Position;

class Solution {
    public int searchInsert(int[] nums, int target) {
        return search(0, nums.length - 1, nums, target);
    }

    public int search(int begin, int end, int[] array, int target) {
        int middle = (begin + end) / 2;
        int middleElement = array[middle];
        if (target < middleElement) {
            int diff = end - begin;
            if (diff <= 1) {
                return begin;
            } else {
                return search(begin, middle, array, target);
            }
        } else if (target > middleElement) {
            int diff = end - begin;
            if (diff <= 1) {
                if (target > array[end]) {
                    return end + 1;
                } else {
                    return end;
                }
            } else {
                return search(middle + 1, end, array, target);
            }
        } else {
            return middle;
        }
    }
}