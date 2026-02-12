package solutions.algorithms._0_999._315_Count_of_Smaller_Numbers_After_Self;

import java.util.ArrayList;
import java.util.List;

class Solution {

    /*
    Brute force would be O(n^2)
    I could improve it slightly by iterating backwards and:
    for the element at index i, I would iterate to the right until the end of the array
    counting elements.
    when I find the same element I add the current counter value + value already calculated
    but it doesn't seem like a big improvement, and it gives me TLE for 64/66

    I could implement a sorting method that sorts these elements and additionally stores
    their indices, or map each of them to a pair val index and sort by key without implementing anything
    for: 5,2,1,6
    I would have values sorted: 1 2 5 6
    and indices: 2 1 0 3, so simply sorting with indices is rather useless

    ok, after checking some hints -> I need to use merge sort and during merging check which element is greater.
    if the left one then I can increase its counter

     */
    public List<Integer> countSmaller(int[] nums) {

        int[][] numsWithIndices = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            numsWithIndices[i] = new int[]{nums[i], i};
        }
        int[] result = new int[nums.length];
        mergeSort(numsWithIndices, 0, numsWithIndices.length - 1, result);

        List<Integer> listRes = new ArrayList<>();
        for (int i : result) {
            listRes.add(i);
        }
        return listRes;
    }


    int[][] mergeSort(int[][] numsWithIndices, int l, int r, int[] finalResult) {

        if (l == r) {
            return new int[][]{numsWithIndices[l]};
        } else {
            int middle = (r + l) / 2;
            int[][] left = mergeSort(numsWithIndices, l, middle, finalResult);
            int[][] right = mergeSort(numsWithIndices, middle + 1, r, finalResult);
            return merge(left, right, finalResult);
        }
    }

    int[][] merge(int[][] left, int[][] right, int[] finalResult) {
        int[][] result = new int[left.length + right.length][2];
        int resIdx = 0;
        int li = 0;
        int ri = 0;
        int rightCtr = 0;

        while (li < left.length && ri < right.length) {
            if (left[li][0] <= right[ri][0]) {
                result[resIdx] = left[li];
                finalResult[left[li][1]] += rightCtr;
                li++;
            } else {
                // right is lower than left
                result[resIdx] = right[ri];
                rightCtr++;
                ri++;
            }
            resIdx++;
        }
        while (li < left.length) {
            result[resIdx] = left[li];
            resIdx++;
            finalResult[left[li][1]] += rightCtr;
            li++;
        }
        while (ri < right.length) {
            result[resIdx] = right[ri];
            resIdx++;
            ri++;
        }
        return result;
    }

}