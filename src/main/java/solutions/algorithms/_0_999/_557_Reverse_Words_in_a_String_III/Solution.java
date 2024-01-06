package solutions.algorithms._0_999._557_Reverse_Words_in_a_String_III;

class Solution {
    public String reverseWords(String s) {

        char [] arr = s.toCharArray();
        int length = s.length();
        StringBuilder sb = new StringBuilder();
        int mainPtr = 0;
        int start = 0;
        int end;
        while(mainPtr < length) {
            if(arr[mainPtr] == ' ' || mainPtr == length-1) {
                if(mainPtr == length-1) {
                    end = mainPtr;
                } else {
                    end = mainPtr-1;
                }
                while(end >= start) {
                    sb.append(arr[end--]);
                }
                if(mainPtr != length-1) {
                    sb.append(' ');
                }
                start = mainPtr+1;
            }
            mainPtr++;
        }
        return sb.toString();
    }
}
