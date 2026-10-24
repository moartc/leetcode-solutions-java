package solutions.algorithms._2000_2999._2409_Count_Days_Spent_Together;

class Solution {

    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {


        int[] days = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int arriveA = getDayNr(arriveAlice, days);
        int leaveA = getDayNr(leaveAlice, days);
        int arriveB = getDayNr(arriveBob, days);
        int leaveB = getDayNr(leaveBob, days);

        int maxArrive = Math.max(arriveA, arriveB);
        int minLeave = Math.min(leaveA, leaveB);

        int daysTogether = minLeave - maxArrive + 1;
        return Math.max(daysTogether, 0);
    }

    int getDayNr(String date, int[] days) {
        int month = Integer.parseInt(date.substring(0, 2));
        int day = Integer.parseInt(date.substring(3, 5));

        int nr = 0;
        for (int i = 0; i < month - 1; i++) {
            nr += days[i];
        }
        return nr + day;
    }
}