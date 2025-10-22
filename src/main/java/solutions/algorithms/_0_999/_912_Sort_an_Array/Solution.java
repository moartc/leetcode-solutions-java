package solutions.algorithms._0_999._912_Sort_an_Array;

class Solution {

    /*
    I am implementing quick-sort, but it gives me TLE, the implementation is commented out below
    next: merge sort
    and it's, beats 77%
     */

    public int[] sortArray(int[] nums) {

//        quickSoqrt(nums, 0, nums.length - 1);
        return mergeSort(nums, 0, nums.length - 1);
    }

    private int[] mergeSort(int[] nums, int i, int j) {

        if (i == j) {
            // do nothing
            return new int[]{nums[i]};
        }
        if (j - i == 1) {
            // only 2 elements - merge them
            if (nums[i] <= nums[j]) {
                return new int[]{nums[i], nums[j]};
            } else {
                return new int[]{nums[j], nums[i]};
            }
        } else {
            int middleRight = (j + i + 1) / 2;
            int[] leftArr = mergeSort(nums, i, middleRight - 1);
            int[] rightArray = mergeSort(nums, middleRight, j);
            return merge(leftArr, rightArray);
        }

    }

    private int[] merge(int[] arr1, int[] arr2) {

        int[] arr = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < arr1.length && j < arr2.length) {
            int v1 = arr1[i];
            int v2 = arr2[j];
            if (v1 <= v2) {
                arr[k] = v1;
                i++;
            } else { // v2 < v1
                arr[k] = v2;
                j++;
            }
            k++;
        }

        // there might be one array still to process, but only one
        while (i < arr1.length) {
            arr[k] = arr1[i];
            k++;
            i++;
        }
        while (j < arr2.length) {
            arr[k] = arr2[j];
            k++;
            j++;
        }
        return arr;
    }


//    void quickSoqrt(int[] nums, int left, int right) {
//
//        if (left >= right) {
//            return;
//        }
//        int pivot = nums[right];
//        int i = left;
//
//        for (int j = left; j < right; j++) {
//            if (nums[j] < pivot) {
//                swap(i, j, nums);
//                i++;
//            }
//        }
//
//        swap(i, right, nums);
//        quickSoqrt(nums, left, i - 1);
//        quickSoqrt(nums, i + 1, right);
//    }

    void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
