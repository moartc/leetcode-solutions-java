package solutions.algorithms._1000_1999._1404_Number_of_Steps_to_Reduce_a_Number_in_Binary_Representation_to_One;

class Solution {

    /*
    I should probably keep it as a string instead of converting it to an int. Otherwise, the whole task is pretty easy.

    I can iterate from right to left and:
    when I see 0 -> move forward left
    1 -> change it (in mind) to 0 and carry '1' to the left, when I find '0' set it to 1.
    Basically the only thing I need to track is if I have a carry '1' or not.
    1 1 0 1
    1 1 1 0
      1 1 1
    1 0 0 0
      1 0 0
        1 0
          1
     */

    public int numSteps(String s) {

        int ctr = 0;
        boolean carry1 = false;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c == '0') {
                if (carry1) {
                    ctr += 2;
                } else {
                    ctr++;
                }
            } else { // c == '1'
                if (i == 0) {
                    if (carry1) {
                        return ctr + 2;
                    } else {
                        return ctr;
                    }
                } else {
                    if (carry1) {
                        ctr += 1;
                    } else {
                        carry1 = true;
                        ctr += 1;
                    }
                }
            }
        }
        return ctr;
    }
}