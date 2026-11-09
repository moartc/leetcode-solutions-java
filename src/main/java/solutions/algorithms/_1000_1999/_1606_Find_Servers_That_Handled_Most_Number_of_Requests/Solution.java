package solutions.algorithms._1000_1999._1606_Find_Servers_That_Handled_Most_Number_of_Requests;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.TreeSet;

class Solution {
    public List<Integer> busiestServers(int k, int[] arrival, int[] load) {

        int[] businessCounter = new int[k];

        TreeSet<Integer> availableServers = new TreeSet<>();
        PriorityQueue<int[]> timeOfEndToId = new PriorityQueue<>((o1, o2) -> o1[0] - o2[0]);

        for (int i = 0; i < k; i++) {
            availableServers.add(i);
        }

        for (int i = 0; i < arrival.length; i++) {
            int arr = arrival[i];
            int l = load[i];

            // check if any free
            while (!timeOfEndToId.isEmpty() && timeOfEndToId.peek()[0] <= arr) {
                int[] serverToFree = timeOfEndToId.poll();
                availableServers.add(serverToFree[1]);
            }

            if (availableServers.isEmpty()) {
                continue;
            }


            Integer serverToUse = availableServers.ceiling(i % k);
            if (serverToUse == null) {
                serverToUse = availableServers.first();
            }

            businessCounter[serverToUse]++;

            availableServers.remove(serverToUse);
            timeOfEndToId.add(new int[]{arr + l, serverToUse});
        }

        int theBusiest = -1;
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < businessCounter.length; i++) {
            int idx = i;
            int numberOfUse = businessCounter[i];
            if (numberOfUse > theBusiest) {
                theBusiest = numberOfUse;
                answer.clear();
                answer.add(idx);
            } else if (numberOfUse < theBusiest) {
                continue;
            } else { // ==
                answer.add(idx);
            }
        }
        return answer;
    }
}