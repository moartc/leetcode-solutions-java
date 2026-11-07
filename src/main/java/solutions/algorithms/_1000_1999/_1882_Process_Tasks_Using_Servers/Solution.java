package solutions.algorithms._1000_1999._1882_Process_Tasks_Using_Servers;

import java.util.PriorityQueue;

class Solution {
    public int[] assignTasks(int[] servers, int[] tasks) {


        int[] answer = new int[tasks.length];
        // weight, idx
        PriorityQueue<long[]> freeServers = new PriorityQueue<>((o1, o2) -> {
            if (o1[0] == o2[0]) {
                return Long.compare(o1[1], o2[1]);
            } else {
                return Long.compare(o1[0], o2[0]);
            }
        });
        // idx, weight, time
        PriorityQueue<long[]> serverFinishTime = new PriorityQueue<>((o1, o2) -> {
            if (o1[2] == o2[2]) {
                if (o1[1] == o2[1]) {
                    return Long.compare(o1[0], o2[0]);
                } else {
                    return Long.compare(o1[1], o2[1]);
                }
            } else {
                return Long.compare(o1[2], o2[2]);
            }
        });

        long time = 0;
        for (int i = 0; i < servers.length; i++) {
            int serverWeight = servers[i];
            freeServers.add(new long[]{serverWeight, i});
        }

        ex:
        for (int i = 0; i < tasks.length; i++) {
            int task = tasks[i];

            time = Math.max(time, i);

            // release all free
            while (!serverFinishTime.isEmpty() && serverFinishTime.peek()[2] <= time) {
                long[] firstThatFinish = serverFinishTime.poll();
                long sIdx = firstThatFinish[0];
                long sWeight = firstThatFinish[1];
                long newTime = firstThatFinish[2];
                freeServers.add(new long[]{sWeight, sIdx});
            }

            while (true) {
                if (!freeServers.isEmpty()) {
                    long[] firstFree = freeServers.poll();
                    long freeWeight = firstFree[0];
                    long freeIdx = firstFree[1];
                    answer[i] = (int) freeIdx;
                    serverFinishTime.add(new long[]{freeIdx, freeWeight, time + task});
                    continue ex;
                } else {
                    // wait
                    long[] firstThatFinish = serverFinishTime.poll();
                    long sIdx = firstThatFinish[0];
                    long sWeight = firstThatFinish[1];
                    long newTime = firstThatFinish[2];
                    freeServers.add(new long[]{sWeight, sIdx});
                    time = newTime;
                }
            }
        }
        return answer;
    }
}