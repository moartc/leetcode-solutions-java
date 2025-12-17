package solutions.algorithms._1000_1999._1834_Single_Threaded_CPU;

import java.util.Arrays;
import java.util.PriorityQueue;

class Solution {

    /*

    The first task processed is always the one with the lowest enqueue time, then processing time.
    I could add all tasks to a PQ where the top has the task  with the lowest time.
    when the processor is idle, I get all tasks from that queue, whose enqueue time is less than or equal to the current timestamp.
    while taking them out I add them to a 2nd queue, which sorts by processing time (shortest to longest).
    then I take the first one from the 2nd queue and process it, at the end I update the current time and repeat the process - moving
     new tasks from the 1st queue to the 2nd, then taking the top from the 2nd, processing it, updating the time and repeating.

     update: I need to track the index of each task,
     so instead of [enqueueTime, processingTime] I will track [enqueueTime, processingTime, index]

     update:
     it beats only 10%, I am replacing the first queue and I will just keep them in sorted array
     */
    public int[] getOrder(int[][] tasks) {

        int[][] enrichedTasks = new int[tasks.length][3];
        PriorityQueue<int[]> pqProcessingTime = new PriorityQueue<>((o1, o2) -> {
            int comp = o1[1] - o2[1];
            if (comp == 0) {
                return o1[2] - o2[2];
            } else {
                return comp;
            }
        });

        // just add all of them to the enqueue time queue
        for (int i = 0; i < tasks.length; i++) {
            int[] task = tasks[i];
            int[] enrichedTask = new int[3];
            enrichedTask[0] = task[0];
            enrichedTask[1] = task[1];
            enrichedTask[2] = i;
            enrichedTasks[i] = enrichedTask;
        }

        Arrays.sort(enrichedTasks, (o1, o2) -> o1[0] - o2[0]);
        int[] answer = new int[tasks.length];
        int counter = 0;
        int currentTimestamp = -1;
        int taskCounter = 0;
        while (taskCounter < tasks.length || !pqProcessingTime.isEmpty()) {

            if (currentTimestamp == -1) {
                // just set the initial timestamp
                currentTimestamp = enrichedTasks[taskCounter][0];
            }
            // move all with the timestamp <= to the current one to the 2nd queue
            while (taskCounter < enrichedTasks.length && enrichedTasks[taskCounter][0] <= currentTimestamp) {
                pqProcessingTime.add(enrichedTasks[taskCounter]);
                taskCounter++;
            }

            // handle the case when I still have something in pqEnqueue, but I have to wait for the next task
            if (pqProcessingTime.isEmpty()) {
                currentTimestamp = enrichedTasks[taskCounter][0];
                continue;
            }


            // now I can get the top from the 2nd one and process it
            int[] processedTask = pqProcessingTime.poll();
            answer[counter] = processedTask[2];
            counter++;
            currentTimestamp = currentTimestamp + processedTask[1];
        }

        return answer;
    }
}