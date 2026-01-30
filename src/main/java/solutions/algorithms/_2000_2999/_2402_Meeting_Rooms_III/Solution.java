package solutions.algorithms._2000_2999._2402_Meeting_Rooms_III;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {


    /*
    I could maintain an array of rooms with the time when the next meeting ends
    I can sort meetings by their start times (they are unique - which makes it easier)

    then I iterate through the rooms and look for the first one that is free
    I assign the current meeting to it and update the room's end time to the meeting's end time
    If I cannot find a free room I pick the one with the minimal end time (during the same iteration
    (unless I want to use a PQ or something)).
    Then I move to the next meeting.
    I also keep track of the assignments for each room

    update: I made some small changes during implementation, but the initial idea was decent.
    it failed on testcase 81 with pretty big integers, probably due to int overflow. Changing it to long fixed the issue.
    it beats 5%

    ok, so the 2nd hint says I can use 2 min heaps.
    I will keep empty rooms in one heap (ordered by room id) and the 2nd heap will store rooms ordered by end time (and room id).
    for each new meeting I check its start time and move all rooms whose endtime <= this start time from the 2nd heap to the first heap
    Then I pick a room from the first heap. If it's empty, I take the top room from the 2nd heap instead.
     */
    public int mostBooked(int n, int[][] meetings) {

        int[] roomCtr = new int[n];
        Arrays.sort(meetings, Comparator.comparingInt(o -> o[0]));

        PriorityQueue<Integer> emptyRoomIds = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            emptyRoomIds.add(i);
        }
        // I keep here room id mapped to its end time
        PriorityQueue<long[]> heapRooms = new PriorityQueue<>((o1, o2) -> {
            if (o1[1] != o2[1]) {
                return Long.compare(o1[1], o2[1]);
            } else {
                return Long.compare(o1[0], o2[0]);
            }
        });

        int currentBestCounter = 0;
        int bestRoom = 0;

        for (int[] meeting : meetings) {
            int startTime = meeting[0];
            int endTime = meeting[1];
            int roomId;
            long endAt;
            // ************** find a room part **************
            // first move all from the 2nd to the first one
            while (!heapRooms.isEmpty() && heapRooms.peek()[1] <= startTime) {
                long[] poll = heapRooms.poll();
                emptyRoomIds.add((int) poll[0]);
            }
            // then take the first one from empty
            if (!emptyRoomIds.isEmpty()) {
                roomId = emptyRoomIds.poll();
                endAt = endTime;
            } else {
                // nothing to take, take the one from the 2nd heap
                long[] room = heapRooms.poll();
                roomId = (int) room[0];
                long roomEndTime = room[1];
                endAt = roomEndTime + (endTime - startTime);
            }
            long[] newRoomToAdd = new long[]{roomId, endAt};
            heapRooms.add(newRoomToAdd);
            roomCtr[roomId]++;
            if (roomCtr[roomId] >= currentBestCounter) {
                if (roomCtr[roomId] == currentBestCounter) {
                    bestRoom = Math.min(bestRoom, roomId);
                } else {
                    currentBestCounter = roomCtr[roomId];
                    bestRoom = roomId;
                }
            }
        }
        return bestRoom;
    }
}