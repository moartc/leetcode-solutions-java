package solutions.algorithms._1000_1999._1344_Angle_Between_Hands_of_a_Clock;

class Solution {

    /*
    let's say angle at 12:00 is equal to 0
    1 hour moves the hour hand by 360 / 12 degree = 30 degrees
    60 minutes would move hour hand by another 30 degrees so 1 minute moves it by 0.5 degree
    also: map 12 to 0
    1 minute moves minute hand by 6 degrees

    solution calc the angles of the hour minute hands, then check their difference (minute - hour)

    also: the angle should be < 180, so I might need to add the angles from both sides of 12

     */
    public double angleClock(int hour, int minutes) {

        double hourAngle = (hour == 12 ? 0 : hour * 30) + (minutes * 0.5);
        double minuteAngle = minutes * 6;

        double firstSol = Math.abs(minuteAngle - hourAngle);
        if (firstSol > 180) {
            return 360 - Math.max(minuteAngle, hourAngle) + Math.min(minuteAngle, hourAngle);
        } else {
            return firstSol;
        }
    }
}