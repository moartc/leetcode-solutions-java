package solutions.algorithms._0_999._502_IPO;

import java.util.PriorityQueue;

class Solution {

    /*
    Some random notes:
    it seems to always make sense to select a project with the highest profit - of course, one whose capital <= my current capital 'w'.

    I could use a PQ to poll the project with the highest profit.
    I have to fill this queue with new projects as my capital grows. Initially I can add all projects with capital <= w.

    I can have 2 priority queues, both storing pair <profit_i, capital_i>
    but, the first contains all projects, sorted in ascending order by capital
    the second is filled during processing - I add all projects (from the 1st queue) whose capital <= current capital.
    The second queue sorts values by profit in descending order.

    Additionally, obviously check that the number of used projects is < k
     */
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {

        PriorityQueue<Pair> pqAvailable = new PriorityQueue<>((o1, o2) -> o1.capital - o2.capital);
        PriorityQueue<Pair> pqBestChoice = new PriorityQueue<>((o1, o2) -> o2.profit - o1.profit);

        for (int i = 0; i < profits.length; i++) {
            int profit = profits[i];
            int cap = capital[i];
            pqAvailable.add(new Pair(profit, cap));
        }

        int ctr = 0;
        while (ctr < k) {
            // add projects to choose
            while (!pqAvailable.isEmpty() && pqAvailable.peek().capital <= w) {
                pqBestChoice.add(pqAvailable.poll());
            }

            if (!pqBestChoice.isEmpty()) {
                w += pqBestChoice.poll().profit;
            } else {
                return w;
            }
            ctr++;
        }
        return w;
    }

    static class Pair {
        public int profit;
        public int capital;

        public Pair(int profit, int capital) {
            this.profit = profit;
            this.capital = capital;
        }
    }
}