package solutions.algorithms._0_999._47_Permutations_II;

import java.util.*;

class Solution {

    public List<List<Integer>> permuteUnique(int[] nums) {

        Set<List<Integer>> collector = new HashSet<>();
        generate(nums, nums.length, collector);
        return new ArrayList<>(collector);
    }

    void generate(int[] nums, int length, Set<List<Integer>> generated) {
        if (length == 1) {
            List<Integer> integers = Arrays.stream(nums).boxed().toList();
            generated.add(integers);
        } else {
            generate(nums, length - 1, generated);
            for (int i = 0; i < length - 1; i++) {
                if (length % 2 == 0) {
                    swap(nums, i, length - 1);
                } else {
                    swap(nums, 0, length - 1);
                }
                generate(nums, length - 1, generated);
            }
        }
    }

    void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
