package solutions.algorithms._0_999._43_Multiply_Strings;

import java.util.ArrayList;
import java.util.List;

class Solution {

    /*
    I could iterate in reverse order through both strings
    like in regular school multiplication (example below)
    multiply 2 integers (I can get them from characters) and carry over the rest forward (oor rather backward)
    and if anything is left in one of the strings, I can just add it

        123
        456
    -------
        738
       615
      492
   --------
      56088
     */
    public String multiply(String num1, String num2) {

        char[] numArr1 = num1.toCharArray();
        char[] numArr2 = num2.toCharArray();

        List<List<Integer>> intsToAdd = new ArrayList<>();
        for (int j = num2.length() - 1; j >= 0; j--) {
            int reminder = 0;
            List<Integer> newList = new ArrayList<>();
            for (int i = numArr1.length - 1; i >= 0; i--) {
                char c1 = numArr1[i];
                char c2 = numArr2[j];
                int i1 = c1 - 48;
                int i2 = c2 - 48;

                int sum = (i1 * i2) + reminder;
                newList.add(sum % 10);
                reminder = sum / 10;
            }
            if(reminder != 0) {
                newList.add(reminder);
            }
            intsToAdd.add(newList);
        }

        // here I have to add them including offset - f.ex index 2 for list 0 == index 1 for list 1 and index 0 for list 2
        // it seems to be listIndex - current index from list 0

        int currentIndex = 0;
        List<Integer> listOfDigits = new ArrayList<>();
        boolean addedSomething = true;
        int remainder = 0;
        while(addedSomething) {
            addedSomething = false;
            int sum = 0;
            for (int listIdx = 0; listIdx < intsToAdd.size(); listIdx++) {

                int idxToCheck = currentIndex - listIdx;
                if(idxToCheck >=0 && idxToCheck < intsToAdd.get(listIdx).size()) {
                    addedSomething = true;
                    sum += intsToAdd.get(listIdx).get(idxToCheck);
                }
            }
            int totalSum = sum + remainder;
            int toSave = totalSum % 10;
            listOfDigits.add(toSave)  ;
            remainder = totalSum / 10;
            currentIndex++;
        }
        if(remainder > 0) {
            listOfDigits.add(remainder);
        }


        StringBuilder sb = new StringBuilder();
        boolean wasNoZero = false;
        for (int i = listOfDigits.size() - 1; i >= 0; i--) {
            int digit = listOfDigits.get(i);
            if(digit == 0) {
                 if(wasNoZero) {
                     sb.append(digit);
                 }
            } else {
                wasNoZero = true;
                sb.append(digit);
            }
        }
        if(sb.isEmpty()) {
            return "0";
        }
        return sb.toString();
    }
}