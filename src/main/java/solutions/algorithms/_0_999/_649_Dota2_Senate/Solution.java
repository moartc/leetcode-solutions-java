package solutions.algorithms._0_999._649_Dota2_Senate;

class Solution {

    /*
    So basically if there are still senators from both parties in the game, the one that gets a turn bans the other one.

    I can iterate through the array:
    track counts for 'D' and 'R',
    when I see a 'D' I increase a removal counter for 'R'
    when I see an 'R' I increase a removal counter for 'D'
    when I encounter a 'D' or 'R' I check if its the removal is > 0, if so, I mark it as deleted
    (by updating the character in the string).
    When I reach the end and there are still R > 0 && D > 0, I iterate again until one
    of these values drops to 0.
     */
    public String predictPartyVictory(String senate) {

        char[] charArray = senate.toCharArray();

        // these counters should stay after a single round
        int dToDelete = 0;
        int rToDelete = 0;

        while (true) {
            // this I have to count per round
            int dCtr = 0;
            int rCtr = 0;
            for (int i = 0; i < charArray.length; i++) {
                char c = charArray[i];
                if (c == 'D') {
                    if (dToDelete > 0) {
                        // let's assume it was deleted before by R
                        charArray[i] = 'X';
                        dToDelete--;

                    } else {
                        dCtr++;
                        rToDelete++;
                    }
                } else if (c == 'R') { // R
                    if (rToDelete > 0) {
                        // let's assume it was deleted before by R
                        charArray[i] = 'X';
                        rToDelete--;
                    } else {
                        rCtr++;
                        dToDelete++;
                    }
                }
            }

            if (dCtr == 0) {
                return "Radiant";
            } else if (rCtr == 0) {
                return "Dire";
            }
        }
    }
}