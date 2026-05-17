package solutions.algorithms._1000_1999._1306_Jump_Game_III;

class Solution {
    boolean[] visited;

    public boolean canReach(int[] arr, int start) {

        visited = new boolean[arr.length];
        return check(start, arr);
    }

    boolean check(int curr, int[] arr) {
        visited[curr] = true;
        int currValue = arr[curr];
        if (currValue == 0) {
            return true;
        }
        int left = curr - currValue;
        int right = curr + currValue;
        if (left >= 0 && !visited[left]) {
            if (check(left, arr)) {
                return true;
            }
        }
        if (right < arr.length && !visited[right]) {
            if (check(right, arr)) {
                return true;
            }
        }
        return false;
    }
}