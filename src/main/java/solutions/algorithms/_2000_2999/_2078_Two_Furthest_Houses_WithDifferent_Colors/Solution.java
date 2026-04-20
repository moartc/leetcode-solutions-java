package solutions.algorithms._2000_2999._2078_Two_Furthest_Houses_WithDifferent_Colors;

class Solution {
    public int maxDistance(int[] colors) {

        if (colors.length == 0) {
            return 0;
        }
        int max = 0;
        int left = colors[0];
        for (int i = 0; i < colors.length; i++) {
            if (colors[i] != left) {
                max = Math.max(i, max);
            }
        }
        int right = colors[colors.length - 1];
        for (int i = colors.length - 2; i >= 0; i--) {
            if (colors[i] != right) {
                max = Math.max(colors.length - 1 - i, max);
            }
        }
        return max;
    }
}