package solutions.algorithms._1000_1999._1833_Maximum_Ice_Cream_Bars;

class Solution {
    public int maxIceCream(int[] costs, int coins) {

        int[] costArr = new int[100001];

        // I;m not sure if that's a counting sort xD
        for (int cost : costs) {
            costArr[cost]++;
        }
        int answer = 0;
        for (int i = 0; i < costArr.length; i++) {
            while (costArr[i] > 0 && i <= coins) {
                answer++;
                coins -= i;
                costArr[i]--;
            }
        }
        return answer;
    }
}