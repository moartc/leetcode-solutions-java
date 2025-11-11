package solutions.algorithms._0_999._735_Asteroid_Collision;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution {
    /*
    I can iterate through all asteroids and add them into 2 stacks
    one for those with a positive sign (moving right) and one for those with a negative sign (moving left)
    I check if both stacks contain elements, if so I compare them and assess what happens,
    one is destroyed, and the other goes back to its stack
     */
    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> neg = new Stack<>();
        Stack<Integer> positive = new Stack<>();
        List<Integer> ansNeg = new ArrayList<>();
        for (int ast : asteroids) {
            if (ast < 0) {
                neg.add(ast);
            } else {
                positive.add(ast);
            }
            while (!neg.isEmpty() && !positive.isEmpty()) {
                int n = neg.pop();
                int p = positive.pop();
                if (-n > p) {
                    neg.add(n);
                } else if (p > -n) {
                    positive.add(p);
                } // else both are destroyed

            }
            while (!neg.isEmpty()) {
                ansNeg.add(neg.pop());
            }
        }

        int[] toRet = new int[ansNeg.size() + positive.size()];
        int i;
        for (i = 0; i < ansNeg.size(); i++) {
            toRet[i] = ansNeg.get(i);
        }
        // and add remaining positive
        for (Integer integer : positive) {
            toRet[i] = integer;
            i++;
        }

        return toRet;
    }
}