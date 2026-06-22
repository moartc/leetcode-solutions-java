package solutions.algorithms._1000_1999._1189_Maximum_Number_of_Balloons;

class Solution {

    /*
    1 instance of the word "balloon" needs
    1 'b'
    1 'a'
    2 'l'
    2 'o'
    1 'n'
    I can track all chars and check find the min possible number of 'ballon's I can build
     */
    public int maxNumberOfBalloons(String text) {
        int bctr = 0;
        int actr = 0;
        int lctr = 0;
        int octr = 0;
        int nctr = 0;

        for (char c : text.toCharArray()) {
            if (c == 'b') {
                bctr++;
            } else if (c == 'a') {
                actr++;
            } else if (c == 'l') {
                lctr++;
            } else if (c == 'o') {
                octr++;
            } else if (c == 'n') {
                nctr++;
            }
        }

        int min = bctr;
        min = Math.min(min, actr);
        min = Math.min(min, lctr / 2);
        min = Math.min(min, octr / 2);
        min = Math.min(min, nctr);
        return min;
    }
}