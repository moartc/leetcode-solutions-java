package solutions.algorithms._1000_1999._1095_Find_in_Mountain_Array;


// class for test
class MountainArray {

    int[] arr;

    public MountainArray(int[] arr) {
        this.arr = arr;
    }

    public int get(int index) {
        return arr[index];
    }

    public int length() {
        return arr.length;
    }
}

/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 * public int get(int index) {}
 * public int length() {}
 * }
 */

class Solution {

    /*
    I could find the peak - the max value in the array
    Then I can search for the target on the left side of it and on the right side
    it's actually a correct solution - beats 100%
     */
    public int findInMountainArray(int target, MountainArray mountainArr) {

        int mal = mountainArr.length() - 1;
        int middle = midRec(mountainArr, 0, mal);
        // apparently middle also counts
        if (mountainArr.get(middle) == target) {
            return middle;
        }
        int leftIdx = findAsc(mountainArr, target, 0, middle - 1);
        if (leftIdx != -1) {
            // if it's in the left part - then this index is lower
            return leftIdx;
        } else {
            // let's check the right part
            return findDesc(mountainArr, target, middle + 1, mal);
        }
    }

    int findAsc(MountainArray ma, int target, int low, int high) {
        if (low >= high) {
            return ma.get(low) == target ? low : -1;
        }
        int mid = low + (high - low) / 2;
        int midVal = ma.get(mid);
        if (midVal == target) {
            return mid;
        } else if (midVal < target) {
            return findAsc(ma, target, mid + 1, high);
        } else {
            return findAsc(ma, target, low, mid - 1);
        }
    }

    int findDesc(MountainArray ma, int target, int low, int high) {
        if (low >= high) {
            return ma.get(low) == target ? low : -1;
        }
        int mid = low + (high - low) / 2;
        int midVal = ma.get(mid);
        if (midVal == target) {
            return mid;
        } else if (midVal < target) {
            return findDesc(ma, target, low, mid - 1);
        } else {
            return findDesc(ma, target, mid + 1, high);
        }
    }


    int midRec(MountainArray ma, int left, int right) {
        if (left == right) {
            return right;
        }
        int mid = left + (right - left) / 2;
        if (ma.get(mid) < ma.get(mid + 1)) {
            // grows so search on the right
            return midRec(ma, mid + 1, right);
        } else {
            return midRec(ma, left, mid);
        }
    }
}