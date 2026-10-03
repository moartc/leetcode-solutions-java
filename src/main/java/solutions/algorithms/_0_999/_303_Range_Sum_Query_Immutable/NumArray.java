package solutions.algorithms._0_999._303_Range_Sum_Query_Immutable;

class NumArray {

    private int[] leftSum;

    public NumArray(int[] nums) {
        leftSum = new int[nums.length];
        leftSum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            leftSum[i] = leftSum[i - 1] + nums[i];
        }
    }

    public int sumRange(int left, int right) {

        int toRet = leftSum[right];
        if (left > 0) {
            toRet -= leftSum[left - 1];
        }
        return toRet;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */