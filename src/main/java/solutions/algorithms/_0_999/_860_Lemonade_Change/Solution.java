package solutions.algorithms._0_999._860_Lemonade_Change;

class Solution {
    public boolean lemonadeChange(int[] bills) {

        // number of 5$, 10$ ,d 20$
        int[] arr = new int[]{0, 0, 0};

        for (int bill : bills) {
            if (bill == 5) { // only increase number of 5$
                arr[0]++;
            } else if (bill == 10) {
                if (arr[0] > 0) { // if can give back 5$ then do it - decrement, and add 10$
                    arr[0]--;
                    arr[1]++;
                } else { // if cannot give back 5$ return false
                    return false;
                }
            } else if (bill == 20) {
                if (arr[0] > 0 && arr[1] > 0) { // can give back 5$ and 10$
                    arr[0]--;
                    arr[1]--;
                    arr[2]++;
                } else if (arr[0] >= 3) { // can give back 3 x 5$
                    arr[0] -= 3;
                    arr[2]++;
                } else {
                    return false;
                }
            }
        }
        // all iterations were fine
        return true;
    }
}