package solutions.algorithms._0_999._895_Maximum_Frequency_Stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/*
    I can keep a separate stack for each frequency, when I push 5 and then 7, I add them to the stack for freq 1
    1: [5, 7]
    when I push another 5 I have
    1: [5, 7]
    2: [5]
    then 7:
    1: [5, 7]
    2: [5, 7]
    then 4:
    1: [5, 7, 4]
    2: [5, 7]
    then 5
    1: [5, 7, 4]
    2: [5, 7]
    3: [5]
    When I pop, I return from the stack with the highest frequency - I need to track that number - for that I can keep an int variable
    that I update whenever I push an element with a higher frequency, and when I pop, I check if there is still something left in the stack
    I popped from
 */
class FreqStack {

    private final Map<Integer, Integer> valToFreq;
    private final Map<Integer, Stack<Integer>> freqToStack;
    private int maxFreq;

    public FreqStack() {
        this.valToFreq = new HashMap<>();
        this.freqToStack = new HashMap<>();
        this.maxFreq = 0;
    }

    public void push(int val) {
        Integer i = valToFreq.getOrDefault(val, 0);
        int newFreq = i + 1;
        Stack<Integer> stackToAdd = freqToStack.getOrDefault(newFreq, new Stack<>());
        stackToAdd.push(val);
        freqToStack.put(newFreq, stackToAdd);
        valToFreq.put(val, newFreq);
        if (newFreq > maxFreq) {
            maxFreq = newFreq;
        }
    }

    public int pop() {
        Stack<Integer> stackForMaxFreq = freqToStack.get(maxFreq);
        Integer valueToReturn = stackForMaxFreq.pop();
        valToFreq.put(valueToReturn, maxFreq - 1);
        if (stackForMaxFreq.isEmpty()) {
            // nothing left
            // commented out because I don't have to delete it
            // freqToStack.remove(maxFreq);
            maxFreq--;
        }
        return valueToReturn;
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */