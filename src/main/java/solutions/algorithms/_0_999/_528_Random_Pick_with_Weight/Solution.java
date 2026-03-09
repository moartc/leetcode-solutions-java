package solutions.algorithms._0_999._528_Random_Pick_with_Weight;

class Solution {

    int[] w;
    int totalSum = 0;
    // [1,2,3,4,5]
    // [1,3,6,10,15]
    int[] prefixSum;

    public Solution(int[] w) {
        this.w = w;
        prefixSum = new int[w.length];
        for (int i = 0; i < w.length; i++) {
            totalSum += w[i];
            prefixSum[i] = totalSum;
        }
    }

    public int pickIndex() {
        int random = getRandomNumber(1, totalSum);
        return findIndexIter(prefixSum, random);
    }

    private int findIndexIter(int[] prefixSum, int value) {
        int left = 0;
        int right = prefixSum.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (prefixSum[mid] < value) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min + 1)) + min);
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */