package solutions.algorithms._3000_3999._3894_Traffic_Signal_Color;

class Solution {
    public String trafficSignal(int timer) {

        if (timer == 0) {
            return "Green";
        } else if (timer == 30) {
            return "Orange";
        } else if (timer > 30 && timer <= 90) {
            return "Red";
        }
        return "Invalid";
    }
}